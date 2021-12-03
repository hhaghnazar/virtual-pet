package virtual_pet;

public class VirtualPet {

    private int health;  //Variable for health energy level
    private String tacAgreement;  //Variable for answer to the terms and conditions agreement question.
    private int sleepiness; //Variable for level of sleepiness
    private int boredom; //Variable for boredom level


    //Getter Method
    public int getHealth() {

        return health;
    }

    public int getSleepiness() {
        return sleepiness;
    }

    public int getBoredom() {
        return boredom;
    }

    //Constructor
    public VirtualPet(int health, int boredom, int sleep, String tacAgreement) {
        this.health = health;
        this.boredom = boredom;
        this.sleepiness = sleep;
        this.tacAgreement = tacAgreement;
    }


    //Behavioral Methods
    public void feed(int amountOfFoodFed) {
        health += amountOfFoodFed;
        boredom += 10;
        sleepiness -= 10;

    }

    public void play(int amountOfTimeForPlay) {
        if (amountOfTimeForPlay <= health) {
            health -= amountOfTimeForPlay;
            boredom -= 10;
            sleepiness += 10;
        } else {
            VirtualPetApplication.tryAgain();
        }
    }

    public boolean accessPet(String tosAgreeement) {
        if (!tosAgreeement.equals("6")) {
            if (tosAgreeement.equals(tacAgreement)) {
                return true;
            } else {
                return false;
            }
        } else {

            System.exit(0);

        }
        return true;
    }

    public void tick(int i) {
        VirtualPetApplication.sleepMessage1();
        play(35);
        boredom += 30;
        sleepiness -= 30;
    }


    public void setSleepiness(int sleepiness) {
        this.sleepiness = sleepiness;
    }

    public void letRoam() {
        boredom -=30;
        sleepiness += 30;
    }
}

