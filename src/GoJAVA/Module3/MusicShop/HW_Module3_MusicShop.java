package GoJAVA.Module3.MusicShop;


import java.util.*;


public class HW_Module3_MusicShop {}

class MusicShop
{
    private ArrayList<MusicInstrument> _innerCopyInstrCollect;

    MusicShop(ArrayList<MusicInstrument> musicInstruments)
    {
        int _instrCount = 5 + (int)(Math.random() * ((15 - 5) + 1));    //Не поленился и нашёл Рандом
                                                                        //количество инструментов в магазине

        System.out.println("Добавляем "+ _instrCount +" инструмента(-ов)");

        for(int i=0; i< _instrCount; i++)
        {
            switch ((int)(Math.random()*3)+1)                           //Рандомные инструменты
            {
                case 1: musicInstruments.add(new Guitar());break;
                case 2: musicInstruments.add(new Piano());break;
                default: musicInstruments.add(new Tube());
            }
        }

        _innerCopyInstrCollect = musicInstruments;
    }

    /**
     *
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
            switch (instrument.getClass().toString()){          //Переключатель на основе типа переменной
                case "class GoJAVA.Module3.MusicShop.Guitar" :
                    System.out.print("Guitar "); break;
                case "class GoJAVA.Module3.MusicShop.Piano" :
                    System.out.print("Piano "); break;
                case "class GoJAVA.Module3.MusicShop.Tube" :
                    System.out.print("Tube ");
            }
        }
        System.out.println();
    }
}

class MusicInstrument
{

}

class Guitar extends MusicInstrument
{

}

class Piano extends MusicInstrument
{

}

class Tube extends MusicInstrument
{

}
