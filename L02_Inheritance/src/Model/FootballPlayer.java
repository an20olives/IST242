package Model;

/**
 *
 * @author aro
 */
public class FootballPlayer extends Person { //FootballPlayer class extends Person class

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
