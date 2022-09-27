package multithread;

public class thread1Impl {
    public void main (String[]args){
        Thread t1= new thread1();
        Thread t2= new thread2();

        t1.start();
        t2.start();

        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
        }
        System.out.println ("Main thread finished");

    }

}
