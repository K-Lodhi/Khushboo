package com.khushi;

import java.util.Scanner;

public class CricketMatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

       
        int totalRuns = sc.nextInt();

        int numberOfFours = sc.nextInt();
        int numberOfSixes = sc.nextInt();

        int runsFromBoundaries = (numberOfFours * 4) + (numberOfSixes * 6);
        int runsByRunning = totalRuns - runsFromBoundaries;

        double runningPercentage = ((double) runsByRunning / totalRuns) * 100;
        
        System.out.printf("%.2f%n", runningPercentage);

        sc.close();
    }

}
