import java.util.Scanner;
class MonthName 
{

    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Month in number : ");
        String mon_no = in.nextLine();

        switch (mon_no)
		{
            case "1": System.out.println(mon_no + " - "+ "January"); break;
            case "2": System.out.println(mon_no  +" - " + "February"); break;
            case "3": System.out.println(mon_no  +" - " + "March"); break;
            case "4": System.out.println(mon_no  +" - " + "April"); break;
            case "5": System.out.println(mon_no  +" - " + "May"); break;
            case "6": System.out.println(mon_no  +" - " + "June"); break;
            case "7": System.out.println(mon_no  +" - " + "July"); break;
            case "8": System.out.println(mon_no  +" - " + "August"); break;
            case "9": System.out.println(mon_no  + " - " + "September"); break;
            case "10": System.out.println(mon_no + " - "  + "October"); break;
            case "11": System.out.println(mon_no + " - "  + "November"); break;
            case "12": System.out.println(mon_no + " - "  + "December"); break;
            
            default:
			{
                System.out.println("Please enter valid month ");
			}
        }
       
        
        in.close();
    }
}