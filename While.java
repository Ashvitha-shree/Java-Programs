import java.util.*;
class While{
    public static void main(String[] args) {
       Random rand = new Random();
       int num= 0;
       while(num !=5){
        num= rand.nextInt(11);
        System.out.println(num);
       }


    }}
