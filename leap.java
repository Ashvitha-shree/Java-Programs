import java.util.*;
class leap{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in); 
        int n= scan.nextInt();
        if ((n%4==0 && n%100!=0)||n%400==0){
             System.out.print("Leap year");
        }
        else{
            System.out.print(" not Leap year");
        }
    }
}