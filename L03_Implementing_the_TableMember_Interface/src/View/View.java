package View;

import java.util.ArrayList;

/**
 *
 * @author aro
 */
public class View {

    public View() {

    }

    //Used to print our data to the console
    public void basicDisplay(String s) {// view likes strings, view doesnt know about data/model
        System.out.println(s);
    }

    public void basicDisplay(ArrayList<String> arr) {//takes arrgument from controller and prints out array contents on a new line
        //for loop takes input from controller and prints out the input on a new line
        for (int i = 0; i < arr.size(); i++) {

            //changed to print, and using if statement to print each object on a seperate line.
            System.out.print(arr.get(i) + " ");
            if (i == arr.size() || i == arr.size() - 1) {
                System.out.println("");
            }

        }
    }
}
