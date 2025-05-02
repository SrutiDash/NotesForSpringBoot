//1.Print all even numbers till n. 

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        System.out.println("All even numbers till "+num+" are : ");
        for(int i=2;i<=num;i=i+2){
            System.out.println(i);
        }
    }
}
