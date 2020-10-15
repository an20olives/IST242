package Model;

/**
 *
 * @author aro
 */
public class Person {

    //Attributes to define each person, using encapsulation
    protected String name;
    protected Height height; //new attribute using Height class
    protected int weight;
    protected String hometown;
    protected String highSchool;

    public Person(String name, Height height, int weight, String hometown, String highSchool) {//Constructor initializes all attributes, added new height attribute
        this.name = name;
        this.height = height; //uses the constructor in Height.Very Important
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    public Person() { //Constructor initializes all attributes, added new height attribute
        this.name = "";
        this.height = new Height(); //uses the constructor in Height.Very Important
        this.weight = 0;
        this.hometown = "N/A";
        this.highSchool = "N/A";
    }

    @Override //override is rewriting a method from the superclass with new functionality
    public String toString() { //toString method for priting, added new height addtribute that uses Heights toString constructor
        return "Person{" + "name=" + name + ", height=" + height.toString() + ", weight=" + weight + ", hometown=" + hometown + ", highSchool=" + highSchool + '}';
    }

    //Get and Set methods for private attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }
}