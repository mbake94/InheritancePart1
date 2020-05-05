import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.text.NumberFormat;

public class Product {
    private String code;
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {

        return "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";

    }



    public void printDescription(){
        System.out.println(description);
    }

    public String getFormattedPrice(double price) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }




    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}
