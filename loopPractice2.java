import java.util.Scanner;

public class loopPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = input.nextInt();

        System.out.println("Multiplication table of "+num+" is : ");
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
}
