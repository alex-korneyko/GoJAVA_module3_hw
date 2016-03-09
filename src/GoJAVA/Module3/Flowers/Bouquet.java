package GoJAVA.Module3.Flowers;

/**
 * Class {@code Bouquet} create bouquet from different flowers
 * @version 1.0 09.03.2016
 * @author Alex Korneyko
 */
public class Bouquet {

    private Flower[] copyFlowers;                           //"рабочая" копия ссылки на массив цветов
    private String bqName;                                  //имя букета

    public Bouquet(Flower[] flowers, String bouquetName) {

        bqName = bouquetName;

        if(flowers == null || flowers.length < 1)
            return;                                         //Цветов в букете не может быть меньше одного,
                                                            //а также проверка на существование самого массива

        copyFlowers = flowers;                              //инициализация "рабочей" ссылки на массив цветв,
                                                            //который пока ещё содержит "места для цветов"
                                                            //но конкретных цветов ещё там нет

        for (int i=0; i <= flowers.length - 1; i++) {       //Заполнение массива конкретными цветами

            switch ((int)(Math.random()*4)){
                case 0:
                    flowers[i] = new Aster(); break;
                case 1:
                    flowers[i] = new Chamomile(); break;
                case 2:
                    flowers[i] = new Rose(); break;
                case 3:
                    flowers[i] = new Tulip();
            }
        }
    }

    /**
     * Show Bouquet content
     */
    public void GetBouquetInfo() {

        System.out.println("--Bouquet " + bqName + " ("+ copyFlowers.length+"шт)");

        Bouquet.ShowFlowers(copyFlowers);                   //Вызов статического метода разбора массива цветов
    }

    /**
     * Static method. He show info about flowers in array
     * @param flowers an array with objects
     */
    public static void ShowFlowers(Flower[] flowers) {      //Разбор массива цветов

        for(Flower flower : flowers)
            System.out.println(flower.GetFlowerInfo());

        System.out.println();
    }
}
