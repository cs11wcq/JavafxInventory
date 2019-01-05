package HIP_Inventory_Project;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
/**
 * Created by seth on 4/6/2017.
 */
public class Item {

    private SimpleStringProperty title; //item name
    private IntegerProperty maxQuantity;
    private IntegerProperty quantity;
    //private SimpleStringProperty location;

    public Item(String s1, int max, int s2,String loc) {
        title = new SimpleStringProperty(s1);
        maxQuantity= new SimpleIntegerProperty(max);
        quantity = new SimpleIntegerProperty(s2);
        //location = new SimpleStringProperty(loc);
    }

    public String getTitle() {
        return title.get();
    }
    public void setTitle(String s) {
        title.set(s);
    }

    public Integer getQuantity() {
        return quantity.get();
    }

    public Integer getMaxQuantity() {
        return maxQuantity.get();
    }

    public void setQuantity(Integer s) {
        quantity.set(s);
    }

    public IntegerProperty getValueProperty() {
        return quantity;
    }

    @Override
    public String toString() {
        return (title.get() + ", by " + quantity.get());
    }

    public void decrementQuantity()
    {
        int q = quantity.get();
        q--;
        quantity.set(q);
    }

    public void incrementQuantity()
    {
        int q = quantity.get();
        q++;
        quantity.set(q);
    }
}
