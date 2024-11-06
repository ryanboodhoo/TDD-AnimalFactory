import java.util.Date;

public class Cat implements Mammal, Animal {
    private static String name;
    private Date birthdate;
    private int numberOfMealsEaten = 0;
    private static Integer id;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Cat.name = name;
    }

    public void setNumberOfMealsEaten(int numberOfMealsEaten) {
        this.numberOfMealsEaten = numberOfMealsEaten++;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public String speak() {
        return "meow!";
    }

    public void eat(Food food) {
        numberOfMealsEaten++;
    }

    public Integer getNumberOfMealsEaten() {
        return numberOfMealsEaten;
    }

    public void setId(Integer id) {
        this.id = id;

    }

    public Integer getId() {
         return id;
    }


;



}


