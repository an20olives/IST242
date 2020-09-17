package Controller;

import Model.Model;
import View.View;

public class Controller {

    Model model;
    View view;

    public Controller(View v, Model m) {
        model = m;
        view = v;

        //Prints all Person from getData 
        //view.basicDisplay(model.getData()); <<<< this methods "replaces" the 3 lines below
        view.basicDisplay(model.getPersons().get(0).toString());
        view.basicDisplay(model.getPersons().get(1).toString());
        view.basicDisplay(model.getPersons().get(2).toString());

        
        /* Old basic display print from L01_C
        view.basicDisplay(model.getData(1));
        view.basicDisplay(model.getData(2));
        /...
        //This one will be invalid
        view.basicDisplay(model.getData(6));
        //Controller asks view to display information from model
        //................
        */
    }

}
