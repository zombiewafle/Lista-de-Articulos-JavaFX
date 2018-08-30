package item;

import javafx.beans.property.SimpleStringProperty;

public class ShoppingItems {
    SimpleStringProperty name;
    SimpleStringProperty date;
    SimpleStringProperty unfinished;
    SimpleStringProperty estimated;

    public ShoppingItems(String name,String date,String unfinished, String estimated){
        this.name = new SimpleStringProperty();
        this.name.set(name);

        this.date = new SimpleStringProperty();
        this.date.set(date);

        this.unfinished = new SimpleStringProperty();
        this.unfinished.set(unfinished);
        this.estimated = new SimpleStringProperty();
        this.estimated.set(estimated);
    }
}
