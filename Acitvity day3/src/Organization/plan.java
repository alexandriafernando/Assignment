package Organization;
import java.io.*;
public abstract class plan {
    protected double pf;
    protected double loan;
    public abstract void getSalary();

    public void result(int sal){
        System.out.println(sal-(sal*pf));

    }
    public void fin (int sal){
        System.out.println(sal*loan);
    }
}
