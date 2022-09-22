package listOfItems;
import java.util.Scanner;

public class listofItems {
    public static void main (String[]args){


    Scanner sc =new Scanner (System.in);
    System.out.print("How many item do you wanna list?: ");

    try {
        Integer item = sc.nextInt();
        int[] array = new int[item];
        for
           (int i=0;i<array.length;i++){
        System.out.print("Enter the prices of the "+item+"items you listed:");
        array[i]=sc.nextInt();}
        System.out.print("What items do you want to see the price?: ");
        Integer index= sc.nextInt();
            try{
                System.out.println("Price is "+ array[index]);
            }
            catch (Exception e){
                System.out.println("No match found");
        }
    }
    catch (Exception e){
        System.out.println("Invalid! Please enter an integer");
        }


    }
}
