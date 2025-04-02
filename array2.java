import java.util.*;
class array2{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int  n=scan.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
              arr[i] =scan.nextInt();
        }
        
        for (int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
        }
        System.out.println();
        if (n%2==0){
            System.out.print(arr[(n-1)/2]);
            System.out.println(arr[n/2]);
            
        }
        else{
          System.out.print(arr[n/2]);
        }
        
    }}
