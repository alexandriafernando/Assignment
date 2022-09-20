package Organization;
import java.io.IOException;
import java.util.Scanner;
public class generateResult {
    public static void main(String[] args)throws IOException {
        orgFactory generate = new orgFactory();

        System.out.print("Enter if you are permanent or contractual: ");
        Scanner input = new Scanner(System.in);
        String cho = input.nextLine();

        System.out.print("Enter your basic pay: ");
        Integer sal =input.nextInt();

        plan res =generate.getPerc(cho);
        System.out.print("You are "+cho+ "\nAmount of the Insurance that will be deducted to your salary: ");
        res.getSalary();
        res.result(sal);
        System.out.print ("Calculation of the loan amount they can avail as "+cho+" is ");
        res.fin(sal);
    }
}
