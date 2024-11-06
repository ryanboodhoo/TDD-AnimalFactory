import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;


public class CatHouseTest extends TestCase {
    private CatHouse catHouse;

    @BeforeEach
    public void setUp() {
        // Given: Initialize CatHouse before each test
        catHouse = new CatHouse();
    }

    @Test
    public void testAddCat() {
        // Given: A new CatHouse and a Cat
        Cat cat = new Cat();

        // When: Adding the Cat to the CatHouse
        catHouse.add(cat);

        // Then: The number of cats should be 1 and the added Cat should be retrievable
        assertEquals(String.valueOf(1), catHouse.getNumberOfCats(), "The number of cats should be 1");
        assertEquals(String.valueOf(cat), catHouse.getCatById(1), "The cat with ID 1 should be 'Whiskers'");
    }
//
    @Test
    public void testRemoveCatByObject() {
        // Given: A CatHouse with an added Cat
        Cat cat = new Cat();
        catHouse.add(cat);

        // When: Removing the Cat by object
        catHouse.remove(cat);

        // Then: The number of cats should be 0 and the cat should no longer be retrievable
        assertEquals("The number of cats should be 0 after removal",String.valueOf(0),catHouse.getNumberOfCats());
        assertNull("The cat with ID 1 should no longer be present",catHouse.getCatById(1));
    }

    @Test
    public void testRemoveCatById() {
        // Given: A CatHouse with an added Cat
        Cat cat = new Cat();
        catHouse.add(cat);

        // When: Removing the Cat by ID
        catHouse.remove(1);

        // Then: The number of cats should be 0 and the cat should no longer be retrievable
        assertEquals(String.valueOf(0), catHouse.getNumberOfCats(), "The number of cats should be 0 after removal by ID");
        assertNull("The cat with ID 1 should no longer be present",catHouse.getCatById(1) );
    }

    @Test
    public void testGetCatById() {
        // Given: A CatHouse with an added Cat
        Cat cat = new Cat();
        catHouse.add(cat);

        // When: Retrieving the Cat by ID
        String retrievedCat = String.valueOf(catHouse.getCatById(1));

        // Then: The retrieved cat should match the added Cat
        assertNotNull("The retrieved Cat should not be null",String.valueOf(retrievedCat) );
        assertEquals("The retrieved Cat should be the one with ID 1",String.valueOf(cat), retrievedCat);
    }

    @Test
    public void testGetNumberOfCats() {
        // Given: A CatHouse with multiple Cats
        catHouse.add(new Cat());
        catHouse.add(new Cat());
        catHouse.add(new Cat());

        // When: Retrieving the number of Cats
        int numberOfCats = catHouse.getNumberOfCats();

        // Then: The number should be 3
        assertEquals(String.valueOf(3), numberOfCats, "The number of cats should be 3");
    }
}
