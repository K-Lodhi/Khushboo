package com.Mobile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            System.out.println("Enter mobile 1 detail:");
            String mobile1Details = sc.nextLine();
            MobileBrand mobile1 = createMobileFromInput(mobile1Details, sdf);

            System.out.println("Enter mobile 2 detail:");
            String mobile2Details = sc.nextLine();
            MobileBrand mobile2 = createMobileFromInput(mobile2Details, sdf);

            System.out.println("Mobile 1");
            System.out.println(mobile1);
            System.out.println();
            System.out.println("Mobile 2");
            System.out.println(mobile2);

            if (mobile1.equals(mobile2)) {
                System.out.println("Mobile 1 is same as Mobile 2");
            } else {
                System.out.println("Mobile 1 and Mobile 2 are different");
            }
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        }

        sc.close();
    }

    private static MobileBrand createMobileFromInput(String input, SimpleDateFormat sdf) throws ParseException {
        String[] parts = input.split(",");
        String referenceId = parts[0].trim();
        String modelName = parts[1].trim();
        Double displaySize = Double.parseDouble(parts[2].trim());
        Double price = Double.parseDouble(parts[3].trim());
        Date launchedDate = sdf.parse(parts[4].trim());

        return new MobileBrand(referenceId, modelName, displaySize, price, launchedDate);
    }

	}

