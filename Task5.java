import java.util.Scanner;
public class Task5{

	public static void main(String[] args){
		
    Scanner input = new Scanner (System.in);
	float f;
	float c;
	System.out.print("Farenhit = ");
	f = input.nextFloat();
	
	c=((f-32)*5/9);
	
	System.out.print("The Result in Celcius is = "+c);


	}
}