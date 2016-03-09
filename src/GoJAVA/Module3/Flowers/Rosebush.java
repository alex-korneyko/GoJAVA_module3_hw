package GoJAVA.Module3.Flowers;

/**
 * Class {@code Rosebush} create a rose bush
 * @version 1.0 09.03.2016
 * @author Alex Korneyko
 */
public class Rosebush {

    Rose[] Bush;                    //Массив роз

    public Rosebush(int count){

        Bush = new Rose[count];

        for(int i=0; i < Bush.length; i++)
            Bush[i] = new Rose();
    }

    /**
     * Show numbers of roses
     */
    public void GetRosebushInfo() {

        System.out.println();
        System.out.println("Rosebush contain " + Bush.length + " roses.");
    }
}