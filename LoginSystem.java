import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String validUsername = "admin";
        String validPassword = "12345";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        input.close();
    }
}