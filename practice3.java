// 3.	Make a menu driven program. The user can enter 2 numbers, either 1 or 0.  
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).  
// If they enter 0 then stop. 
// If he/ she scores : 
// Marks >=90 -> print “This is Good” 
// 89 >= Marks >= 60 -> print “This is also Good” 
// 59 >= Marks >= 0 -> print “This is Good as well”  	Because marks don’t matter but our effort does. 
// (Hint : use do-while loop but think & understand why) 

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        int num;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("choose a number either 1 to contimue or 0 to stop : ");
            num = input.nextInt();
            if(num==1){
                System.out.println("Enter your marks : ");
                int marks = input.nextInt();
                if(marks>=90){
                    System.out.println("This is Good");
                }else if(marks<=89 && marks>=60){
                    System.out.println("“This is Good” ");
                }else if(marks<=59 && marks>=0){
                    System.out.println("This is Good as well");
                }else{
                    System.out.println("Inva;id marks : ");
                }
            }
        }while(num!=0);
        System.out.println("Program stopped");
    }
}


