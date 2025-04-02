
import java.util.Scanner;

class ifelse{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        scan.nextLine();
        String x=scan.nextLine();

        if (a>=b){
            System.out.println("Both are eqaul");
        }
        else{
            System.out.println("Not eqaul");
        }
        if (x.equals("wins")){
            System.out.print("cup is mine");
        }
        else {
            System.out.print("no Cup");
        }

    }
}