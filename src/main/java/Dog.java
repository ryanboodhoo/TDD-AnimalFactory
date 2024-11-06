import java.util.Date;

public class Dog implements Mammal, Animal  {
        private String name;
        private Date birthdate;
        private int numberOfMealsEaten = 0;
        private static Integer id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfMealsEaten(int numberOfMealsEaten) {
        this.numberOfMealsEaten = numberOfMealsEaten;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String speak() {
            return "bark!";
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

    }
