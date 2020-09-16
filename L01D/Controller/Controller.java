package Controller;

import Model.Model;
import View.View;

public class Controller {

    Model model;
    View view;

    public Controller(View v, Model m) {
        model = m;
        view = v;

        //Prints all Person from getData now using the array
        view.basicDisplay(model.getData());
        
        /* //old print using basic display, remove me
        view.basicDisplay(model.getData(2));
        view.basicDisplay(model.getData(3));
        view.basicDisplay(model.getData(4));
        view.basicDisplay(model.getData(5));
        //This one will be invalid
        view.basicDisplay(model.getData(6));
        */
        //Controller asks view to display information from model
        //................
    }

}
