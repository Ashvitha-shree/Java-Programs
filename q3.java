import java.util.Scanner;
class q3{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        float score= scan.nextInt();//    double score= scan.nextDouble();
       
        scan.nextLine();
        String dept=scan.nextLine();
        System.out.println("My Name is "+name);
        System.out.println("My age is "+score/10+"/10");
        System.out.print("My Department is"+dept);

    }
}