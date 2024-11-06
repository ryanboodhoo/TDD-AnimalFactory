import java.util.ArrayList;
import java.util.Date;

public class AnimalFactory  {

    public Animal createCat(String name, Date birthdate){
        Cat cat = new Cat();
        Cat.setName(name);
        cat.setBirthdate(birthdate);
        return cat;
    }
    public Animal createDog(String name, Date birthdate){
        Dog dog = new Dog();
        dog.setName(name);
        dog.setBirthdate(birthdate);
        return dog;
    }
}