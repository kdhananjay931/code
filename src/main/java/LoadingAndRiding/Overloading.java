package LoadingAndRiding;

public class Overloading {

    void run(){
        System.out.println("Without");

    }
    void run(int speed,String Color){
        System.out.println("With Para");

    }

    public static void main(String[] args) {
        Overloading overloading=new Overloading();
        overloading.run(13,"Black");

    }
}
