package com.mobile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Mobile Brand:");
        String brandName = scanner.nextLine();
        MobileBrand mobileBrand = new MobileBrand(brandName);

        while (true) {
            System.out.println("1.Add Mobile\n2.Delete Mobile\n3.Display Mobiles\n4.Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter mobile details (referenceId,modelName,displaySize,price,launchedDate):");
                    String mobileDetails = scanner.nextLine();
                    Mobile mobile = Mobile.createMobile(mobileDetails);
                    if (mobile != null) {
                        mobileBrand.addMobileToMobileBrand(mobile);
                    } else {
                        System.out.println("Invalid mobile details.");
                    }
                    break;

                case 2:
                    System.out.println("Enter the reference id of the mobile to be deleted:");
                    String referenceId = scanner.nextLine();
                    mobileBrand.removeMobileFromMobileBrand(referenceId);
                    break;

                case 3:
                    mobileBrand.displayMobiles();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
