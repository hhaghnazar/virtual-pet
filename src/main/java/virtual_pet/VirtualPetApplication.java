package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Interact with a VirtualPet object in this method

        VirtualPet myVirtualPet = new VirtualPet(100, 50, 50, "yes");

        System.out.println("Welcome to the Pet Playground & Palace (PPP)");
        System.out.println("");
        System.out.println("TERMS AND CONDITIONS:  IF YOUR PETS HEALTH DROPS TO ZERO WE CHARGE YOU $100 TO REVIVE");
        System.out.println("");
        System.out.println("Please type yes if you agree with the terms and conditions OR Press 6 to exit");
        System.out.println("");
        String userEnteredName = input.nextLine();



        while (myVirtualPet.accessPet(userEnteredName) == false) {
            System.out.println("Incorrect answer, please try again: ");
            userEnteredName = input.nextLine();

        }


        System.out.println("Your pets health energy level is " + myVirtualPet.getHealth());
        System.out.println("Your pets boredom level is " + myVirtualPet.getBoredom());
        System.out.println("Your pets sleepiness level is " + myVirtualPet.getSleepiness());
        System.out.println(" ");
        System.out.println("Please select from the menu below");
        System.out.println(" ");
        System.out.println("Press 1 to check your pets health");
        System.out.println("Press 2 to feed your pet (this will decrease sleepiness by 10 and increase boredom by 10)");
        System.out.println("Press 3 to play with your pet (this will increase sleepiness by 10 and decrease boredom by 10)");
        System.out.println("Press 4 to let your pet roam & play with the other animals");
        System.out.println("Press 5 to send your animal off for a nighttime nap");
        System.out.println("Press 6 to exit");
        System.out.println("");
        String userChoice = input.nextLine();

        while (!userChoice.equals("6")) {
            if (userChoice.equals("1")) {
                System.out.println("");
                System.out.println("You have chosen to check on your pets health levels");
                System.out.println("");
                System.out.println("Your pets health energy level is " + myVirtualPet.getHealth());
                System.out.println("Your pets boredom level is " + myVirtualPet.getBoredom());
                System.out.println("Your pets sleepiness level is " + myVirtualPet.getSleepiness());
                System.out.println("");
            } else if (userChoice.equals("2")) {
                System.out.println("");
                System.out.println("You want to feed your pet");
                System.out.println("Enter the amount to feed your pet: ");
                System.out.println("");
                int amountToFeed = input.nextInt();
                input.nextLine();
                myVirtualPet.feed((amountToFeed));
                System.out.println("Your pets health energy has increased to " + myVirtualPet.getHealth());
                System.out.println("Your pets boredom level is " + myVirtualPet.getBoredom());
                System.out.println("Your pets sleepiness level is " + myVirtualPet.getSleepiness());
                System.out.println("Your pet is now getting fat, be sure to play with it....");
                System.out.println("");
            } else if (userChoice.equals("3")) {
                System.out.println(" ");
                System.out.print("You want to play with your pet");
                System.out.println("");
                System.out.print("Enter the amount of time to play: ");
                System.out.println(" ");
                int amountToPlay = input.nextInt();
                input.nextLine();
                myVirtualPet.play(amountToPlay);
                System.out.println("Your pets health energy has decreased to " + myVirtualPet.getHealth());
                System.out.println("Your pets boredom level is " + myVirtualPet.getBoredom());
                System.out.println("Your pets sleepiness level is " + myVirtualPet.getSleepiness());
                System.out.println("Your pet is now hungry after playing, be sure to feed it....");
                System.out.println(" ");
            } else if (userChoice.equals("4")) {
                System.out.println(" ");
                System.out.print("You've decided to let your pet roam and play");
                System.out.println("");
                System.out.print("Your pet decides to eat for a quantity of 20 and their health energy increases");
                System.out.println(" ");
                System.out.println("........................");
                System.out.print("Your pet decides to sleep quantity of 20 minutes ");
                System.out.println(" ");
                System.out.println("........................");
                System.out.println("Your pet has so much energy now that they decided to roam & play with the other animals");
                System.out.println("Your pet has used 20 of their health energy");
                myVirtualPet.letRoam();
                System.out.println("Your pets health energy level went on up by 20 and then down 20, therefore it is at " + myVirtualPet.getHealth());
                System.out.println("Your pets boredom level is " + myVirtualPet.getBoredom());
                System.out.println("Your pets sleepiness level is " + myVirtualPet.getSleepiness());
                System.out.println(" ");
            } else if (userChoice.equals("5")) {
                System.out.println(" ");
                System.out.print("You want to to send your pet to bed");
                System.out.println("");
                System.out.print("You said goodnight to your pet after hugging them...");
                myVirtualPet.tick(0);
                myVirtualPet.getSleepiness();
                System.out.println("Your pets health energy has decreased to " + myVirtualPet.getHealth());
                System.out.println("Your pets boredom level is " + myVirtualPet.getBoredom());
                System.out.println("Your pets sleepiness level is " + myVirtualPet.getSleepiness());
                System.out.println("");


            } else {
                System.out.println("I'm sorry, I do not understand your request");

            }

            System.out.println("Press 1 to check health");
            System.out.println("Press 2 to feed your pet (this will decrease sleepiness by 10 and increase boredom by 10)");
            System.out.println("Press 3 to play with your pet (this will increase sleepiness by 10 and decrease boredom by 10)");
            System.out.println("Press 4 to let your pet roam & play with the other animals");
            System.out.println("Press 5 to send your animal off for a nighttime nap");
            System.out.println("Press 6 to exit");
            userChoice = input.nextLine();
//

        }

        System.out.println("Thanks for visiting the PPP!");
        System.exit(0);
    }

    public static void tryAgain() {
        System.out.println("Your pet does not have enough health energy to play for that long.  Please try again: ");
    }

    public static void sleepMessage1(){
        System.out.println(" ");
        System.out.println("Your pet is now asleep sleep");
        System.out.println("................");
        System.out.println("................");
        System.out.println("................");
        System.out.println("................");
        System.out.println("................");
        System.out.println("................");
        System.out.println("................");
        System.out.println("................");
        System.out.println("It is now morning time and your pet is hungry, be sure to feed it");
    }
}
