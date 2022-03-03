package it.belstu.yadchenko;

import java.io.Serializable;
import java.util.*;

public class TV_Program implements Serializable {

    public GregorianCalendar DateNTime = new GregorianCalendar(2022, Calendar.FEBRUARY, 23);
    TV_Program()
    {
        DateNTime.set(DateNTime.HOUR, 4);
        DateNTime.set(DateNTime.MINUTE, 0);
    }



    public ArrayList<TV_Shows> TV_ProgramList = new ArrayList();

    public void Add(TV_Shows x)
    {
        x.time = this.DateNTime.getTime();
        x.onGoing = true;
        this.DateNTime.add(Calendar.MINUTE, x.duration);
        if(TV_ProgramList.size()!=0)
            TV_ProgramList.get(TV_ProgramList.size()-1).onGoing = false;

        TV_ProgramList.add(x);
    }

    public void ShowTVProgram()
    {
        for(int i=0; i<TV_ProgramList.size();i++)
            System.out.println(TV_ProgramList.get(i).time+"\t" + TV_ProgramList.get(i).name + "\t\t" + TV_ProgramList.get(i).type+"\t"+TV_ProgramList.get(i).onGoing);
    }



}
