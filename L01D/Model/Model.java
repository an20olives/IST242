package Model;

import java.util.ArrayList;

public class Model {

    //ArrayList attribute for Person, named persons
    public ArrayList<Person> persons;

    public Model() {

        //Initalize persons ArrayList under type Person
        persons = new ArrayList<Person>();
        loadData();
    }

    public void loadData() {
        //Declare persons
        Person p1, p2, p3, p4, p5;

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

        //add persons to ArrayList persons
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
    }

    public String getData(int n) {

        switch (n) { //using switch instead of if to return Persons(n).
            case 1:
                return persons.get(0).toString();//remove toStrings once getData works
            case 2:
                return persons.get(1).toString();//remove toStrings once getData works
            case 3:
                return persons.get(2).toString();//remove toStrings once getData works
            case 4:
                return persons.get(3).toString();//remove toStrings once getData works
            case 5:
                return persons.get(4).toString();//remove toStrings once getData works
            default:
                return ("invalid input parameter");
        }
    }

    public ArrayList<String> getData() {
        ArrayList<String> personsString = new ArrayList<>();
        //for loop here
        for (int i = 0; i < persons.size(); i++) {
            personsString.add(persons.get(i).toString());
        }
        return personsString;
    }
    //get and set method for persons ArrayList
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    //removed get and set methods from L01_C for individual person attributes
}
