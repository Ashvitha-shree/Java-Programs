
import java.util.Scanner;

class division{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the number:");
        int b=a.nextInt();
        System.out.print("Enter the divder");
        int c=a.nextInt();
        int d=0;
        while(b>0)
        {
            b-=c;
            d++;
        }
        System.out.print(d);
    }
}