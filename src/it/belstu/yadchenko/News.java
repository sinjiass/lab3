package it.belstu.yadchenko;

public class News extends TV_Shows {

    String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    News()
    {
        type = "новости";
        name = "Новини 24";
        duration = 30;
    }
    News(String host)
    {
        type = "новости";
        this.host = host;
        name = "Новини 24";
        duration = 30;
    }

}
