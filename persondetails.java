package orghandson;


	import java.util.Scanner;

	public class persondetails {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter First Name: ");
	        String firstName = scanner.nextLine();

	        System.out.print("Enter Last Name: ");
	        String lastName = scanner.nextLine();

	        System.out.print("Enter Gender (M/F): ");
	        String gender = scanner.nextLine();

	        System.out.print("Enter Age: ");
	        int age = scanner.nextInt();

	        System.out.print("Enter Weight: ");
	        double weight = scanner.nextDouble();

	        System.out.println("\nPerson Details:");
	        System.out.println("____________");
	        System.out.println("First Name: " + firstName);
	        System.out.println("Last Name: " + lastName);
	        System.out.println("Gender: " + gender);
	        System.out.println("Age: " + age);
	        System.out.println("Weight: " + weight);

	        
	        scanner.close();
	    }
		

}
