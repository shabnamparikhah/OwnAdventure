import java.util.Scanner;
public class OwnAdventureClass {
    public static void main(String[] args)
    {
        String myInput;
        String description;
        System.out.println("WELCOME TO Shabnam'S ADVENTURE!");
        Scanner myScan = new Scanner(System.in);
        myInput = myScan.nextLine();
        switch (myInput) {
            case "Kitchen":   description = "Kitchen";
                System.out.println("You are in the kitchen");
                System.out.println("What do you want? refrigerator OR cabinet");
                myInput = myScan.nextLine();
                switch (myInput) {
                    case "refrigerator":
                        description = "Open refrigerator";
                        System.out.println("What do you want? Eat OR Drink");
                        myInput = myScan.nextLine();
                        if (myInput.equals("Drink")) {
                            System.out.println("Drink strange milk");
                        } else
                            System.out.println("Eat leftovers");
                        break;

                    case "cabinet":
                        description = "Open cabinet";
                        System.out.println("What do you want? Eat can of beans OR Take a plate");
                        myInput = myScan.nextLine();
                        if (myInput.equals("Eat")) {
                            System.out.println("Eat can of beans");
                        } else
                            System.out.println("Take a plate");
                        break;
                }
            case "Upstairs":
                description = "Upstairs";
                System.out.println("You are in the Upstairs");
                System.out.println("What do you want? Bedroom OR Bathroom");
                myInput = myScan.nextLine();
                switch (myInput) {
                    case "Bedroom": description = "Bathroom";
                        System.out.println("What do you want? Lay on bed OR Open the drawer");
                        myInput = myScan.nextLine();
                        if (myInput.equals("Lay")) {
                            System.out.println("Lay on bed");
                        } else
                            System.out.println("Open the drawer");
                        break;
                    case "Bathroom": description = "Bathroom";
                        System.out.println("What do you want? Look in mirror OR Use the toilet");
                        myInput = myScan.nextLine();
                        if (myInput.equals("Look")) {
                            System.out.println("Look in mirror");
                        } else
                            System.out.println("Use the toilet");
                        break;
                }
        }

        }
    }

