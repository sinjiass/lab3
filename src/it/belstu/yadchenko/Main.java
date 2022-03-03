package it.belstu.yadchenko;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Serializing serializator = new Serializing();

        TV_Program monday = new TV_Program();
        Director d1 = new Director();

        Movies dieHard = new Movies(120, "Крепкий орешек");
        Movies fastNFurious = new Movies(100, "Форсаж");
        TalkShow urgant = new TalkShow(40, "Вечерний ургант", "Иван Ургант", "Бузулуцкая Анастасия");
        News news_1 = new News();
        Advertisement roshen = new Advertisement("Рошен", "канфетки");


        monday.Add(urgant);
        monday.Add(dieHard);
        monday.Add(fastNFurious);
        monday.Add(roshen);
        monday.Add(news_1);


        monday.ShowTVProgram();

        System.out.println(d1.FindLongest(monday));
        System.out.println(d1.DurationSum(monday));
        d1.SearchForType(monday, "реклама");

        serializator.Serialize(monday);
        TV_Program tuesday = new TV_Program();
        tuesday = serializator.Deserialize();
        tuesday.ShowTVProgram();
    }
}
