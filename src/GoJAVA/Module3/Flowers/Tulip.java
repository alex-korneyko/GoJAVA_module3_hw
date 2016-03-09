package GoJAVA.Module3.Flowers;

/**
 * Class {@code Tulip} create flower as tulip
 * @version 1.0 09.03.2016
 * @author Alex Korneyko
 */
public class Tulip extends Flower {

    /**
     * Method for only tulip
     * @return string " a Tulip"
     */
    @Override
    public String GetFlowerInfo() {

        return super.GetFlowerInfo() + " a Tulip";
    }
}
