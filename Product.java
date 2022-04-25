package SecondTermWeek0;

public class Product {

    //static class variable
    public static int classvarible = 10;
    public static int open = 10;
    public static int close = 10;
    public static  String type = "product";

    //instance variable
    //attribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String colour;

    public Product() {
        System.out.println("Object created");

    }

    public Product(int id, String name, String description, double price, int stockAmount, String colour) {
        this.id = id;
        this.colour = colour;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }


    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String renk) {
        this.colour = renk;
    }

    public String getCode() {
        return this.name.substring(0, 1) + id;
    }

}