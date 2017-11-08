package comp1110.exam;

import java.util.*;

import static comp1110.exam.Q3SimpleStockManager.*;

/**
 * COMP1110 Final Exam, Question 3ii
 */
public class Q3StockManager {
    /**
     * A new vendor has been introduced.
     *
     * @param vid The vid of the new vendor vendor
     * @param name The product’s name
     */
    static HashMap<String, String>  vn = new HashMap<>(); //vid-name
    static HashMap<String, String>  sv = new HashMap<>(); //sku-vid
    public void newVendor(String vid, String name)
    {
        vn.put(vid,name);
        // FIXME Question 3iia: complete this function
    }

    /**
     * A new product has been introduced.
     *
     * @param sku The product’s sku
     * @param vid The vid of the product's vendor
     * @param name The product’s name
     * @param price The product’s price (per unit)
     */
    public void newItem(String sku, String vid, String name, double price)
    {
        sn.put(sku,name);
        sp.put(sku,price);
        ss.put(sku,0);
        st.put(sku,0);
        sv.put(sku,vid);
        vn.put(sku,null);
        // FIXME Question 3iib: complete this function
    }

    /**
     * Return the name of a product.
     *
     * @param sku The product’s sku
     * @return the name of the product
     */
    public String getItemName(String sku)
    {
        return sn.get(sku); // FIXME Question 3iic: complete this function
    }

    /**
     * Return the name of a product's vendor.
     *
     * @param sku The product’s sku
     * @return the name of the product's vendor
     */
    public String getItemVendorName(String sku)
    {
        return vn.get(sv.get(sku)); // FIXME Question 3iid: complete this function
    };

    /**
     * Return the price of a product.
     *
     * @param sku The product’s sku
     * @return the price of the product
     */
    public double getItemPrice(String sku)
    {
        return sp.get(sku); // FIXME Question 3iie: complete this function
    };

    /**
     * Return the amount of stock for a product.
     *
     * @param sku The product’s sku
     * @return the number of items in stock
     */
    public int getStock(String sku)
    {
        return ss.get(sku); // FIXME Question 3iif: complete this function
    };

    /**
     * An product has been sold; reduce current stock accordingly.
     *
     * @param sku The product’s sku
     * @param sold The quantity sold
     * @return The number of items of stock remaining after the sale
     */
    public int sale(String sku, int sold)
    {
        ss.put(sku, (ss.get(sku) - sold));
        return ss.get(sku); // FIXME Question 3iig: complete this function
    }

    /**
     * New stock has arrived; increase current stock accordingly.
     *
     * @param sku The product’s sku
     * @param added The quantity newly arrived
     */
    public void addStock(String sku, int added)
    {
        ss.put(sku, (ss.get(sku) + added));
        // FIXME Question 3iih: complete this function
    }

    /**
     * Set the target amount of stock for a product.
     *
     * @param sku The item’s sku
     * @param target The target quantity desired to be held in stock
     */
    public void setTargetStock(String sku, int target)
    {
        st.put(sku,target);
        // FIXME Question 3iij: complete this function
    }

    /**
     * Stock has been carefully counted. Set current stock correctly.
     *
     * @param sku The product’s sku
     * @param actual The quantity actually in the store
     * @return The stock loss or gain (new current – old current)
     */
    public int setActualStock(String sku, int actual)
    {
        int tmp = ss.get(sku);
        ss.put(sku,actual);
        return actual-tmp;
        // FIXME Question 3iik: complete this function
    }

    /**
     * For a given vendor, return a map indicating for each product provided by
     * that vendor, the number of items required in order to reach the target
     * stock for that item (target - stock).   A positive number indicates that
     * stock is needed, a negative number indicates that there is extra stock.
     *
     * @param vid The VID of the vendor to be queried
     * @return A map of item SKUs and the difference between target and actual stock for that item
     */
    public Map<String, Integer> getStockRequired(String vid)
    {
        return null;
        // FIXME Question 3iil: complete this function
    }
}
