public class Multiplication {


    public synchronized void multiply(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

 class  multiplying5 extends Thread{
        Multiplication ml;

    public multiplying5(Multiplication ml) {
        this.ml = ml;
    }
    public  void run(){
        ml.multiply(5);


    }
 }

class  multiplying7 extends Thread{
    Multiplication ml;

    public multiplying7(Multiplication ml) {
        this.ml = ml;
    }
    public  void run(){
        ml.multiply(7);


    }
}

class job {
    public static void main(String[] args) {
        Multiplication mpl = new Multiplication();
        Multiplication mpx = new Multiplication();
        Thread multiplying5  = new multiplying5(mpl);
        Thread multiplying7 = new multiplying7(mpx);

        multiplying5.start();
        multiplying7.start();

    }
}
