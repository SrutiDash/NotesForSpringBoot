public class loop4 {
    public static void main(String[] args) {
        System.out.println("even numbers in do while loop : ");
        int i=2;
        do{
          System.out.println(i);
          i=i+2;
        }while(i<=10);

        System.out.println("odd numbers in do while loop : ");
        int j=1;
        do{
          System.out.println(j);
          j=j+2;
        }while(j<=10);
        //do while loop will run atleast once even if the condition is true or false
    }
}
