package Model;

/**
 *
 * @author aro
 */
import java.util.ArrayList;

public class Model {

    //ArrayList attribute for FootballPlayer, named players, (Converted from Person type and name person)
    private ArrayList<TableMember> members;

    public Model() {

        //Initalize persons ArrayList under type FootBallPlayer, (Converted from Person type and name person)
        members = new ArrayList<TableMember>();
        loadData();
    }

    public void loadData() {
        //Declare  FootballPlayers
        TableMember fbp1, fbp2, fbp3, fbp4, fbp5;

        //Player1 using all parameter constructor, uses Height class but with new Height for simplicity, uses new FootballPlayer constructor
        fbp1 = new FootballPlayer("Marcus Allen", new Height(5, 2), 200, "Upper Marlboro, Md.", "Dr. Henry A. Wise, Jr.", 2, "S");

        //Player2 using all parameter constructor, uses Height class but with new Height for simplicity, uses new FootballPlayer constructor
        fbp2 = new FootballPlayer("Kyle Alston", new Height(5, 9), 180, "Robbinsville, N.J.", "Robbinsville", 37, "CB");

        //Player3 using all parameter constructor, uses Height class but with new Height for simplicity, uses new FootballPlayer constructor
        fbp3 = new FootballPlayer("Troy Apke", new Height(6, 1), 220, "Mt. Lebanon, Pa.", "Mount Lebanon", 28, "S");

        //Player4 using all parameter constructor, uses Height class but with new Height for simplicity, uses new FootballPlayer constructor
        fbp4 = new FootballPlayer("Matthew Baney", new Height(6, 0), 225, "State College, Pa.", "State College", 35, "LB");

        //Player5 using no parameter constructor, also using Height class, uses new FootballPlayer constructor
        fbp5 = new FootballPlayer();

        //add players to ArrayList players
        members.add(fbp1);
        members.add(fbp2);
        members.add(fbp3);
        members.add(fbp4);
        members.add(fbp5);
    }

    //Get and Set method for players ArrayList, (Converted from Person type and name person)
    public ArrayList<TableMember> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<TableMember> members) {
        this.members = members;
    }
}
