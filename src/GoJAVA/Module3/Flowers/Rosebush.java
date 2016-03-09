package GoJAVA.Module3.Flowers;

/**
 * Class {@code Rosebush} create bush of Roses
 * Розовый куст. Создаётся массив объектов Rose
 * Выводит количество объектов Rose
 */
public class Rosebush
{
    Rose[] Bush;                    //Массив роз

    public Rosebush(int count){
        Bush = new Rose[count];
        for(int i=0; i<Bush.length; i++)
            Bush[i] = new Rose();
    }

    /**
     * Show numbers of roses
     */
    public void GetRosebushInfo()
    {
        System.out.println();
        System.out.println("Rosebush contain " + Bush.length + " roses.");
    }


}