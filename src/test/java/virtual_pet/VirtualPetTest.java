package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    //Arrange
    VirtualPet underTest = new VirtualPet(50, 50, 50, "yes");


    @Test
    public void shouldHaveADefaultHealthOf50() {
        //Act
        int actualHealth = underTest.getHealth();
        //Assert
        assertEquals(50, actualHealth);
    }

    @Test
    public void shouldHaveADefaultHealthof100() {
        //Arrange
        VirtualPet underTest = new VirtualPet(100, 100, 100, "yes");
        //Act
        int actualHealth = underTest.getHealth();
        //Assert
        assertEquals(100, actualHealth);
    }

    @Test
    public void additionOf50FoodShouldIncreaseAnInitialHealthOf50to100() {

        //Act
        underTest.feed(50);
        int actualHealth = underTest.getHealth();
        assertEquals(100, actualHealth);

    }

    @Test
    public void using50EnergyShouldDecreaseInitialHealthOf50to0() {
        underTest.play(50);
        int actualHealth = underTest.getHealth();
        assertEquals(0, actualHealth);
    }

    @Test
    public void playOf51ShouldReturnOriginalBalanceOf50() {
        underTest.play(51);
        int actualHealth = underTest.getHealth();
        assertEquals(50, actualHealth);

    }

    @Test
    public void shouldAllowUserToInteractWithPet() {
        boolean accessResult = underTest.accessPet("yes");
        assertEquals(true, accessResult);

    }

    @Test
    public void shouldDenyUserToInteractWithPet() {
        boolean accessResult = underTest.accessPet("doggo");
        assertEquals(false, accessResult);
    }

    @Test
    public void shouldAllowPetToSleep() {
        underTest.tick(0);
        int amountToSleep = underTest.getSleepiness();
        int actualSleep = 0;
        assertEquals(0, actualSleep);

    }
}
