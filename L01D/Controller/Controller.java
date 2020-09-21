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
        view.basicDisplay(model.getData()); //<<<< this methods "replaces" the lines below
        
        //System.out.println(model.getData()); //direct test to see if array prints as full line '[]' present 
        /*
        view.basicDisplay(model.getPersons().get(0).toString());
        view.basicDisplay(model.getPersons().get(1).toString());
        view.basicDisplay(model.getPersons().get(2).toString());
        view.basicDisplay(model.getPersons().get(3).toString());
        view.basicDisplay(model.getPersons().get(4).toString());
         */
        //Controller asks view to display information from model
        //................
    }

}
