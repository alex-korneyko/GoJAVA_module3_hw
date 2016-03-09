package GoJAVA.Module3.Flowers;

/**
 * Class {@code Chamomile} create flower as chamomile
 * @version 1.0 09.03.2016
 * @author Alex Korneyko
 */
public class Chamomile extends Flower {

    /**
     * Method for only chamomile
     * @return string " a Chamomile"
     */
    @Override
    public String GetFlowerInfo() {

        return super.GetFlowerInfo() + " a Chamomile";
    }
}
