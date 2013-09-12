package eu.jdevelop.dwrstocksdemo;

/**
 * This bean is used for storing one stock rate.
 * 
 * @author Siegfried Bolz
 */
public class StocksBean {

    private String stock = "";
    private String value = "";

    public StocksBean(String stock, String value) {
        this.setStock(stock);
        this.setValue(value);
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}