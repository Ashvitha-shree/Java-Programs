import java.util.Scanner;
class ternary{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number");
        int a= scan.nextInt();
        System.out.print("Enter the number");
        int b= scan.nextInt();
        int result= a>b?a:b;
        System.out.print(result+" is Greater");
        

    }

}