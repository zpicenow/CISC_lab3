package cisc181.lab_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void getName() {
        System.out.println("Testing Dog class");
        Dog spot = new Dog();
        assertEquals("Spot", spot.getName());
        assertEquals("brown", spot.getFurColor());
        assertEquals(spot.toString(), "Spot with brown fur");

        Dog dog = new Dog("WangCai", "black");
        assertEquals("WangCai", dog.getName());
        assertEquals("black", dog.getFurColor());
        assertEquals("woof", dog.bark());
        assertEquals("zzz", dog.sleep());
        assertEquals("wagging tail",dog.wagTail());
    }
}