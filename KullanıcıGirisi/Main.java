package KullanıcıGirisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String DefaultUserName = "patika"; // Default UserName
        String DefaultPassWord = "java123"; // Default PassWord

        String InputUserName; // Entered UserName
        String InputPassWord; // Entered PassWord
        boolean isAuthenticated = false; // Checking the equality of old and new password

        // Data input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: "); // Input userName
        InputUserName = input.nextLine();

        System.out.print("Enter your password: "); // Input passWord
        InputPassWord = input.nextLine();

        // Log in if username and password are correct
        if (InputUserName.equals(DefaultUserName) && InputPassWord.equals(DefaultPassWord)) {

            System.out.println("Login Successfully");
        }

        // If the password is incorrect, ask if you want to reset it.
        if (InputUserName.equals(DefaultUserName) && !InputPassWord.equals(DefaultPassWord)) {

            System.out.println("Wrong password");
            System.out.print("Do you want to reset the password? (y/n): ");
            String answer = input.nextLine();
            if ("y".equals(answer)) {
                String newPassword;
                do {
                    System.out.print("Enter a new password (cannot be the same as the old password): ");
                    newPassword = input.nextLine();

                    if (!newPassword.equals(DefaultPassWord)) {
                        DefaultPassWord = newPassword; // New passWord Save.
                        System.out.println("Password has been reset successfully.");
                        break; // Break the loop when password is changed

                    } else {
                        System.out.println("New password cannot be the same as the old password. Please try again.");
                    }
                    // If the new password entered is the same as the old password, enter it again.
                } while (newPassword.equals(DefaultPassWord));
            }
        }

    }

}
