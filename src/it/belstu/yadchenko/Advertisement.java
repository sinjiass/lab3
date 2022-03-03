package it.belstu.yadchenko;

public class Advertisement extends TV_Shows {

    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    Advertisement(String companyName, String productName)
    {
        type = "реклама";
        this.name = companyName;
        this.productName = productName;
        duration = 15;

    }


}
