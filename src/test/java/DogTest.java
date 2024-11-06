import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.Optional;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void setName() {
        // Arrange
        Dog dog = new Dog();

        // Act
        dog.setName("doggy");

        // Assert
        assertEquals("doggy", dog.getName());
    }

    @Test
    public void setBirthdate() {
        // Arrange
        Dog dog = new Dog();
        Date date = new Date(2019,3,24);


        // Act
        dog.setBirthdate(date);
        // Assert
        assertEquals(date, dog.getBirthdate());
    }

    @Test
    public void speak() {
        // Arrange
        Dog dog = new Dog();

        // Act
        String result = dog.speak();

        // Assert
        assertEquals("returns bark!", result, "bark!");
    }

    @Test
    public void testEatIncreasesMealsEaten() {
        // Arrange
        Dog dog = new Dog();
        Food food = new Food();

        // Act
        int initialMeals = dog.getNumberOfMealsEaten();
        dog.eat(food);

        // Assert
        assertEquals(String.valueOf(initialMeals + 1), Optional.ofNullable(dog.getNumberOfMealsEaten()),
                1);
    }

    @Test
    public void testGetIdReturnsCorrectId() {
        // Arrange
        Integer givenId = 1;
        Dog dog = new Dog();
        dog.setId(givenId);  // Set the ID using the setter

        // Act
        Integer retrievedId = dog.getId();

        // Assert
        assertEquals((givenId), retrievedId);
    }

    @Test
    public void testCatIsInstanceOfAnimal() {
        // Arrange
        Dog dog = new Dog();

        // Act & Assert
        assertTrue("Dog Is A Animal.", dog instanceof Animal);
    }
    @Test
    public void testCatIsInstanceOfMammal() {
        // Arrange
        Dog dog = new Dog();

        // Act & Assert
        assertTrue("Dog Is A Mammal.", dog instanceof Mammal);
    }
}


