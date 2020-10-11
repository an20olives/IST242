package Model;

import java.util.ArrayList;

/**
 *
 * @author aro
 */
public class FootballPlayer extends Person implements TableMember { //FootballPlayer class extends Person class

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
    public String getAttribute(int n) { //returns a string attribute based on int input, similar to getData(n) but using if now.
        String playerAttributes = new String();
        if (n == 0) {//if n is 0 get the number attribute of the player
            playerAttributes = "" + this.getNumber();
        }
        if (n == 1) {//if n is 1 get the position attribute of the player
            playerAttributes = "" + this.getPosition();
        }
        if (n == 2) {//if n is 2 get the name attribute of the player
            playerAttributes = this.getName();
        }
        if (n == 3) {//if n is 3 get the height attribute of the player
            playerAttributes = "" + this.getHeight().toString();
        }
        if (n == 4) {//if n is 4 get the weight attribute of the player
            playerAttributes = "" + this.getWeight();
        }
        if (n == 5) {//if n is 5 get the hometown attribute of the player
            playerAttributes = this.getHometown();
        }
        if (n == 6) {//if n is 6 get the highschool attribute of the player
            playerAttributes = this.getHighSchool();
        }
        return playerAttributes;
    }

    @Override
    public ArrayList<String> getAttributes() { //returns a String Arraylist attributeList with all attributes
        ArrayList<String> attributesList = new ArrayList<>();
        for (int i = 0; i < 7; ++i) { //for loop similar too getData() for moving through the array, should change to i < arr.size() instead of 7
            attributesList.add(getAttribute(i));
        }

        return attributesList;
    }

    @Override
    public String getAttributeName(int n) {//returns attribute as string based on int input, similar to getData(n).
        String attributesName = new String();

        if (n == 0) {//if n is 0 gets the number attributeName
            attributesName = "number";
        }
        if (n == 1) {//if n is 1 gets the position attributeName
            attributesName = "position";
        }
        if (n == 2) {//if n is 2 gets the name attributeName
            attributesName = "name";
        }
        if (n == 3) {//if n is 3 gets the height attributeName
            attributesName = "height";
        }
        if (n == 4) {//if n is 4 gets the weight attributeName
            attributesName = "weight";
        }
        if (n == 5) {//if n is 5 gets the hometown attributeName
            attributesName = "hometown";
        }
        if (n == 6) {//if n is 6 gets the highSchool attributeName
            attributesName = "highSchool";
        }

        return attributesName;
    }

    //returns a String ArrayList filled with names of all attributes
    @Override
    public ArrayList<String> getAttributeNames() {//returns a String Arraylist attributeNameList with all attributes names
        ArrayList<String> attributeNameList = new ArrayList<>();
        for (int i = 0; i < 7; ++i) {//for loop similar too getData() for moving through the array, should change to i < arr.size() instead of 7
            attributeNameList.add(getAttributeName(i));
        }
        return attributeNameList;
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
