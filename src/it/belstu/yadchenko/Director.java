package it.belstu.yadchenko;

import java.util.ArrayList;

public class Director {

    public int FindLongest(TV_Program tv_program)
    {
        int max = 0;
        try {
                max = tv_program.TV_ProgramList.get(0).duration;
                for (var item : tv_program.TV_ProgramList) {
                    if (item.duration > max)
                        max = item.duration;
            }
        }
        catch (Exception e)
        {

        }
        return max;
    }

    public int DurationSum(TV_Program tv_program)
    {
        int sum = 0;
        try {
            for (var item : tv_program.TV_ProgramList
            ) {
                sum += item.duration;

            }
        }
        catch (Exception e){}

        return sum;
    }

    public void SearchForType(TV_Program tv_program, final String key)
    {
        for (var item:tv_program.TV_ProgramList
             ) {
                if(key == item.type)
                    System.out.println(item.name);
                else if(key == item.type)
                    System.out.println(item.name);
                else if (key == item.type)
                    System.out.println(item.name);
                else if (key == item.type)
                    System.out.println(item.name);
                else
                    System.out.println("Несуществующий тип");
            }

        }
    }


