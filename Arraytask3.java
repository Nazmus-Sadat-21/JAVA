class Student{
  String name;
  int roll;
  double [] marks;
  
  public Student(String name, int roll,double [] marks ){
     this.name=name;
	 this.roll=roll;
	 this.marks=marks;
  }
  public void display(){
      System.out.println("Name : "+name);
	  System.out.println("Roll : "+roll);
	  System.out.print("Marks : ");
	  for( int i=0; i<marks.length;i++){
	    System.out.print(marks[i]+",");
	  }
	  
  }
 
}
public class Arraytask3{
  public static void main(String[] args){
    Student st = new Student("Nazmus Sadat",53534,new double[]{90,90.3,85.6});
	Student st1 = new Student("Jabir Ahmed",53541,new double[]{95,97.3,89.6});
	st.display();
	System.out.println();
	st1.display();
	
  }
}