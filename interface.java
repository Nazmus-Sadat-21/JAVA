interface ISports{
    void type();
    // Here we didn't put abstract keyword but by default it will count as 
    // public abstract void fun()
}
class Messi implements ISports{
    // single interface
    public void type(){ 
        System.out.println("Messi plays Football");
    }
}
 
interface IAge{
    void age();
}
class Tamim implements ISports, IAge{
    // Multiple Interface
    public void type(){ 
        System.out.println("Tamim plays Cricket");
    }
    public void age(){
        System.out.println("His age is 36");
    }
}
class Fizz{
    public void display(){
        System.out.println("This is Fizz, team mate of Shakib");
}
}
 
class Shakib extends Fizz implements ISports, IAge{
   public void type(){ 
       // Inheritance and Multiple Interface
        System.out.println("Shakib plays Cricket");
    }
    public void age(){
        System.out.println("His age is 34");
    }
}
public class Interface{
    public static void main(String[] args){
        Messi m = new Messi();
        m.type();
        
        System.out.println("----------------------");
        
        Tamim t = new Tamim();
        t.type();
        t.age();
        
        System.out.println("----------------------");
        
        Shakib s = new Shakib();
        t.type();
        t.age();
        s.display();
    }
}