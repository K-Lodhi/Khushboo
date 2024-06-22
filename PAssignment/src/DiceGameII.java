import java.util.Scanner;

	public class DiceGameII {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Value 1:");
	        int value1 = sc.nextInt();
	        System.out.println("Enter Value 2:");
	        int value2 = sc.nextInt();

	        if (isValidInput(value1) && isValidInput(value2)) {
	            int points = calculatePoints(value1, value2);
	            System.out.println("The points scored is " + points);
	        } else {
	            System.out.println("Invalid Input");
	        }

	        sc.close();
	    }

	    private static boolean isValidInput(int value) {
	        return value >= 0 && value <= 6;
	    }

	    private static int calculatePoints(int value1, int value2) {
	        int sum = value1 + value2;
	        int difference = Math.abs(8 - sum);

	        if (sum < 8) {
	            return difference;
	        } else {
	            return 2 * difference;
	        }
	    }
	}


