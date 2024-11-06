import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogHouse {

    private Map<String, Dog> Dogs = new HashMap<>();

    public void add(Dog Dog) {
        Dogs.put(Dog.getName(), Dog);
    }

    public void remove(Dog Dog) {
        Dogs.remove(Dog.getName(), Dog);
    }

    public void remove(Integer id) {
        Dogs.remove(id);
    }

    public Dog getDogById(Integer id) {
        return Dogs.get(id);
    }

    public Integer  getNumberOfDogs(){
        return  Dogs.size();
    }
}