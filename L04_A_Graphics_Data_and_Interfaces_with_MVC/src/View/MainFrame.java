package View;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author aro
 */
public class MainFrame extends JFrame {

    //Create attributes with encapsulation
    private MainPanel mjp;

    public MainFrame() {//Constructor for MainFrame
        super("IST242 Table Viewer");//Sets the window name
        mjp = new MainPanel();//Initialize the panel
        this.add(mjp, "Center");
        LayoutSetupMAC();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280, 720);//Panel size
        setVisible(true);
    }

    void LayoutSetupMAC() {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //------------------------------------------------------           
    }

    //get method for 'mjp' MainPanel
    public MainPanel getMjp() {
        return mjp;
    }

    //set method for 'mjp' MainPanel
    public void setMjp(MainPanel mjp) {
        this.mjp = mjp;
    }
}
