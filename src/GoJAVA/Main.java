package GoJAVA;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("--------- FILES ---------");

        Directory newDir = new Directory();

        newDir.GetDirInfo();

        System.out.println("--------- FLOWERS ---------");

        Flower[] flowers = new Flower[7];                         //Есть желание собрать букет из цветов (7шт)
                                        //Создание массива для разных цветов, но пока без цветов

        Bouquet newBouquet = new Bouquet(flowers, "First");         //Соберём букет
                                        //Создание букета. Передача в конструктор массива для цветов
                                        //и имени букета. Массив заполняется в классе букета

        newBouquet.GetBouquetInfo();                                //Пересмотрим цветы в букете

        Flower[] flowers2 = new Flower[9];                        //Опять есть желание букета (9шт)
                                        //Создание второго массива для разных цветов, но пока без цветов

        newBouquet = new Bouquet(flowers2, "Second");               //Соберём букет вместо первого
                                        //Создание нового букета. Передача в конструктор второго массива для цветов
                                        //и имени букета. Массив заполняется в классе букета

        newBouquet.GetBouquetInfo();                                //Пересмотрим цветы в букете

                                                                    //Просто заголовок в выводе на консоль
        System.out.println("Цветы от старого букета ("+flowers.length+"шт)");

        Bouquet.ShowFlowers(flowers);                               //Первого букета уже нет, а цветы от него есть ))
                                        //Вызов статического метода, показывающего цветы в массиве

        Rosebush bush = new Rosebush(101);                          //Розовый куст
        bush.GetRosebushInfo();

    }
}

//-----------------------------------------------------------------