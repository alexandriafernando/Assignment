import java.util.*;
public class activity1 {
public static void main(String[] args){
    ArrayList<String> employee = new ArrayList<String>();

    employee.add ("3 years- Juan");
    employee.add ("1 years- Alex");
    employee.add ("7 years- Jorena");
    employee.add ("9 years- Sharie");
    employee.add ("5 years- Jobelle");
    System.out.println("Before Sorting : " + employee);

    // Sorting ArrayList in ascending Order
    Collections.sort(employee);

    // printing the sorted ArrayList
    System.out.println("\nAfter Sorting : " + employee);
}}
