package l01a;

/**
 *
 * @author aro
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Person1 using all parameter constructor
        Person p1 = new Person("Marcus Allen", 200, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.");
        //Use toString to print person
        System.out.println(p1.toString());
        
        //Person2 using all parameter constructor
        Person p2 = new Person("Kyle Alston", 180, "Robbinsville, N.J.", "Robbinsville");
        //Use toString to print person
        System.out.println(p2.toString());
        
        //Person3 using all parameter constructor
        Person p3 = new Person("Troy Apke", 220, "Mt. Lebanon, Pa.", "Mount Lebanon");
        //Use toString to print person
        System.out.println(p3.toString());
        
        //Person4 using all parameter constructor
        Person p4 = new Person("Matthew Baney", 225, "State College, Pa.", "State College");
        //Use toString to print person
        System.out.println(p4.toString());
        
        //Person5 using no parameter constructor
        Person p5= new Person();
        //Use toString to print person
        System.out.println(p5.toString());
    }
    
}