
import java.util.Scanner;

/*class constructor{
    int a,b,sum;
    constructor(){
        a=4;
        b=5;
        sum=a+b;
    }
    void display(){
        System.out.print(sum);
        }
        public static void main(String[] args) {
            constructor obj=new constructor();
            obj.display();
        }
}*/
class constructor{
    int sum; //int sum,a,b;
    constructor(int x, int y){
        //a=x;b=y;
        sum=x+y;
    }
    void display(){
        System.out.print(sum);
        }
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int x=scan.nextInt();
            int y=scan.nextInt();
            constructor obj=new constructor(x,y);
            obj.display();
        }
}
