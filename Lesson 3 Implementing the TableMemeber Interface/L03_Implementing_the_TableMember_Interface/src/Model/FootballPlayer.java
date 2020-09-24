package Model;

import java.util.ArrayList;

/**
 *
 * @author aro
 */
public class FootballPlayer extends Person implements TableMember{ //FootballPlayer class extends Person class

    //Declare FootballPlayer attributes using encapsulation
    private int number;
    private String position;

    //Create FootballPlayer constructor with inheritance from constructor from Person
    public FootballPlayer(String informedName, Height informedheight, int informedWeight, String informedHometown, String informedHighSchool, int number, String position) {
        super(informedName, informedheight, informedWeight, informedHometown, informedHighSchool); //super calls the superclass constructor
        this.number = number; //FootballPlayer class takes care of its own variables
        this.position = position; //FootballPlayer class takes care of its own variables
    }

    public FootballPlayer() { //Create FootballPlayer constructor with default values
        super();//super calls the superclass no-parameter constructor
        this.number = 0;
        this.position = "N/A";
    }

    @Override //override is rewriting a method from the superclass with new functionality
    public String toString() { //overrides the superclass Object toString, returns attributes about FootballPlayer in String form
        return super.toString() + "  FootballPlayer{" + "number=" + number + ", position=" + position + '}';
        //super. SUPER DOT refers to the superclass as an object
        //this. THIS DOT refers to this class as an object
        //super. is not super()
    }

    @Override
    public String getAttribute(int n) {
        return getAttributes().get(n);
    }
    
    @Override
    public ArrayList<String> getAttributes() {
        ArrayList<String> playerAttributes = new ArrayList<>();
        playerAttributes.add(Integer.toString(getNumber()));
        playerAttributes.add(super.name);
        playerAttributes.add(getPosition());
        playerAttributes.add(Integer.toString(super.height.getFeet()) +"'" +Integer.toString(super.height.getInches()) +"\"");
        playerAttributes.add(Integer.toString(weight));
        playerAttributes.add(super.hometown);
        playerAttributes.add(super.highSchool);
        return playerAttributes;
    }

    @Override
    public String getAttributeName(int n) {
        return getAttributeNames().get(n);
    }

    //@Override
    public ArrayList<String> getAttributeNames() {
        ArrayList<String> attributeNames = new ArrayList<>();
        attributeNames.add("number " + "name " + "position " + "height " + "weight " + "hometown " + "highschool");
        attributeNames.add("name");
        attributeNames.add("position");
        attributeNames.add("height");
        attributeNames.add("weight");
        attributeNames.add("hometown");
        attributeNames.add("highschool");
        return attributeNames;
    }
    
    //Get and Set methods for FootballPlayer
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
