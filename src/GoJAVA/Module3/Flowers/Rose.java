package GoJAVA.Module3.Flowers;

/**
 * Class {@code Rose} create flower as rose
 * @version 1.0 09.03.2016
 * @author Alex Korneyko
 */
public class Rose extends Flower {

    /**
     * Method for only rose
     * @return string " a Rose"
     */
    @Override
    public String GetFlowerInfo() {

        return super.GetFlowerInfo() + " a Rose";
    }
}
