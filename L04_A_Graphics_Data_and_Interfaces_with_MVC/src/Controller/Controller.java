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

    public Controller(Model m, View v) {
        model = m;
        view = v;
        //Using recommended code from Canvas L04A example
        view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed(), model.getFpData().getHeaders().size());
        view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(),
                model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
    }

}
