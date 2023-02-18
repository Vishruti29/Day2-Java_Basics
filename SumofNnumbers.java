import java.util.Scanner;
class SumofNnumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = in.nextInt();

        int sum = 0;  
        for(int i = 1; i <= a; i++)  
        {  
            sum = sum + i;  
        }  

        System.out.println("Sum of " + a + " is " + sum );  
            
        in.close();
    }
}