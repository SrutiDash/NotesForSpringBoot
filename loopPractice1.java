import java.util.Scanner;

public class loopPractice1 {
    public static void main(String[] args) {
        //sum of first n natural numbers :
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = input.nextInt();

        System.out.println("sum of first "+num+" natural numbers is : ");

        int sum = 0;
        for(int i=1;i<=num;i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}


//1 2 3 4 5 
//a + b = sum;
//sum = a
//b = sum + b;
//sout(sum)