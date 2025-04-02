


//get name,age,address
import java.util.*;
class q1{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        int age= scan.nextInt();
        scan.nextLine();
        String address=scan.nextLine();
        System.out.println("My Name is "+name);
        System.out.println("My age is "+age);
        System.out.print("My address is "+address);

    }
}