package Model;

public class Height {

    //declare attributes with encapsulation
    private int feet;
    private int inches;

    //Constructor initializes all attributes
    public Height(int feet, int inches) {
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

    //getter and setter methods for feet and inches
    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

}
