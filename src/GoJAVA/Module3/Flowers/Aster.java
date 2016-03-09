package GoJAVA.Module3.Flowers;

/**
 * Class {@code Aster} create flower as aster
 * @version 1.0 09.03.2016
 * @author Alex Korneyko
 */
public class Aster extends Flower {

    /**
     * Method for only aster
     * @return string " an Aster"
     */
    @Override
    public String GetFlowerInfo() {

        return super.GetFlowerInfo() + " an Aster";
    }
}
