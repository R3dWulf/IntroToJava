import java.util.Scanner;

public class Controller {
        
        Tree customers = new Tree();
        
        public static void main(String[] args)
        {
                Controller c = new Controller();
                c.runMenu();
        }

                private String askInput()
                {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("\n-------------------------------");
                        System.out.println("Press A to add customer");
                        System.out.println("Press R to remove customer");
                        System.out.println("Press F to find customer");
                        System.out.println("Press Q to quit");
                        System.out.println("Enter your choice: ");
                        String input = scan.nextLine();
                        return input;
                }
        
        public void runMenu()
        {
                String input = askInput();
                
                while(!input.equals("q"))
                {
                        if(input.equals("a"))
                        {
                                askNode();
                        }
                        else if(input.equals("r"))
                        {
                                delete();
                        }
                        else if(input.equals("f"))
                        {
                                find();
                        }
                        else
                        {
                                System.out.println("Unkown command...");
                        }
                        input = askInput();
                }
        }
                
                public void askNode()
                {
                        /*
                         * 1. Ask the user for customer details
                         * 2. Create a new Node with them
                         * 3. Give this Node to the Queue's push method
                         */
                        Scanner scan = new Scanner(System.in);
                        System.out.print("enter the customer name: " );
                        String name = scan.nextLine();
                        
                        System.out.print("Enter the customer phone number:  ");
                        String phone = scan.nextLine();
                        
                        System.out.print("Enter the customer ID number:  ");
                        int id = scan.nextInt();
                        
                        Node newOne = new Node(name, phone, id);
                        if(customers.isEmpty())
                        {
                                customers.setRoot(newOne);
                        }
                        else
                        {
                                customers.addNode(newOne);
                        }    
                }
                
                public void delete()
                {
                        Scanner scan = new Scanner(System.in);
                        System.out.print("Enter customer ID to delete");
                        int id = scan.nextInt();
                        
                        customers.delete(id);
                }
                
                public void find()
                {
                        /*
                         *1. Ask the user for the name of the customer
                         *2. Call the Queue's  find(String) method with this name 
                         */
                        Scanner scan = new Scanner(System.in);
                        System.out.print("Enter the cusomer's ID to find: " );
                        
                        int id = scan.nextInt();
                        
                        Node found = customers.find(id);
                        if(found != null)
                        {
                                printDetails(found);
                        }
                        else
                        {
                                System.out.println("Node was not found!");
                        }
                }
                
                private void printDetails(Node n)
                {
                        System.out.println("Name: " + n.getName());
                        System.out.println("Phone number: " + n.getPhone());
                        if(n.getLeft() != null)
                        {
                                System.out.println("Left node: " + n.getLeft().getName() + " ID: " + n.getLeft().getID());
                        }
                        if(n.getRight() != null)
                        {
                
                                System.out.println("Right node: " + n.getRight().getName() + " ID: " + n.getRight().getID());
                        }
                        
                }

}
