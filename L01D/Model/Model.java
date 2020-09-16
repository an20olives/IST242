package Model;

import java.util.ArrayList;

public class Model {

    //created new ArrayList for storing persons
    private ArrayList<Person> persons;

    public Model() {
        persons = new ArrayList<>();
        loadData();
    }

    public void loadData() {

        // declare the Person' here
        Person p1, p2, p3, p4, p5;

        //Person1 using all parameter constructor, also using new Height class
        p1 = new Person("Marcus Allen", 5, 2, 200, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.");
        persons.add(p1); //adds p1 to the Person array

        //Person2 using all parameter constructor, also using new Height class
        p2 = new Person("Kyle Alston", 5, 9, 180, "Robbinsville, N.J.", "Robbinsville");
        persons.add(p2); //adds p2 to the Person array

        //Person3 using all parameter constructor, also using new Height class
        p3 = new Person("Troy Apke", 6, 1, 220, "Mt. Lebanon, Pa.", "Mount Lebanon");
        persons.add(p3); //adds p3 to the Person array

        //Person4 using all parameter constructor, also using new Height class
        p4 = new Person("Matthew Baney", 6, 0, 225, "State College, Pa.", "State College");
        persons.add(p4); //adds p4 to the Person array

        //Person5 using no parameter constructor, also using new Height class
        p5 = new Person();
        persons.add(p5); //adds p5 to the Person array
    }

    //getData(int n)
    //getData()
    //for loop
    //return ArrayList<String>
    //modified getData method for use with the array
    
    //BOTH GETDATA WORK IN CRIPPLED STATE FIX IT
    public String getData(int n) {
        String s = persons.get(n).toString();
        return s;
    }

    public ArrayList<String> getData() {
        ArrayList<String> getData = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            getData.add(persons.get(i).toString());
            getData.add("\n");
        }
        return getData;
    }

    //get and set methods for the person array
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

}
