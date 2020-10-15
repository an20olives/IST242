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
    public FootballPlayer(String iName, Height iHeight, int iWeight, String iHometown, String iHighSchool, int number, String position) {//Change from 'informed' to 'i' for simplicity
        super(iName, iHeight, iWeight, iHometown, iHighSchool); //super calls the superclass constructor
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
    public String getAttribute(int n) {//returns a string attribute based on int input, similar to getData(n) but using if now.
        switch (n) {//Using switch statement instead of if for simplicity and maintence, similar to early getData(int n)
            case 0:
                return String.valueOf(this.number);
            case 1:
                return this.position;
            case 2:
                return super.getName();
            case 3:
                return super.getHeight().toString();
            case 4:
                return String.valueOf(super.getWeight());
            case 5:
                return super.getHometown();
            case 6:
                return super.getHighSchool();
            default:
                return ("invalid input parameter");
        }
    }

    @Override
    public ArrayList<String> getAttributes() {//returns a String Arraylist attributeList with all attributes
        ArrayList<String> attributesList = new ArrayList<>();
        for (int i = 0; i <= 6; i++) {//for loop similar too getData() for moving through the array, //is not <=6 instead of 7
            attributesList.add(getAttribute(i));

        }

        return attributesList;
    }

    @Override
    public String getAttributeName(int n) {//returns attribute as string based on int input, similar to getData(n).
        switch (n) {//Using switch statement instead of if for simplicity and maintence, similar to early getData(int n)
            case 0:
                return "number";
            case 1:
                return "position";
            case 2:
                return "name";
            case 3:
                return "height";
            case 4:
                return "weight";
            case 5:
                return "hometown";
            case 6:
                return "highSchool";
            default:
                return ("invalid input parameter");
        }
    }

    //returns a String ArrayList filled with names of all attributes
    @Override
    public ArrayList<String> getAttributeNames() {//returns a String Arraylist attributeNameList with all attributes names
        ArrayList<String> attributeNameList = new ArrayList<>();
        for (int i = 0; i <= 6; i++) {//for loop similar too getData() for moving through the array //is not <=6 instead of 7
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
