//Mimic a shopping cart using HashMap where user can add aricles of different catagory like, grocery, electronics, kids items etc. User should able to remove items also from the cart.
// User should able to see the total amount for the cart items and category wise amount is well.

import java.util.*;
public class cart {

        String cat, Name, x, y;
        int price, cost, z;

        public cart ()
        {
            HashMap<String, shop> Cart = new HashMap<>();

                    Scanner scanner = new Scanner(System.in);

                    System.out.println("1 : Add an item");
                    System.out.println("2 : Display the items");
                    System.out.println("3 : Total cost");
                    System.out.println("4 : Remove an item\n");
                    System.out.print("Enter a number from above");
                    int num = scanner.nextInt();

                    switch (num) {

                        //add an item
                        case 1:

                            scanner.nextLine();
                            System.out.print("Category: ");
                            cat = scanner.nextLine();
                            System.out.print("Item name: ");
                            Name = scanner.nextLine();
                            System.out.print("Amount: ");
                            price = scanner.nextInt();
                            System.out.print("Cost: ");
                            cost = scanner.nextInt();

                            for(shop i : Cart.values())
                            {
                                if(i.getName().equals(Name) & i.getCost() == cost)
                                {
                                    price =price+ i.getAmount() ;
                                }
                            }


                            Cart.put(cat, new shop(Name, price, cost));
                            System.out.println("You added an item to your cart.\n");

                            break;

                        case 2:

                          Cart.entrySet().stream()
                                    .forEach(x -> System.out.println(x.getKey() + " The amount is:"
                                            + x.getValue().getAmount() + " " + x.getValue().getName() + "" + x.getValue().getCost()));

                            System.out.println("\n");
                            break;

                        //Total amount
                        case 3:

                            int totalCost = 0;
                            for (shop i: Cart.values())
                            {
                                totalCost += (i.getAmount() * i.getCost());
                            }

                            System.out.println("Total amount: " + totalCost);
                            System.out.println("\n");

                            break;
                        //remove an item
                        case 4:

                            if (Cart.isEmpty())
                            {
                                System.out.println("There are no item");
                                System.out.println("\n");


                            }
                            else
                            {
                                scanner.nextLine();
                                System.out.println("What is the category?");
                                x= scanner.nextLine();
                                System.out.println("Name the item you want to remove?");
                                y = scanner.nextLine();

                                for(String i : Cart.keySet())
                                {
                                    if(i.equals(x) & Cart.get(i).getName().equals(y))
                                    {
                                        Cart.remove(x, Cart.get(i));
                                        System.out.println("You have removed the item"+ y);
                                    }
                                    else
                                    {
                                        System.out.println("No item matched");
                                    }
                                }

                                System.out.println("\n");

                                break;

                            }

                        default:
                            System.out.print("Incorrect, make sure you choose 1/2/3/4: ");
                    }

        }}
