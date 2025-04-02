import java.util.*;
class sumarray{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int n=scan.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
              arr[i] =scan.nextInt();
        }

        for (int i=0;i<n;i++){
             sum+=arr[i];
        }
        System.out.print("Sum of array element is "+sum);
    }}