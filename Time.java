import java.util.*;
class Time{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the hour");
        int hh=scan.nextInt();
        System.out.print("Enter the minute");
        int mm=scan.nextInt();
        System.out.print("Enter the Second");
        int ss=scan.nextInt();
        if ((hh>=0&&hh<24)&&(mm>=0 && mm<60)&&(ss>=0 && ss<60)){
            System.out.printf("The given time %d:%d:%d is valid",hh,mm,ss);
        }
        else{
            System.out.printf("The given time %d:%d:%d is not valid",hh,mm,ss);
        }
        

    }
}