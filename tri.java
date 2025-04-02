
import java.util.Scanner;

class tri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
    
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a valid triangle");
            return;  
        }

        
        if (a == b && b == c) {
            System.out.println("Equilateral");
        }
        
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        }
        
        else {
            System.out.println("Scalene");
        }
        int hypotenuse = Math.max(a, Math.max(b, c));
        int sumOfSquares = 0;
        if (hypotenuse == a) {
            sumOfSquares = b * b + c * c;
        } 
        else if (hypotenuse == b) {
            sumOfSquares = a * a + c * c;
        }
        else {
            sumOfSquares = a * a + b * b;
        }
        if (hypotenuse * hypotenuse == sumOfSquares) {
            System.out.println("Right triangle");
        }
    }
}

