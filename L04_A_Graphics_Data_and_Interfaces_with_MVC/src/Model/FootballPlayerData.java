package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 *
 * @author aro
 */
public class FootballPlayerData implements TableData, Displayable {

    //Create attributes with encapsulation
    private ArrayList<TableMember> players;
    private int firstLineToDisplay;
    private int lastLineToDisplay;
    private int linesBeingDisplayed;
    private int lineToHighlight;

    public FootballPlayerData() {
        //Determines what lines are displayed
        this.setFirstLineToDisplay(100);//First line to be displayed in table
        this.setLinesBeingDisplayed(20);//Total number of lines to be displayed in table
        this.setLastLineToDisplay(firstLineToDisplay + linesBeingDisplayed);//The last line to be displayed in the table, using '-1' here cause a blank button
        lineToHighlight = 0;//Gets the line to highlight, not implemented in L04A

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

    //Get methods for players ArrayList
    public ArrayList<TableMember> getPlayers() {
        return players;
    }

    //Set methods for players ArrayList
    public void setPlayers(ArrayList<TableMember> players) {
        this.players = players;
    }

    //Get and Set methods for displayable interface
    //getter for firstLine
    @Override
    public int getFirstLineToDisplay() {
        return firstLineToDisplay;
    }

    //getter for highlightedLine
    @Override
    public int getLineToHighlight() {
        return lineToHighlight;
    }

    //getter for lastLine
    @Override
    public int getLastLineToDisplay() {
        return lastLineToDisplay;
    }

    //getter for numberOfLines
    @Override
    public int getLinesBeingDisplayed() {
        return linesBeingDisplayed;
    }

    //setter for firstLine
    @Override
    public void setFirstLineToDisplay(int firstLineToDisplay) {
        this.firstLineToDisplay = firstLineToDisplay;
    }

    //setter for highlightedLine
    @Override
    public void setLineToHighlight(int lineToHighlight) {
        this.lineToHighlight = lineToHighlight;
    }

    //setter for lastLine
    @Override
    public void setLastLineToDisplay(int lastLineToDisplay) {
        this.lastLineToDisplay = lastLineToDisplay;
    }

    //setter for numberOfLines
    @Override
    public void setLinesBeingDisplayed(int linesBeingDisplayed) {
        this.linesBeingDisplayed = linesBeingDisplayed;
    }
}
