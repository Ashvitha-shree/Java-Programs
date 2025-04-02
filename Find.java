import java.util.*;

 public class Find{
    
    String EvenorOdd(int a){
       if (a%2==0){
        return "even";
       }
       else{
        return "odd";
       }
        
    }
    
    public static void main(String[] args){
      
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number");
        int num=scan.nextInt();
        
        Find obj1 = new Find();
        System.out .println(obj1.EvenorOdd(num));
       
    }
}