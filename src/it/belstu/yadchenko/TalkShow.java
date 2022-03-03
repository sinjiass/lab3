package it.belstu.yadchenko;

public class TalkShow extends TV_Shows {


    private String host;
    private String guest;



    TalkShow(int duration, String name, String host, String guest)
    {
        type = "токшоу";
        this.host= host;
        this.guest = guest;
        this.name = name;
        this.duration = duration;
    }


    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

}
