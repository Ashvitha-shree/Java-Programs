
import java.util.*;
public class D2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int ticketID=scan.nextInt();
        scan.nextLine();
        String customerName=scan.nextLine();
        String issueDescription=scan.nextLine();
        String priorityLevel=scan.nextLine();
        System.out.printf("Support Ticket:\n");
        System.out.printf("Ticket ID: %d\n",ticketID);
        System.out.printf("Customer Name: %s\n",customerName);
        System.out.printf("Issue Description: %s\n",issueDescription);
        System.out.printf("Priority Level: %s\n",priorityLevel.toUpperCase());
    }
}
