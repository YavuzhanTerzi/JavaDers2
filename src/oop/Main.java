package oop;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Vade oranı";

        Product product1 = new Product();
        //set value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("mahmut3.jpg");


        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(7);
        product2.setUnitsInStock(4);
        product2.setImageUrl("mahmut1.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Kahve Makinesi");
        product3.setUnitPrice(5500);
        product3.setDiscount(7);
        product3.setUnitsInStock(2);
        product3.setImageUrl("mahmut2.jpg");


        //get value
        //System.out.println(product1.name  );


        Product[] products = {product1, product2, product3};


        for (Product product : products) {
            System.out.println(product.getName());
        }
        IndividualCustomer invidualCustomer = new IndividualCustomer();
        invidualCustomer.setId(1);
        invidualCustomer.setPhone("05554443322");
        invidualCustomer.setCustomerNumber("12345");
        invidualCustomer.setFirstName("Yavuzhan");
        invidualCustomer.setLastName("Terzi");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("05556667788");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {invidualCustomer,corporateCustomer}



    }
}