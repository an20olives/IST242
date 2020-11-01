package View;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author aro
 */
public class MainPanel extends JPanel {

    //Create attributes with encapsulation
    private CenterPanel cp;

    public MainPanel() {//Constructore for MainPanel
        super();

        BorderLayout bl = new BorderLayout();//BorderLayout for this panel allows resizing of CenterPanel
        setLayout(bl);//Sets the layout as 'bl'

        cp = new CenterPanel();//Initialize cp

        add(cp, BorderLayout.CENTER);
    }

    //get method for 'cp' CenterPanel
    public CenterPanel getCp() {
        return cp;
    }

    //set method for 'cp' CenterPanel
    public void setCp(CenterPanel cp) {
        this.cp = cp;
    }

}
