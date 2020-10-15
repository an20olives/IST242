package Model;

/**
 *
 * @author aro
 */
public class Height {

    //declare Height attributes with encapsulation
    private int feet;
    private int inches;

    public Height(int feet, int inches) { //Constructor initializes all attributes
        this.feet = feet;
        this.inches = inches;
    }

    public Height() { //Constructor initializes all attributes
        this.feet = 0;
        this.inches = 0;
    }

    @Override
    public String toString() { //toString method to combine feet and inches into readable height.
        return feet + "'" + inches + "\"";
    }

    public int getFeet() {//Get method for getting feet
        return feet;
    }

    public void setFeet(int feet) {//Get method for setting feet
        this.feet = feet;
    }

    public int getInches() {//Get method for getting inches
        return inches;
    }

    public void setInches(int inches) {//Set method for setting inches
        this.inches = inches;
    }

}
