import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum=0,i=1;
		while(i<=100){
			
			if(i%2==0){
				sum=sum+i;
			}
			
			i++;
		}
        System.out.print("The result is = "+sum);
	}
}
