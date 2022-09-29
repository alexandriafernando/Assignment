package withdraw;

import thread.thread;

public class synchro {
    public void main (String args[]){
        withdraw amount = new withdraw();

        thread t1= new thread(amount, 1000);
        thread t2= new thread(amount, 2000);
        thread t3= new thread(amount, 5000);
        thread t4= new thread(amount, 10000);

        try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
            t4.t.join();
        }
        catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Interrupted");
    }
}
