// Keep asking the user for a password until they enter the correct one
// → Keep showing: “Enter password: ” → stop only when correct password is entered.

import java.util.Scanner;

public class infiniteLoop1 {
    public static void main(String[] args) {
        String password;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("enter your password : ");
            password = input.nextLine();
            if(!password.equals("password123")){
                System.out.println("enter correct password");
            }
        }while(!password.equals("password123"));
    }
}

//here .equals is used as we're checking strings