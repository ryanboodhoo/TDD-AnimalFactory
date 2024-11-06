import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatHouse {

    private Map<String, Cat> cats = new HashMap<>();

    public void add(Cat cat) {
        cats.put(cat.getName(), cat);
    }

    public void remove(Cat cat) {
        cats.remove(cat.getName(), cat);
    }

    public void remove(Integer id) {
        cats.remove(id);
    }

    public Cat getCatById(Integer id) {
        return cats.get(id);
    }

    public Integer  getNumberOfCats(){
        return  cats.size();
    }
}