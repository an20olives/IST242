package Model;

/**
 *
 * @author aro
 */
//Removed code from L03A model is much more generic
public class Model {

    private FootballPlayerData fpData;

    public Model() {
        fpData = new FootballPlayerData();
    }

    public FootballPlayerData getFpData() {
        return fpData;
    }

    public void setFpData(FootballPlayerData fpd) {
        this.fpData = fpd;
    }
}
