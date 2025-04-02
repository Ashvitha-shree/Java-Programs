import java.util.*;
class maxarraay{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
              arr[i] =scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second minimum term: "+arr[1]);
        System.out.print("Second maximum term: "+arr[n-2]);
        
    }}
    