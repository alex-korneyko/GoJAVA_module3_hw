package GoJAVA.Module3.Flowers;

/**
 * Empty class
 * Only for file name
 */
public class HW_Module3_flowers {}

/**
 * Class {@code Bouquet}
 */
class Bouquet
{
    private Flower[] _copyFlowers;                     //"рабочая" копия ссылки на массив цветов
    private String _bqName;                             //имя букета

    Bouquet(Flower[] flowers, String bouquetName)      //Создание букета (КОНСТРУКТОР)
    {
        _bqName = bouquetName;

        int indexLastFlower = flowers.length - 1;       //Индекс последнего цветка в букете

        if(indexLastFlower < 0) return;                 //Цветов в букете не может быть меньше одного,
                                                        //т.е. индекс не может быть меньше нуля

        _copyFlowers = flowers;                         //инициализация "рабочей" ссылки на массив цветв,
                                                        //который пока ещё содержит "места для цветов"
                                                        //но конкретных цветов ещё там нет

        for (int i=0; i <= indexLastFlower; i++)        //Заполнение массива конкретными цветами
        {
            _copyFlowers[i] = new Rose();               //************************************
                                                        //*Заполнение происходит поочерёдным созданием
            if(indexLastFlower < ++i) return;           //*объктов каждого типа цветка, и помещение
                                                        //*его в массив. При чём приходится вручную
            _copyFlowers[i] = new Chamomile();          //*увеличивать счётчик "i" и проверять его
                                                        //*на возможность выхода за пределы массива.
            if(indexLastFlower < ++i) return;           //*Можно было бы просто сделать рандомный
                                                        //*выбор каждого цветка и помещение его в
            _copyFlowers[i] = new Aster();              //*ячейку массива, но я не знаю функции
                                                        //*Рандома в JAVA
            if(indexLastFlower < ++i) return;           //*************************************

            _copyFlowers[i] = new Tulip();
        }
    }

    /**
     * Show Bouquet content
     */
    public void GetBouquetInfo()                        //Вывод имени и содержания букета
    {
        System.out.println("--Bouquet " + _bqName + " ("+_copyFlowers.length+"шт)");

        Bouquet.ShowFlowers(_copyFlowers);              //Вызов статического метода разбора массива цветов
    }


    public static void ShowFlowers(Flower[] flowers)    //Разбор массива цветов
    {
        for(Flower flower : flowers)
        {
            flower.GetFlowerInfo();                     //Выполнение метода из класса Flower,
                                                        //общего для всех объектов цветов
            if (flower.getClass() == Rose.class)            //***********************************
                ((Rose) flower).GetRoseInfo();              //*Проверка каждого объекта Flower на соответствие
            else if (flower.getClass() == Aster.class)      //*конкретному типу цветка, с последующим
                ((Aster) flower).GetAsterInfo();            //*приведением к этому типу и вызову соответствующего
            else if (flower.getClass() == Chamomile.class)  //*info-метода.
                ((Chamomile) flower).GetChamomileInfo();    //***********************************
            else if (flower.getClass() == Tulip.class)
                ((Tulip) flower).GetTulipInfo();
        }
        System.out.println();
    }
}


/**
 * Class {@code Flower} common class for all flowers
 */
class Flower
{
    public void GetFlowerInfo()
    {
        System.out.print("This flower ");
    }
}

class Rose extends Flower
{
    public void GetRoseInfo()
    {
        System.out.println("a Rose");
    }
}

class Chamomile extends Flower
{
    public void GetChamomileInfo()
    {
        System.out.println("a Chamomile");
    }
}

class Aster extends Flower
{
    public void GetAsterInfo()
    {
        System.out.println("an Aster");
    }
}

class Tulip extends Flower
{
    public void GetTulipInfo()
    {
        System.out.println("a Tulip");
    }
}

/**
 * Class {@code Rosebush} create bush of Roses
 * Розовый куст. Создаётся массив объектов Rose
 * Выводит количество объектов Rose
 */
class Rosebush
{
    Rose[] Bush;                    //Массив роз

    Rosebush(int count){
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