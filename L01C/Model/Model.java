package Model;

public class Model {

    //Declare Persons here with encapsulation!
    private Person p1;
    private Person p2;
    private Person p3;
    private Person p4;
    private Person p5;

    public Model() {
        loadData();
    }

    public void loadData() {
        //Person1 using all parameter constructor, also using new Height class
        p1 = new Person("Marcus Allen", 5, 2, 200, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.");

        //Person2 using all parameter constructor, also using new Height class
        p2 = new Person("Kyle Alston", 5, 9, 180, "Robbinsville, N.J.", "Robbinsville");

        //Person3 using all parameter constructor, also using new Height class
        p3 = new Person("Troy Apke", 6, 1, 220, "Mt. Lebanon, Pa.", "Mount Lebanon");

        //Person4 using all parameter constructor, also using new Height class
        p4 = new Person("Matthew Baney", 6, 0, 225, "State College, Pa.", "State College");

        //Person5 using no parameter constructor, also using new Height class
        p5 = new Person();
    }

    public String getData(int n) {
        switch (n) { //using switch instead of if to return Persons(n).
            case 1:
                return p1.toString();
            case 2:
                return p2.toString();
            case 3:
                return p3.toString();
            case 4:
                return p4.toString();
            case 5:
                return p5.toString();
            default:
                return ("invalid input parameter");
        }
    }

    //Getters and setters for all Persons 
    public Person getP1() {
        return p1;
    }

    public void setP1(Person p1) {
        this.p1 = p1;
    }

    public Person getP2() {
        return p2;
    }

    public void setP2(Person p2) {
        this.p2 = p2;
    }

    public Person getP3() {
        return p3;
    }

    public void setP3(Person p3) {
        this.p3 = p3;
    }

    public Person getP4() {
        return p4;
    }

    public void setP4(Person p4) {
        this.p4 = p4;
    }

    public Person getP5() {
        return p5;
    }

    public void setP5(Person p5) {
        this.p5 = p5;
    }

}
