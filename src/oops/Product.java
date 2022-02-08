package oops;

public class Product {
    int productId = 1;
    String productName = "Abc";
    float productPrice = 12.4f;
    static String companyName = "Cyber success";

    //zero param
    public Product() {
        productId = 100;
        productPrice = 100;
    }

    // parameterized constructor
    public Product(int pId, String pName, float pPrice){
        // we are assigning local variable value to instance variable.
        productId = pId;
        productName = pName;
        productPrice = pPrice;
    }

    void registerProduct() {
        System.out.println("registering new product");
    }

    public static void main(String[] args) {
        //args is also local reference variable
        int a = 20;//local primitive var
        Product product = new Product(); // local reference variable
        Product product2 = new Product(); // local reference variable
        System.out.println(product.productId); //100
        System.out.println(product.productName);//Abc
        System.out.println(product.productPrice);//100
        System.out.println(Product.companyName);
        product.registerProduct();

        System.out.println("product2 " + product2.productId + " " + product2.productPrice);

        Product product3 = new Product(101,"Vacuum bottles", 700);
        System.out.println("product3 " + product3.productId + " " + product3.productPrice);
        Product product4 = new Product();
    }

}
