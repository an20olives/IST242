package View;

import java.util.ArrayList;

/**
 *
 * @author aro
 */
public class View {

    //Create attributes with encapsulation
    private MainFrame mf;

    public View() {//Constructor for view
        mf = new MainFrame();
    }

    public void CenterInitialSetup(int x, int y) {//sets up center panel with the given rows and columns
        mf.getMjp().getCp().createButtons(x, y);
    }

    //was playerData
    public void CenterUpdate(ArrayList<ArrayList<String>> footballPlayerData, ArrayList<String> headerNames) {//fills center panel with the player data and header information
        mf.getMjp().getCp().writeDataOnButtons(footballPlayerData, headerNames);
    }

    public void basicDisplay(String s) {//basicDisplay to print string s
        System.out.println(s);
    }

    public void basicDisplay(ArrayList<String> arr) {//second basicDisplay that overrides the first
        for (String s : arr) {//For loop to move through the arrayList and print String s
            System.out.print(s + " ");
        }
        System.out.println("");
    }

    public void linesDisplay(ArrayList<ArrayList<String>> arrOfarr) {//linesDisplay method prints arrayList from arrayList as a string
        //2 for loops !!! 2 for loops !!!
        for (int i = 0; i < arrOfarr.size(); i++) {//Using 2 for loops 
            for (int j = 0; j < 7; j++) {
                System.out.print(arrOfarr.get(i).get(j) + " ");
            }
            System.out.println("");
        }
    }

    //get method for 'mf' InitialFrame
    public MainFrame getMf() {
        return mf;
    }

    //set method for 'mf' MainFrame
    public void setMf(MainFrame mf) {
        this.mf = mf;
    }

}
