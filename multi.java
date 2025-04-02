import java.util.*;
class multi{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=scan.nextInt();
        System.out.print("Enter the number for which u want the multiplication table");
        int m=scan.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i +"x"+ m + "="+ (m*i));
        }
        
    }}
