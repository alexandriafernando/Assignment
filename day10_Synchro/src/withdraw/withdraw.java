package withdraw;

import java.awt.color.ICC_ColorSpace;

//write the withdraw method without synchronization and with synchronization to show the effects
public class withdraw {

    private int request;

    public synchronized void bank(int request){
        this.request= request;
        int x= 25000;
        System.out.print("      Withdrawal of"+x);
        if(x >= request){
            x= x-request;
            System.out.println("Remaining Balance: "+x);
        }
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("       Withdrawal Finished");
    }


}
