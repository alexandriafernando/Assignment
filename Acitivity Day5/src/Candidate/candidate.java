package Candidate;
import java.util.Scanner;
public class candidate {
    public static void main  (String[]args) throws Exception{
        Employee emp;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= sc.nextLine();

        System.out.println("Enter your Employee Number: ");
        int empNo= sc.nextInt();

        System.out.println("Enter your Age: ");
        int age= sc.nextInt();

        System.out.println("Enter your Salary: ");
        int salary= sc.nextInt();

        if (salary<1000){
            throw new Exception ("Invalid! it cannot be less than 1000");}
        else{
            emp= new Employee (name, age,salary,empNo);}
        System.out.println(emp);
        }


    private static class Employee {
        public Employee(String name, int age, int salary, int empNo) {

            System.out.print(name+empNo+age+salary);
        }
    }
}

