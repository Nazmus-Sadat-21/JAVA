class Book{
   private String aurthorname;
   private double price;
   private int serialnumber;
   
   public Book(){}
   public Book(String aurthorname,double price,int serialnumber){
      this.aurthorname=aurthorname;
	  this.price=price;
	  this.serialnumber=serialnumber;
   }   
   public void settname(String aurhorname){
      this.aurthorname=aurthorname;
   }
   public String getname(){
      return aurthorname;
   }
   public void setprice(double price){
      this.price=price;
   }
   public double getprice(){
      return price;
   }
   public void setnumber(int serialnumber){
      this.serialnumber=serialnumber;
   }
   public int getnumber(){
      return serialnumber;
   }
   public void show(){
      System.out.println("Aurthor Name : "+aurthorname);
	  System.out.println("Price : "+price);
	  System.out.println("Serial no : "+serialnumber);
   }
   
}
class Library{
   private int personid;
   private String sex;
   Book books[];
   public Library(){}
   public Library(int personid,String sex,int sizeOfArray){
       this.personid=personid;
	   this.sex=sex;
	   books=new Book[sizeOfArray];
   }
   public void setid(int persinid){
       this.personid=personid;
   }
   public int getid(){
		return personid;
   }
   public void setsex(String sex){
	   this.sex=sex;
   }
   public String getsex(){
	   return sex;
   }
   
   public void showallbooks(){
      for(int i=0;i<books.length;i++){
	      if(books[i]!=null){
		     System.out.println("Person ID : "+personid);
			 System.out.println("Sex : "+sex);
			 books[i].show();
		  }
	  }
   }
   
   public void insertbook(Book b1){
      int flag=0;
	  for(int i=0;i<books.length;i++){
	      if(books[i]==null){
		     books[i]=b1;
			 flag=1;
			 break;
		  } 
	  }
	  if(flag==1){
	    System.out.println("BOOK INSERTED!");
	  }
	  else{
	    System.out.println("NOT INSERTED!");
	  }
   }
   
   public void removebook(Book b2){
      int flag=0;
	  for(int i=0;i<books.length;i++){
	      if(books[i]==b2){
		     books[i]=null;
			 flag=1;
			 break;
		  } 
	  }
	  if(flag==1){
	    System.out.println("BOOK REMOVED!");
	  }
	  else{
	    System.out.println("NOT REMOVED!");
	  }
   }
   
   
   public void empty(){
	  int count=0;
	  for(int i=0;i<books.length;i++){
		  if(books[i]==null){
			  count++;
		  }	   
     }
     if(count>0){
	   System.out.println("Empty slot : "+count);
     }
     else{
		System.out.println("NO EMPTY SLOT!");
     } 	  
  } 

  
}

public class Librarysystem{
  public static void main(String[] args){
    Book bk = new Book("MD NAZMUS SADAT",346.65,5);
	Book bk1 = new Book("MD SHORIF",456.05,2);
	Book bk2 = new Book("MD TAHA",340.056,7);
	Book bk3 = new Book("MD SAADMAN",546.15,4);
	
	Library l1 = new Library(1244,"Male",4);
	
	l1.insertbook(bk);
	l1.insertbook(bk1);
	l1.insertbook(bk2);
	l1.insertbook(bk3);
	l1.showallbooks();
	System.out.println("------------");
	l1.removebook(bk1);
	l1.removebook(bk);
	l1.showallbooks();
	System.out.println("------------");
	l1.empty();
  }
}