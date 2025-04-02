/*public class Addition{
    int a=20;
    int b=30;
    void sum(){
        System.out .println(a+b);
    }
    void sub(){
        System.out .print(a-b);
    }

    public static void main(String[] args){
        Addition obj1=new Addition();
        Addition obj2=new Addition();
        obj1.sum();
        obj2.sub();
    }
}*/

/*public class Addition{
    static int a=20;
    static int b=30;
    static void sum(){
        System.out .println(a+b);
    }
   static void sub(){
        System.out .print(a-b);
    }

    public static void main(String[] args){
        Addition obj1=new Addition();
        Addition obj2=new Addition();
        obj1.sum();
        obj2.sub();
    }
}*/

public class Addition{
    static int a=20;
    static int b=30;
    void sum(){
        System.out .println(a+b);
    }
    static void sub(){
        System.out .print(a-b);
    }

    public static void main(String[] args){
        Addition obj1=new Addition();
        
        obj1.sum();
        sub();
    }
}