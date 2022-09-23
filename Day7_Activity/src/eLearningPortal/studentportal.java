package eLearningPortal;
import java.util.*;

public class studentportal extends courses{
    public static void main(String args[]) {
        courses obj = new courses();
        TreeSet<String> lis = new TreeSet<>();
        lis.add("Algebra");
        lis.add("Java");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student you want to add");
        int number = sc.nextInt();
        ArrayList<student> details= new ArrayList<>();
        
            for
            (int i=0;i<number;i++){
                System.out.print("ANOTHER STUDENT: Enter your name: ");
                String name =sc.next();
                System.out.print("Enter your enrollment number: ");
                int enroll_id =sc.nextInt();
                System.out.print("Enter your enrollment course or create new: \nList of courses"+ lis);
                String college =sc.next();
                lis.add(college);
                student elements = new student (name, enroll_id, college);
                details.add(elements);}

    System.out.print("Please enter your course: ");
            String search = sc.next();

            for(int s = 0;s<details.size();s++){
                student get = details.get(s);
                if(get.college.equals(search)){
                    System.out.print(get);
                }
            }

}}