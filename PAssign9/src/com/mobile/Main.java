package com.mobile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException{
		
		Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Enter the number of mobiles:");
        int numberOfMobiles = Integer.parseInt(scanner.nextLine());
        List<Mobile> mobileList = new ArrayList<>();

        for (int i = 0; i < numberOfMobiles; i++) {
            String[] mobileDetails = scanner.nextLine().split(",");
            String referenceId = mobileDetails[0];
            String modelName = mobileDetails[1];
            Double displaySize = Double.parseDouble(mobileDetails[2]);
            Double price = Double.parseDouble(mobileDetails[3]);
            Date launchedDate = sdf.parse(mobileDetails[4]);

            mobileList.add(new Mobile(referenceId, modelName, displaySize, price, launchedDate));
        }

        System.out.println("Enter a search type:");
        System.out.println("1.By Model Name");
        System.out.println("2.By Display Size");
        int choice = Integer.parseInt(scanner.nextLine());

        MobileBO mobileBO = new MobileBO();
        List<Mobile> result = new ArrayList<>();

        switch (choice) {
            case 1:
                System.out.println("Enter the Model Name:");
                String modelName = scanner.nextLine();
                result = mobileBO.findMobile(mobileList, modelName);
                break;
            case 2:
                System.out.println("Enter the Display Size:");
                Double displaySize = Double.parseDouble(scanner.nextLine());
                result = mobileBO.findMobile(mobileList, displaySize);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        if (result.isEmpty()) {
            System.out.println("No such mobile is present");
        } else {
            System.out.format("%-15s %-15s %-12s %-8s %s\n", "Reference Id", "Model Name", "Display Size", "Price", "Launched Date");
            for (Mobile mobile : result) {
                System.out.println(mobile);
            }
        }
    }

}
