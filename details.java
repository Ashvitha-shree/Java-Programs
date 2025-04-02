import java.util.*;
public class details{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name=scan.nextLine();
        System.out.print("Enter Your age : ");
        int age =scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Your Initial : ");
        char i= scan.next().charAt(0);
        scan.nextLine();
        System.out.print("Enter Your Department : ");
        String Department=scan.nextLine();
        System.out.print("Enter Your Sem 1 percentage : ");
        float percentage =scan.nextFloat();
        System.out.println("My  name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My initial is "+i);
        System.out.println("My Department is " + Department);
        System.out.println("My percentage in sem1 is "+percentage);
       
    }
}