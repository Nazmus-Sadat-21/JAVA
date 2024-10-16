import java.util.Scanner;
public class Task4{

	public static void main(String[] args){
		
    Scanner input= new Scanner (System.in);
	 int n;
    
    int first = 0;
    int second = 1;
	System.out.print("Enter any number = ");
	n = input.nextInt();
	for (int i = 0; i < n; i++)
     {
        System.out.print(first+",");
        int next = first + second;
        first = second;
        second = next;
     }
  }
}