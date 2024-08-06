package oops_demo;

public class User {
    public static void main(String[] args){
        B obj1 = new B(1);
        System.out.println(obj1.temp);
    }
}
class A{
    public A(){
        System.out.println("A");
    }
    public A(int i){
        System.out.println("A"+i);
    }
}
class B extends A{
    int temp = 10;
    public B(){
        System.out.println("B");
    }
    public B(int x){
        super(x);
        System.out.println("B"+x);
    }
}
