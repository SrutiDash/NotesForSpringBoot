// Keep taking numbers from the user and print their square
// → Example: User inputs 5 → print 25; input 3 → print 9; loop runs forever.

import java.util.Scanner;

public class infiniteLoop2 {
    public static void main(String[] args) {
        for(; ;){    
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = input.nextInt();
            int sqr = num*num;
            System.out.println("Square of "+num+" is "+sqr);
        }        
    }
}
