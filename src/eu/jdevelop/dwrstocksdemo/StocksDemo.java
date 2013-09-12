package eu.jdevelop.dwrstocksdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.proxy.dwr.Util;
import org.directwebremoting.util.Logger;
 
/**
 * Reverse Ajax class.
 * 
 * @author Siegfried Bolz (blog.jdevelop.eu)
 */
public class StocksDemo {
 
    protected static final Logger log = Logger.getLogger(StocksDemo.class);
       
    private List<StocksBean> stocks = new ArrayList<StocksBean>();

    
    /**
     * Initialize the stocklist with values.
     */
    public StocksDemo() {
        stocks.add(new StocksBean("bmw", "36.55"));
        stocks.add(new StocksBean("linde", "91.01"));
        stocks.add(new StocksBean("commerzbank", "22.59"));
        stocks.add(new StocksBean("infineon", "5.07"));
        stocks.add(new StocksBean("siemens", "71.77"));
        stocks.add(new StocksBean("sap", "31.61"));
        stocks.add(new StocksBean("bayer", "51.29"));
        stocks.add(new StocksBean("metro", "52.70"));
        stocks.add(new StocksBean("tui", "16.96"));
        stocks.add(new StocksBean("daimler", "54.34"));
        stocks.add(new StocksBean("vw", "178.48"));
        stocks.add(new StocksBean("allianz", "134.48"));
        stocks.add(new StocksBean("deutschebank", "76.32"));
        stocks.add(new StocksBean("rwe", "80.63"));
        stocks.add(new StocksBean("hypo", "18.79"));
        stocks.add(new StocksBean("deutschepost", "20.19"));
        stocks.add(new StocksBean("telekom", "11.13"));
    }

    
    /**
     * Send the Stock-Values to the file "index.jsp"
     */
    public void sendStocks() throws InterruptedException {
        WebContext wctx = WebContextFactory.get();
        String currentPage = wctx.getCurrentPage();

        Collection sessions = wctx.getScriptSessionsByPage(currentPage);
        Util utilAll = new Util(sessions);
  
        for (int i = 0; i < stocks.size(); i++) {
            Thread.sleep(1000);
            utilAll.setValue(stocks.get(i).getStock(), stocks.get(i).getValue());
            log.info("Pushing stock: " + stocks.get(i).getStock() + " = " + stocks.get(i).getValue());
        }

    }

}