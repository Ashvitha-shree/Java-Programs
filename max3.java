import java.util.*;
class max3{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the num1:");
        int a=scan.nextInt();
        System.out.print("Enter the num2:");
        int b=scan.nextInt();
        System.out.print("Enter the num3:");
        int c=scan.nextInt();
        if (a>b && a>c){
            System.out.print(a+ " is Greater");
        }
        else if (b>a && b>c) {
            System.out.print(b+" is Greater");

        }
        else{
            System.out.print(c+ " is greater");
        }
    }
}