
import java.util.Scanner;
import java.util.Arrays;
public class handson_A {
        public static void main(String args[]){
            System.out.print(" How many Arrays do you want?:");
            Scanner s = new Scanner(System.in);
            int m = s.nextInt();
            int x[] = new int [m];
            int result = 0;
            System.out.println("Enter the Integers in the Array:");

            for(int i=0; i<m; i++){
                x[i] = s.nextInt();
                result = result + x[i];
            }
            System.out.println("Entered Elements are "+Arrays.toString(x));
            System.out.println("Sum of the " +Arrays.toString(x)+ "is " + result);
        }}
