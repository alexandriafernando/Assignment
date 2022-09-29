package thread;

import withdraw.withdraw;

public class thread implements Runnable{

    withdraw w1;
    int request;
    public Thread t;

    public thread(  withdraw w1,int request){
        this.w1 = w1;;
        this.request= request;
        t= new Thread(this);
        t.start();
    }


    @Override
    public void run(){
        w1.bank(request);
    }
}


