import java.util.HashMap;
import java.util.Map;

public class DogHouse {
    private Map<Integer, Dog> dogMap = new HashMap<>();

    public void add(Dog dog) {
        dogMap.put(dog.getId(), dog);
    }

    public void removeAnimalById(Integer id) {
        dogMap.remove(id);
    }

    public void removeAnimal(Dog dog) {
        dogMap.remove(dog.getId());
    }

    public Dog getAnimalById(Integer id) {
        return dogMap.get(id);
    }

    public Integer getNumberOfAnimals() {
        return dogMap.size();
    }

    public void clear() {
        dogMap.clear();
    }
}