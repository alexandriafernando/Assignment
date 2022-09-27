package multithread;

public class thread2 extends Thread{
    Thread t;
    thread2 (){
        t= new Thread (this,"THREAD 2");
        t.start();
    }

    @Override
    public void run() {
        try{
            int num=5;
            if(num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
                Thread.sleep(2000);
            }

        catch(InterruptedException e){
            System.out.println("Interrupted");

        }
}}
