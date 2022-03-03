package it.belstu.yadchenko;

import java.io.Serializable;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.spi.CalendarNameProvider;

public abstract class TV_Shows implements Serializable {

     Date time = new Date();
     String name = new String();
     String type = new String();

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     int duration = 0;

     public int getDuration() {
          return duration;
     }

     public void setDuration(int duration) {
          this.duration = duration;
     }

     boolean onGoing = false;

     public void LetItGoOn()
     {
          onGoing = true;
     }

     public void ShowStop()
     {
          onGoing = false;
     }



}
