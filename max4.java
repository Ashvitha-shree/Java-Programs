 import java.util.*;
class max4{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the num1:");
        int a=scan.nextInt();
        System.out.print("Enter the num2:");
        int b=scan.nextInt();
        System.out.print("Enter the num3:");
        int c=scan.nextInt();
        System.out.print("Enter the num4:");
        int d=scan.nextInt();
        if (a>b && a>c && a>d){
            System.out.print(a+ " a is Greater");
        }
        else if (b>a && b>c && b>d) {
            System.out.print(b+" b is Greater");

        }
        else if(c>a && c>b && c>d){
            System.out.print(c+ " c is greater");
        }
        else{
           System.out.print(d+ " d is greater");
       }
    }
}