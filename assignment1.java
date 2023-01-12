import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        
        // NU Student email address 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter NU Student email address : ");
        String NU_Student_email_address = scan.nextLine();

        Pattern pattern = Pattern.compile("(?=.*[a-z]).{8,}(\\@students.national-u.edu.ph)");
        Matcher matcher = pattern.matcher(NU_Student_email_address);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("Valid NU Student email address");
        } else {
            System.out.println("Invalid NU Student email address");
        }
    
        
        // Philippine mobile phone number
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter Philippine mobile phone number : ");
        String Philippine_mobile_phone_number = scan1.nextLine();

        Pattern pattern1 = Pattern.compile("(\\+63)(?=.*\\d).{10}");
        Matcher matcher1 = pattern1.matcher(Philippine_mobile_phone_number);

        boolean match1 = matcher1.matches();

        if (match1) {
            System.out.println("Valid Philippine mobile phone number");
        } else {
            System.out.println("Invalid Philippine mobile phone number");
        }
    
    }
}
