import java.util.Scanner;
public class Array{

   public static void main(String[] args){
     
	 int [] marks={10,20,30,40};
	 
	  for(int i=0;i< marks.length;i++){
	   System.out.println(marks[i]);
	  }
      int l= marks.length;
	  System.out.println("Length is = "+l);
	  
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter any number = ");
	  int n = input.nextInt();
      int [] arr = new int[n];
      
	  for( int i=0; i<n ;i++){
		  System.out.print("Enter " + i+" number : ");
		  arr[i]=input.nextInt();
	  }
	  System.out.println("Result : ");
	  for(int i=0;i<n;i++){
	   System.out.println(arr[i]);
	 }
	 	    
   }

}