class methodoverloading{
    public int add(int a,int b){
        System.out.println(a+b);

        return a+b;    }
    public int add(int a,int b,int c){
        System.out.println(a+b+c);
        return a+b+c;    }
     public int add(int a){
        System.out.println(a);
        return a;    }
    public void add(String n){
        System.out.println(n);

      
       }
        public static void main(String[] args) {
            methodoverloading obj=new methodoverloading();
            System.out.println(obj.add(1,2));
            System.out.println(obj.add(1,2,3));
            System.out.println(obj.add(1));
            obj.add("Ash");
            
        }
}