import java.util.*;
class DoWhile{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number");
        int n=scan.nextInt();

        do { 
            System.out.println(n);
            n=n+n;
        } while (n<=1000);

    }
}