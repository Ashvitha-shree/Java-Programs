import java.util.*;
public class Personal{
    String getname(String name){
        return name ;
   
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        Personal obj1= new Personal();
        System.out.print(obj1.getname(name));
        


    }
}