
import java.util.Scanner;

class dublicatearray{
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++)
            if(arr[i]==arr[j]){
                  System.out.println("Dublicate "+arr[i]);
                  break;
            }
        }
    }
}