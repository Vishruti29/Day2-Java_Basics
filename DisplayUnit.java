import java.util.Scanner;
class DisplayUnit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number like 1, 10, 100, 1000 ");
        int a = in.nextInt();

        switch (a) {
            case 1:
                System.out.println("Unit");
                break;
            case 10:
                System.out.println("Tens");
                break;
            case 3:
                System.out.println("Hundreds");
                break;
            case 4:
                System.out.println("Thousand");
        
            default:
                System.out.println("Invalid entry");
                break;

            }
            in.close();
    }
}