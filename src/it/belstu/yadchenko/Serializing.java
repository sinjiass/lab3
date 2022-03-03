package it.belstu.yadchenko;

import java.io.*;

public class Serializing {

    public boolean Serialize(TV_Program o)
    {
        try {
            FileOutputStream fos = new FileOutputStream("tv_program.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o);
            oos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        finally {
        return true;
        }
    }

    public TV_Program Deserialize()
    {
        TV_Program anyDay = new TV_Program();
        try {
            FileInputStream fis = new FileInputStream("tv_program.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            anyDay = (TV_Program) ois.readObject();
            ois.close();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            return anyDay;
        }
        }
}
