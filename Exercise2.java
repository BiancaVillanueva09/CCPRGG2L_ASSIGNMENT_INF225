import java.util.Scanner;

public class Exercise2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        drive("Car");
        scan.close();
    }

    static void drive(String vehicle) {

        System.out.println("Driving!");
        taste(vehicle);

        String feedback = getFeedBack(vehicle);

        if (feedback.equals("no")) {
            continuedrivinglessons(vehicle);
            drive(vehicle);
        } else if (feedback.equals("yes")) {
            passed(vehicle);
        }
    }

    static void taste(String food) {
        System.out.println("Testing driving skills");
    }

    static String getFeedBack(String food) {
        System.out.println("Is the driving skills good enough? (Enter \"yes\" or \"no\")");
        String feedback = scan.next();
        return feedback;
    }

    static void continuedrivinglessons(String vehicle) {
        System.out.println("Enter skills that needs improvement:");
        scan.nextLine();
        String skills = scan.nextLine();
        System.out.println("Practicing skills. Improving " + skills);
    }

    static void passed(String food) {
        System.out.println("Passed test! Good to go.");
    }

}
