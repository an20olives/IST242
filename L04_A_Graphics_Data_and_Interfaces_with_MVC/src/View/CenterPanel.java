package View;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
//import javax.swing.JLabel; unused inport, using JButton instead, may use later
import javax.swing.JPanel;

/**
 *
 * @author aro
 */
public class CenterPanel extends JPanel {

    //Create attributes with encapsulation
    private GridLayout grid;
    private ArrayList<JButton> buttonArray;
    private ArrayList<JButton> labelArray;
    private ArrayList<ArrayList<JButton>> buttonArrayArray;

    public CenterPanel() {
        //Empty constructor for CenterPanel
    }

    public void createButtons(int x, int y) {//Method to create buttons and set up the layout based on rows 'x' and columns 'y'
        labelArray = new ArrayList<>(y);//labelArray, used for headers at the top of the panel
        for (int i = 0; i < y; ++i) {//'y' represents the columns in our panel, for loop to add header labels(buttons) to the panel
            JButton header = new JButton();
            header.setBackground(Color.LIGHT_GRAY);//Sets the background color of the label
            //adds the header labels containg attribute information to the panel
            add(header);
            labelArray.add(i, header);
        }
        buttonArrayArray = new ArrayList<>(x);//buttonArrayArray, used for buttons throughout the panel
        for (int i = 0; i < x; ++i) {//'x' represents the rows in our panel, for loop to add buttons to the panel
            buttonArray = new ArrayList<>(y);
            for (int j = 0; j < y; ++j) {
                JButton button = new JButton();
                //adds the buttons containing the player information to the panel
                add(button);
                buttonArray.add(j, button);
            }

            buttonArrayArray.add(i, buttonArray);
        }
        setBackground(Color.BLACK);//Sets the background color of the panel
        grid = new GridLayout(0, y);//Sets up the gridlayout of the panel
        setLayout(grid);
        this.validate();//Relocates layout after changes have been made
        this.repaint();//Forces the screen to be refreshed
    }

    public void writeDataOnButtons(ArrayList<ArrayList<String>> footballPlayerData, ArrayList<String> headerNames) {//Method sets the buttons and labels based on the playerData and the headerNames
        for (int i = 0; i < headerNames.size(); ++i) {//for loop for getting header information(attributeNames) and setting the header labels as these
            labelArray.get(i).setText(headerNames.get(i));
        }
        //was playerData
        for (int i = 0; i < footballPlayerData.size(); ++i) {//for loop for getting button infromation throughout the panel
            for (int j = 0; j < footballPlayerData.get(i).size(); ++j) {
                buttonArrayArray.get(i).get(j).setText(footballPlayerData.get(i).get(j));
            }
        }
        this.validate();//Relocates layout after changes have been made
        this.repaint();//Forces the screen to be refreshed
    }

    //get for the grid
    public GridLayout getGrid() {
        return grid;
    }

    //set for the grid
    public void setGrid(GridLayout grid) {
        this.grid = grid;
    }

    //get for buttonArray
    public ArrayList<JButton> getButtonArray() {
        return buttonArray;
    }

    //set for buttonArray
    public void setButtonArray(ArrayList<JButton> buttonArray) {
        this.buttonArray = buttonArray;
    }

    //get for labelArray
    public ArrayList<JButton> getLabelArray() {
        return labelArray;
    }

    //set for labelArray
    public void setLabelArray(ArrayList<JButton> labelArray) {
        this.labelArray = labelArray;
    }

    //get for buttonArrayArray
    public ArrayList<ArrayList<JButton>> getButtonArrayArray() {
        return buttonArrayArray;
    }

    //set for buttonArrayArray
    public void setButtonArrayArray(ArrayList<ArrayList<JButton>> buttonArrayArray) {
        this.buttonArrayArray = buttonArrayArray;
    }
}
