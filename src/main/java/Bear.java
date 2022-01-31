public class Bear {

    // String - is a class, created a class string; int, char is just defining the type
    private String name;
    private int age;        // or use long for big numbers
    private double weight;
    private char gender;    // must be used with single quotes ''

    // Constructor
    public Bear(String name, int age, double weight, char gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    // getter
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean readyToHibernate(){
        if (this.weight >= 80.00){
            return true;
        }
        return false;
    }
}