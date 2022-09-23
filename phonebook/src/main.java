import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class main {
    public static void main(String args[]) {
        HashMap<String, Integer> contacts = new HashMap();
        contacts.put("Alexandria", Integer.valueOf("091"));
        contacts.put("Nicole", Integer.valueOf("097"));
        Scanner console = new Scanner(System.in);

        System.out.print("Enter if you want to [1]remove, [2]add, [3]search or [4]display all contacts. Just put 1/2/3/4:  ");
        int choice = console.nextInt();

        switch(choice) {
            case 1:
                Scanner sc;
                sc = new Scanner(System.in);
                System.out.print("Please enter you want to remove: ");
                String search = sc.next();

                for (Entry<String, Integer> entry : contacts.entrySet()) {

                    if (entry.getValue() == Integer.valueOf(search)) {
                        System.out.println(search + " is " + entry.getKey());{
                        contacts. remove(entry.getKey());
                    System.out.print("It was remove successfully!");}}}
                        break;

                        case 2:
                            sc = new Scanner(System.in);
                            System.out.print("Enter the number of contacts you want to add:");
                            int number = sc.nextInt();

                            for
                            (int i = 0; i < number; i++) {
                                System.out.print("Enter name: ");
                                String a = sc.next();
                                System.out.print("Enter number: ");
                                int b = sc.nextInt();
                                contacts.put(a, b);
                                System.out.print(contacts);
                            }
                            break;

                        case 3:
                            sc = new Scanner(System.in);
                            System.out.print("Please enter you want to search: ");
                            search = sc.next();

                            for (Entry<String, Integer> entry : contacts.entrySet()) {

                                if (entry.getValue() == Integer.valueOf(search)) {
                                    System.out.println(search + " is " + entry.getKey());
                                    break;

                                }

                            }
                        case 4:
                            System.out.println(contacts);
                            break;
                    }
                }
        }