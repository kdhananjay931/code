package Oops.inheritance;

public class A {

    void run(){
        System.out.println("run");
    }
    void walk(){
        System.out.println("walk");

    }

}

class B extends A{
    void running(){
        System.out.println("running");
    }
    void run(){
        System.out.println("B running");
    }



    public static void main(String[] args) {
        B b= new B();
        A a=new A();
        a.run();
    }
}
