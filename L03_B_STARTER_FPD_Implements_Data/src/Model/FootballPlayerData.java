package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class FootballPlayerData implements TableData {

    private ArrayList<TableMember> players;

    public FootballPlayerData() {
        players = new ArrayList<>();
        loadTable();
    }

    @Override
    public void loadTable() {//type the data //read from a database //read from a XML file
        ReadPlayersFromXML();
    }

    public void ReadPlayersFromXML() {//reads the data from XML file using the XMLDecoer
        try {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null) {
                try {
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);

                } catch (ArrayIndexOutOfBoundsException theend) {
                    //System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx) {
            xx.printStackTrace();
        }
    }

    @Override
    public ArrayList<TableMember> getTable() {
        ArrayList<TableMember> tableList = new ArrayList<>();
        for (int i = 0; i < getPlayers().size(); i++) {
            tableList.add(getPlayers().get(i));
        }
        return tableList;
    }

    @Override
    public ArrayList<String> getHeaders() {//gets the attributeNames from headers in XML
        return new FootballPlayer().getAttributeNames(); //returns getAttributeNames method from FootballPlayer for simplicity
    }

    @Override
    public ArrayList<String> getLine(int line) {//gets the attributes from requested line in XML
        return players.get(line).getAttributes();//returns getAttributes method from FootballPlayer for simplicity
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {//gets lines from XML to store in ArrayList from ex lines 100 to 103
        ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();
        for (int i = firstLine; i < lastLine; i++) {//NOTE i < lastLine, changed from <= //this change gets us the proper output of lines=3 instead of lines=4 and an extra player object
            lines.add(getLine(i));
        }
        return lines;
    }

    //Get and Set methods for players ArrayList
    public ArrayList<TableMember> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<TableMember> players) {
        this.players = players;
    }

}
