package multithread;

class thread1 extends Thread implements Runnable {
    Thread t;
    thread1 (){
        t= new Thread (this,"THREAD 1");
        t.start();
    }

    @Override
    public void run() {
        try{
            int num=5;
            for(int i=1; i<=10; i++){
                System.out.println(num+"x"+i+"="+num*i);
                Thread.sleep(2000);
        }

    }
        catch(InterruptedException e){
            System.out.println("Interrupted");

        }
    }
}
