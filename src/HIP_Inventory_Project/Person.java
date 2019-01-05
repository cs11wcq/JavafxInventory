package HIP_Inventory_Project;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by seth on 5/16/2017.
 */
public class Person
{
    private final SimpleStringProperty fname;
    private final SimpleStringProperty item;
    private final SimpleStringProperty amount;
    private final SimpleStringProperty date;

    public Person(String fname, String item, String amount, String date ) {
        this.fname = new SimpleStringProperty(fname);
        this.item = new SimpleStringProperty(item);
        this.amount = new SimpleStringProperty(amount);
        this.date = new SimpleStringProperty(date);
    }

    public String getName() {
        return fname.get();
    }
    public void setName(String fname) {
        this.fname.set(fname);
    }

    public String getItem() {
        return item.get();
    }
    public void setItem(String item) {
        this.item.set(item);
    }

    public String getAmount() {
        return amount.get();
    }
    public void setAmount(String amount) {
        this.amount.set(amount);
    }

    public String getDate() {
        return amount.get();
    }
    public void setDate(String date) {
        this.date.set(date);
    }

}
