package LoadingAndRiding;



class A{
     void run()
    {
        System.out.println("Class A");
    }
}

public class Overriding extends A {
    void run() {
        System.out.println("Class over");
    }



    public static void main(String[] args) {
        A a=new A();

        A c=new Overriding();
        A b=new A();
         c.run();

    }
}
