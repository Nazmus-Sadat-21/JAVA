import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 13 && age <= 17) {
            System.out.println("You are a teen.");
        } 
		else if (age >= 18 && age <= 30) {
            System.out.println("You are an adult.");
        } 
		else if (age >= 31 && age <= 59) {
            System.out.println("You are in middle age.");
        } 
		else{
            System.out.println("You are a senior.");
        } 
	}
}
	  
	
	
	
	
	
	
	