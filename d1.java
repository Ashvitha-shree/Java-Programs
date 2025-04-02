import java.util.Scanner;
public class d1 {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      String recipientName=scan.nextLine();
    
      String occasion=scan.nextLine();
     
      String message=scan.nextLine();
    
      String Name=scan.nextLine();
      
      System.out.printf("To: %s,Happy %s!,%s,From,,%s",recipientName,occasion,message,Name);
          }
}
