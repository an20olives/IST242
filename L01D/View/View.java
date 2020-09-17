package View;

import java.util.ArrayList;

public class View {

    public View() {

    }

    //Used to print our data to the console
    public void basicDisplay(String s) {// view likes strings, view doesnt know about data/model
        System.out.println(s);
    }

    public void basicDisplay(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
          System.out.println(arr.get(i));
        }
    }
}
