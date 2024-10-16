import java.util.Scanner;
public class Arrayp{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = sc.nextInt();
    
    int [] arr = new int[size];
    for(int i=0; i<size; i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("Orginal array: ");
    
    for(int i=0; i<size; i++){
      System.out.print(arr[i]+ "  ");
    }
    
    System.out.print("Largest element: ");
    int largest = arr[0];
    for(int i =1; i<size; i++){
      if(arr[i]> largest){
        largest = arr[i];
      }
    }
    System.out.print(largest);
    
    
    System.out.print("Lowest element: ");
    int lowest = arr[0];
    for(int i =1; i<size; i++){
      if(arr[i]< lowest){
        lowest = arr[i];
      }
    }
    System.out.print(lowest);
    
    
    System.out.println("Reverse order: ");
    for( int i = size-1; i>=0; i--){
      System.out.print(arr[i]+ " ");
    }
    
    
    System.out.println("Sorted order: ");
    for(int i = 0; i<size; i++){
      for (int j =i+1; j<size; j++){
        if(arr[i]> arr[j]){
          
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    }
    for(int i=0; i<size; i++){
      System.out.print(arr[i]+ " ");
    }
    
    
    System.out.println("Descending Sorted order: ");
    for(int i = 0; i<size; i++){
      for (int j =i+1; j<size; j++){
        if(arr[i]< arr[j]){
          
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    }
    for(int i=0; i<size; i++){
      System.out.print(arr[i]+ " ");
    }
  }
}