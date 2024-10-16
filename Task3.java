import java.util.Scanner;
public class Task3{

	public static void main(String[] args){
	
	Scanner input = new Scanner (System.in);
	int day;
	System.out.print("Enter any day : ");
	day = input.nextInt();
	
	switch(day){
		
		case 1: 
		  System.out.print("Saturday");
		  break;
		case 2: 
		  System.out.print("Sunday");
		  break;
        case 3: 
		  System.out.print("Monday");
		  break;
        case 4: 
		  System.out.print("Tuesday");
		  break;
        case 5: 
		  System.out.print("Wednesday");
		  break;
        case 6: 
		  System.out.print("Thursday");
		  break;
        case 7: 
		  System.out.print("Friday");
		  break;		  
		default:
		   System.out.print("Invalid Number");
            		
	  }
	}
}	