class Student{
  int roll;
  String  name;
  String semes;
  public Student( String name,int roll,String semes){
    this.name=name;
	this.roll=roll;
	this.semes=semes;              
  }
  public void input(){
    System.out.println("Your Information");
  }
}

class Cg extends Student{
   
  float cgpa;
  
  public Cg(  String name,int roll,String semes,float cgpa){
       
	  super(name,roll,semes);
	  this.cgpa=cgpa;
  }
  public void display(){
    System.out.println(name);
	System.out.println(roll);
	System.out.println(semes);
	System.out.println(cgpa);
  }
}

public class Info{

  public static void main(String[] args){
    Cg c = new Cg( "Nazmus Sadat",53534,"Fall 23-24",3.50f);
	
	c.input();
	c.display();
	
	}


}