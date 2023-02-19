import java.util.Scanner;
class VovelConsonant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character : ");
        String str = in.nextLine();

        switch (str) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(str + " is a Vowel");
                break;
            
            default:
                System.out.println(str + " is a Consonant");
                break;
        }
       
        
        in.close();
    }
}