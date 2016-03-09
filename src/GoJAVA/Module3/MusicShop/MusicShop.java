
package GoJAVA.Module3.MusicShop;

import java.util.ArrayList;

/**
 * Class {@code MusicShop} create shop with musical instruments
 * and gives info about them
 * @version 1.0 09.03.2014
 * @author Alex Korneyko
 */
public class MusicShop {
    private ArrayList<MusicInstrument> _innerCopyInstrCollect;

    public MusicShop(ArrayList<MusicInstrument> musicInstruments)
    {
        //Диапазон начального количества инстументов в магазине
        int minInstruments = 5;                                 //Минимум инструментов в магазине
        int maxInstruments = 15;                                //Максимум инструментов в магазине

        int _instrCount = minInstruments + (int)(Math.random()
                * ((maxInstruments - minInstruments) + 1));     //Ф-ла Рандомного числа от min до max
                                                                //количество инструментов в магазине

        System.out.println("Добавляем "+ _instrCount +" инструмента(-ов)");

        for(int i = 0; i < _instrCount; i++)
        {
            switch ((int)(Math.random()*3)+1)                   //Рандомные инструменты
            {
                case 1: musicInstruments.add(new Guitar());break;
                case 2: musicInstruments.add(new Piano());break;
                default: musicInstruments.add(new Tube());
            }
        }

        _innerCopyInstrCollect = musicInstruments;
    }

    /**
     * @return Instruments count
     */
    public int GetInstrumentsCount()
    {
        return _innerCopyInstrCollect.size();
    }

    /**
     * Show Instruments in shop
     */
    public void ShowInstruments()
    {
        for(MusicInstrument instrument: _innerCopyInstrCollect)
        {
            if (instrument instanceof Guitar) System.out.print("Guitar ");
            if (instrument instanceof Piano) System.out.print("Piano ");
            if (instrument instanceof Tube) System.out.print("Tube ");
        }

        System.out.println();
    }
}
