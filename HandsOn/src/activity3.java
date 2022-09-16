import java.util.Scanner;
public class activity3 {

    String a;
    int b,c,d;

    public activity3() {
        System.out.print("Enter your name:");
        Scanner input = new Scanner(System.in);
        a = input.nextLine();
        System.out.print("Enter your age:");
        b = input.nextInt();
        System.out.print("Enter your roll number:");
        c = input.nextInt();
        System.out.print("Enter your mark:");
        d = input.nextInt();

    }
    public static void main(String[] args) {
        activity3 obj = new activity3();

        if (obj.d < 30) {
            System.out.println(obj.c + " is less than 30. Cannot be accepted");
        } else {
            System.out.println("Name:" +obj.a +"\nAge:" + obj.b+ "\nRoll no:"+obj.c+"\nMark:"+obj.d);
        }
    }
    }
