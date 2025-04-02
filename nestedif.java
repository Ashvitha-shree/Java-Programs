import java.util.Scanner;
class nestedif{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the mark");
        int mark=scan.nextInt();
        if (mark>=0 && mark<=100){
            if(mark>=90){
                System.out.print("Your Grade is O");
            }
            else if(mark>=75){
                System.out.print("Your Grade is A");
            }
            else if(mark>=50){
                System.out.print("Your Grade is B");
            }
            else if(mark>=35){
                System.out.print("Your Grade is C");
            }
            else {
                System.out.print("Your Grade is D and Not got a pass mark");
            }}
         else{
            System.out.print("You Entered a invalid mark");
        }
        



    }
}