package Model;

public class Person
{

   //bring the contents of your Person class from the first assignment
    // Attributes to define each person, using encapsulation
    private String name;
    private int weight;
    private String hometown;
    private String highSchool;
    
    public Person(String name, int weight, String hometown, String highSchool) //Constructor initializes all attributes
    {
        this.name = name;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }
    
    public Person() //Constructor initializes all attributes
    {
        this.name = "";
        this.weight = 0;
        this.hometown = "N/A";
        this.highSchool = "N/A";
    }
    
    @Override
    public String toString() //toString method for priting
    {
        return "Person{" + "name=" + name + ", weight=" + weight + ", hometown=" + hometown + ", highSchool=" + highSchool + '}';
    }
    
    //get and set methods for private attributes
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public void setWeight(int weight)
    {
        this.weight = weight;
   
    }
    
    public String getHometown()
    {
        return hometown;
    }
    
    public void setHometown(String hometown)
    {
        this.hometown = hometown;
    }
    
    public String getHighSchool()
    {
        return highSchool;
    }
    
    public void setHighSchool(String highSchool)
    {
        this.highSchool = highSchool;
    }
}
