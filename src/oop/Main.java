package oop;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Vade oranı";

        Product product1 = new Product();
        //set value
        product1.name = "Delonghi Kahve Makinesi";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitsInStock = 3;
        product1.imageUrl = "mahmut1.jpg";

        //get value
        //System.out.println(product1.name  );

        Product product2 = new Product();
        product2.name = "Smeg Kahve Makinesi";
        product2.unitPrice = 6500;
        product2.discount = 8;
        product2.unitsInStock = 2;
        product2.imageUrl = "mahmut2.jpg";

        Product product3 = new Product();
        product3.name = "Kitchen Kahve Makinesi";
        product3.unitPrice = 4500;
        product3.discount = 9;
        product3.unitsInStock = 4;
        product3.imageUrl = "mahmut3.jpg";

        Product[] products = {product1,product2,product3};
        //notes




    }
}