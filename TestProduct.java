package SecondTermWeek0;

public class TestProduct {

    public static void main(String[] args) {

       /*
        instance variable
        class variable
        public private protected
        getter setter encapsulation
        constructor*/

        Product product = new Product();
        Product producteda = new Product();
        Product productnupi = new Product();
        System.out.println("_______");
        producteda.type="wsdfg";
        System.out.println(producteda.type);
        System.out.println(productnupi.type);
        System.out.println("_______");
        product.setDescription("default");



        product.setPrice(1000.0);
        System.out.println(product.getDescription());
        System.out.println(product.getId());
        System.out.println(product.getPrice());

        Product product2 = new Product(10, "pc", "asus", 1000, 10, "black");
        System.out.println(product2.getId());
        System.out.println(product2.getName());
        System.out.println(product2.getDescription());
        System.out.println(product2.getPrice());
        System.out.println(product2.getStockAmount());
        System.out.println(product2.getColour());
        System.out.println(product2.getCode());
    }
}
