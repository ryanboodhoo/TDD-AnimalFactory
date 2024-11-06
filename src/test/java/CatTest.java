import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.Optional;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void setName() {
        // Arrange
        Cat cat = new Cat();

        // Act
        cat.setName("kitty");

        // Assert
        assertEquals("kitty", cat.getName());
    }

    @Test
    public void setBirthdate() {
        // Arrange
        Cat cat = new Cat();
        Date date = new Date(2019,3,24);
        // Act
        cat.setBirthdate(date);
        // Assert
        assertEquals(date, cat.getBirthdate());
    }

    @Test
    public void speak() {
        // Arrange
        Cat cat = new Cat();

        // Act
        String result = cat.speak();

        // Assert
        assertEquals("returns meow!", result, "meow!");
    }

    @Test
    public void testEatIncreasesMealsEaten() {
        // Arrange
        Cat cat = new Cat();
        Food food = new Food();

        // Act
        int initialMeals = cat.getNumberOfMealsEaten();
        cat.eat(food);

        // Assert
        assertEquals(String.valueOf(initialMeals + 1), Optional.ofNullable(cat.getNumberOfMealsEaten()),
                1);
    }

    @Test
    public void testGetIdReturnsCorrectId() {
        // Arrange
        Integer givenId = 1;
        Cat cat = new Cat();
        cat.setId(givenId);  // Set the ID using the setter

        // Act
        Integer retrievedId = cat.getId();

        // Assert
        assertEquals((givenId), retrievedId);
    }

    @Test
    public void testCatIsInstanceOfAnimal() {
        // Arrange
        Cat cat = new Cat();

        // Act & Assert
        assertTrue("Cat Is A Animal.", cat instanceof Animal);
    }
    @Test
    public void testCatIsInstanceOfMammal() {
        // Arrange
        Cat cat = new Cat();

        // Act & Assert
        assertTrue("Cat Is A Mammal.", cat instanceof Mammal);
    }
}


