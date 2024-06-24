import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the reference Id to be validated:");
        String referenceId = scanner.nextLine();
        
        if (validateReferenceId(referenceId)) {
            System.out.println("Reference Id is valid");
        } else {
            System.out.println("Reference Id is invalid");
        }
    }

    public static Boolean validateReferenceId(String referenceId) {
        String regex = "#[A-Z]{2,3}(\\s[0-9]{2})?(\\s[A-Z0-9]{2,6}-[0-9]{2,4})";
        return referenceId.matches(regex);
    }
}
