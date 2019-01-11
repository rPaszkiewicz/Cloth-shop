package entity;

import clothSize.size;

public class Main {

    public static void main(String[] args) {

        Product product = new Product.Builder()
                .setId(123456789)
                .setProductName("T-shirt")
                .setPrice(49.99)
                .setWeight(120)
                .setColor("White")
                .productCount(10)
                .Build();

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
                .setId(89787444666L)
                .setProductName("Shirt")
                .setPrice(129)
                .setWeight(250)
                .setColor("Indigo")
                .setProductCount(10)
                .setSize(size.L)
                .setMaterial("Cotton")
                .build();

        User user = new User(543168468743L,"Grim Jim","BabaJagaPatrzy123");

        System.out.println(user);
        System.out.println();
        System.out.println(product);
        System.out.println();
        System.out.println(cloth);
        System.out.println();
        System.out.println(boots);
        System.out.println();

    }
}
