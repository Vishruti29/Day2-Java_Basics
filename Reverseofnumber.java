import java.util.Scanner;
class Reverseofnumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = in.nextInt();

        int reverse = 0;

        while(a != 0)   
        {  
            int remainder = a % 10;  
            reverse = reverse * 10 + remainder;  
            a = a/10;  
        }  
        System.out.println("The reverse of the given number is: " + reverse);   
            
        in.close();
    }
}