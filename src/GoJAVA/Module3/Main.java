package GoJAVA.Module3;

import

import GoJAVA.*;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("--------- FILES ---------");

        Directory newDir = new Directory();

        newDir.GetDirInfo();

        //---------------------------------------------------------------------------------------------------------

        System.out.println("--------- FLOWERS ---------");

        Flower[] flowers = new Flower[7];                         //Есть желание собрать букет из цветов (7шт)
                                        //Создание массива для разных цветов, но пока без цветов

        Bouquet newBouquet = new Bouquet(flowers, "First");         //Соберём букет
                                        //Создание букета. Передача в конструктор массива для цветов
                                        //и имени букета. Массив заполняется в классе букета

        newBouquet.GetBouquetInfo();                                //Пересмотрим цветы в букете

        Flower[] flowers2 = new Flower[9];                        //Опять есть желание букета (9шт)
                                        //Создание второго массива для разных цветов, но пока без цветов

        newBouquet = new Bouquet(flowers2, "Second");               //Соберём букет вместо первого (первый удаляется)
                                        //Создание нового букета. Передача в конструктор второго массива для цветов
                                        //и имени букета. Массив заполняется в классе букета

        newBouquet.GetBouquetInfo();                                //Пересмотрим цветы в букете

                                                                    //Просто заголовок в выводе на консоль
        System.out.println("Цветы от старого букета ("+flowers.length+"шт)");

        Bouquet.ShowFlowers(flowers);                               //Первого букета уже нет, а цветы от него есть ))
                                        //Вызов статического метода, показывающего цветы в массиве

        System.out.println("Цирк уехал, а клоуны остались :)");

        Rosebush bush = new Rosebush(101);                          //Розовый куст
        bush.GetRosebushInfo();


        //---------------------------------------------------------------------------------------------------------

        System.out.println("--------- MUSICSHOP ---------");

        System.out.println("Создание коллекции для инструментов");

        ArrayList<MusicInstrument> musicInstruments = new ArrayList<>();    //Пустая коллекция для инструментов

        System.out.println("Размер коллекции: "+musicInstruments.size());

        System.out.println("Открытие магазина");

        MusicShop musicShop = new MusicShop(musicInstruments);              //Создаём магазин, конструктор которого
                                        //заполняет коллекцию. При удалении этого объекта, коллекция с инструментами
                                        //останется существовать

        System.out.println("В магазине "+musicShop.GetInstrumentsCount()+" инструмента(-ов)");
        System.out.print("Это: ");
        musicShop.ShowInstruments();

        System.out.println("В коллекции "+musicInstruments.size()+" инструментов");

        System.out.println("Закрываем магазин, т.е. на его месте открываем новый");

        musicShop = new MusicShop(new ArrayList<>());

        System.out.println("В новом магазине новые инструменты, их "+musicShop.GetInstrumentsCount());
        System.out.print("Это: ");
        musicShop.ShowInstruments();

        System.out.println("Старого магазина уже нет,");
        System.out.println("а инструментов после него всё ещё "+musicInstruments.size()+" (старая коллекция)");
    }
}

