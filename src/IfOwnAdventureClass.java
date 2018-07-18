import java.util.Scanner;

public class IfOwnAdventureClass {
    public static void main(String[] args) {
        String myInput;
        System.out.println("WELCOME TO Shabnam'S ADVENTURE!");
        Scanner myScan = new Scanner(System.in);
        myInput = myScan.nextLine();
        if (myInput.equals("Kitchen")) {
            System.out.println("What do you want Open refrigerator OR Open cabinet");
            myInput = myScan.nextLine();
            if (myInput.equals("Open refrigerator")) {
                System.out.println("What do you want Drink strange milk OR Eat leftovers");
                myInput = myScan.nextLine();
                if (myInput.equals("Drink strange milk"))
                    System.out.println("---- delisess ----");
                        }
                        else if (myInput.equals("Eat leftovers"))
            {
                                System.out.println("---- Eat leftovers ----");
                } else if (myInput.equals("Open cabinet"))
                {
            System.out.println("What do you want Eat can of beans OR Take a plate");
            myInput = myScan.nextLine();
            if (myInput.equals("Eat can of beans"))
            System.out.println("---- Eat can of beans ------");
        } else if (myInput.equals("Take a plate"))
            System.out.println("----- Take a plate ------");

        }
        else if (myInput.equals("Upstairs"))
        {
            System.out.println("What do you want Bedroom OR Bathroom");
            myInput = myScan.nextLine();
            if (myInput.equals("Bedroom")) {
                System.out.println("What do you want Lay on bed OR Open the drawer");
                myInput = myScan.nextLine();
                if (myInput.equals("Lay on bed")) {
                    System.out.println("-------- Lay on bed --------");
                }
            } else if(myInput.equals("Open the drawer")) {
                System.out.println("-------Open the drawer------");
            }
            if (myInput.equals("Bathroom"))
            {
                System.out.println("What do you want Look in mirror OR Use the toilet");
                myInput = myScan.nextLine();
                if (myInput.equals("Look in mirror"))
                System.out.println("----------Look in mirror-----------");
            }
            else if (myInput.equals("Use the toilet"))
                System.out.println("---------Use the toilet---------");
        }

    }
}
