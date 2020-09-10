package Model;

public class Model {

    //Declare Persons here!
    private Person p1;
    private Person p2;
    private Person p3;
    private Person p4;
    private Person p5;

    public Model() 
    {
        loadData();
    }

    public void loadData() 
    {
        //Person1 using all parameter constructor
        p1 = new Person("Marcus Allen", 200, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.");

        //Person2 using all parameter constructor
        p2 = new Person("Kyle Alston", 180, "Robbinsville, N.J.", "Robbinsville");

        //Person3 using all parameter constructor
        p3 = new Person("Troy Apke", 220, "Mt. Lebanon, Pa.", "Mount Lebanon");

        //Person4 using all parameter constructor
        p4 = new Person("Matthew Baney", 225, "State College, Pa.", "State College");

        //Person5 using no parameter constructor
        p5 = new Person();
    }

    //Getters and setters for all Persons 
    public Person getP1() 
    {
        return p1;
    }

    public void setP1(Person p1) 
    {
        this.p1 = p1;
    }

    public Person getP2() 
    {
        return p2;
    }

    public void setP2(Person p2) 
    {
        this.p2 = p2;
    }

    public Person getP3() 
    {
        return p3;
    }

    public void setP3(Person p3) 
    {
        this.p3 = p3;
    }

    public Person getP4() 
    {
        return p4;
    }

    public void setP4(Person p4) 
    {
        this.p4 = p4;
    }

    public Person getP5() 
    {
        return p5;
    }

    public void setP5(Person p5) 
    {
        this.p5 = p5;
    }
    
    //getData uses if statements to see what n is equal too then print the correct Person.
    //Anything over the amount of five Persons will return an invalid parameter. 
    public String getData(int n) 
    {
        if(n == 1)
        {
            String s = p1.toString();
            return s;
        }
        if(n == 2)
        {
            String s = p2.toString();
            return s;
        }
        if(n == 3)
        {
            String s = p3.toString();
            return s;
        }
        if(n == 4)
        {
            String s = p4.toString();
            return s;
        }
        if(n == 5)
        {
            String s = p5.toString();
            return s;
        }
        return "invalid input parameter";
    }


}

