package View;

import java.util.ArrayList;

public class View {

    public View() {

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

}
