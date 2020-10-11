package Controller;

import Model.Model;
import View.View;

/**
 *
 * @author aro
 */
public class Controller {

    Model model;
    View view;

    public Controller(View v, Model m) {
        model = m;
        view = v;

        //Prints all Players from getData 
        view.basicDisplay(model.getMembers().get(1).getAttributeName(3));
        view.basicDisplay(model.getMembers().get(1).getAttribute(3));
        view.basicDisplay(model.getMembers().get(1).getAttributeNames());
        view.basicDisplay(model.getMembers().get(1).getAttributes());
        view.basicDisplay("size of names=" + model.getMembers().get(1).getAttributeNames().size());
        view.basicDisplay("size of attributes=" + model.getMembers().get(1).getAttributes().size());
        //Controller asks view to display information from model
        //................
    }

}
