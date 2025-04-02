import java.util.Scanner;
class nestedfor{
    public static void main(String args[]){
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the Number");
      int n=scan.nextInt();
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("*");
      }
      System.out.println();
      }

    }
}