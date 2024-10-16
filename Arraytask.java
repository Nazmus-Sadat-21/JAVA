public class Arraytask{

  public static void main(String[] args){
  
    double [] num ={1.1,2.2,3.3,4.4,5.5};
	double sum=0;
	for( int i=0; i<num.length;i++){
	  sum = sum+num[i];
	}
	 double avg = sum/num.length;
	 System.out.println("The result is = "+avg);
  }

}

 