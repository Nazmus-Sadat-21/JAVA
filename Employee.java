import java.util.Scanner;
public class Employee{
     
	 String name;
	 private int account ;
	 private int amount;
	 
	 public Employee(String n, int a, int am){	    
	   this.name=n;
	   this.account=a;
	   this.amount=am;   
	 
	 }
	 
     public void display(){
	   System.out.println("Name : "+name) ;
	   System.out.println("Account : "+account); 
	   System.out.println("Amount : "+amount); 
	   
	 }

	 public static void main(String[] args){
	
	 Scanner input= new Scanner (System.in);
	 System.out.print("Enter your name : ");
	 String name =  input.nextLine();
	 System.out.print("Enter your account number : ");
	 int account = input.nextInt();
	 System.out.print("Enter your amount : ");
	 int amount = input.nextInt();
	 
	 Employee output = new Employee(name,account,amount);
	 output.display();
	 
	 
	}

}
