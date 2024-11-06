import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DogHouseTest extends TestCase {

    private DogHouse dogHouse;

    @BeforeEach
    public void setUp() {
        // Given: Initialize CatHouse before each test
        dogHouse = new DogHouse();
    }
}

