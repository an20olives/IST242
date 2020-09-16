package View;

import java.util.ArrayList;

public class View {

    public View() {

    }
    
    //Used to print our data to the console
    
    //GET THIS TO PRINT TO CONSOLE W NEW LINES BETWEEN EACH ARRAY ADDITION, SHOULD BE DONE HERE FIGURE IT OUT!
    public void basicDisplay(ArrayList<String> arr) {
        /*
        int i;
        for(i=0; i<=5; i++){
            System.out.println(1);
        }*/
        System.out.println(arr);
    }
    
    public void basicDisplay(String s) {// view likes strings, view doesnt know about data/model
        System.out.println(s);
    }

}
