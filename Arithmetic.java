import java.util.Scanner;
class Arithmetic 
{

    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = in.nextInt();
        System.out.println("Enter the value of b : ");
        int b = in.nextInt();
        System.out.println("Enter the value of c: ");
        int c = in.nextInt();

        System.out.println("The Answer of (a+b*c) is : "+(a+b*c));
        System.out.println("The Answer of (c+a/b) is : "+(c+a/b));
		System.out.println("The Answer of (a%b+c) is : "+(a%b+c));
		System.out.println("The Answer of (a*b+c) is : "+(a*b+c));
        
        in.close();
    }
}