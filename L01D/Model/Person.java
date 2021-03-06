package Model;

public class Person {

   // bring the contents of your Person class from the first assignment
    // Attributes to define each person, using encapsulation
    private String name;
    private Height height; //new attribute using Height class
    private int weight;
    private String hometown;
    private String highSchool;
    
    public Person(String name, int feet, int inches, int weight, String hometown, String highSchool) {//Constructor initializes all attributes, added new height attribute
        this.name = name;
        this.height = new Height(feet, inches); //uses the constructor in Height.Very Important
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
    
    @Override
    public String toString() { //toString method for priting, added new height addtribute that uses Heights toString constructor
        return "Person{" + "name=" + name + ", height=" + height.toString() + ", weight=" + weight + ", hometown=" + hometown + ", highSchool=" + highSchool + '}';
    }
    
    //get and set methods for private attributes
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
