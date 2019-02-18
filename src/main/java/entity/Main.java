package entity;

import clothSize.size;
import dao.ProductDaoImpl;
import service.ProductServiceImpl;
import service.UserServiceImpl;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Product product = new Product.Builder()
                .setId(123456789L)
                .setProductName("T-shirt")
                .setPrice(49.99)
                .setWeight(120)
                .setColor("White")
                .productCount(10)
                .build();

        Boots boots = new Boots.Builder()
                .setId(1132131311L)
                .setProductName("Sandały")
                .setPrice(129.99)
                .setWeight(250)
                .setColor("Black")
                .setProductCount(12)
                .setSize(43)
                .setNaturalLeather(true)
                .build();

        Cloth cloth = new Cloth.Builder()
                .setId(2L)
                .setProductName("Shirt")
                .setPrice(129)
                .setWeight(250)
                .setColor("Indigo")
                .setProductCount(10)
                .setSize("L")
                .setMaterial("Cotton")
                .build();

        User user = new User(543168468743L,"Grim Jim","BabaJagaPatrzy123");

        ProductDaoImpl dao = new ProductDaoImpl("Experimental data.txt","PRODUCT");

      /*  System.out.println(user);
        System.out.println();
        System.out.println(product);
        System.out.println();
        System.out.println(cloth);
        System.out.println();
        System.out.println(boots);
        System.out.println();
      */
        List<Product> products = new ArrayList<Product>();

        /*dao.saveProduct(cloth);
        dao.saveProduct(boots);
        dao.saveProduct(product);*/
        products.add(cloth);
        products.add(boots);
        products.add(product);
        dao.saveProducts(products);
        dao.removeProductById(1132131311L);
        System.out.println(dao.getAllProducts());


        for (Product product1 : products)
            System.out.println(product1);

        //FileUtils.clearFile("Experimental data.txt");




    }
}
