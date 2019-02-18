package entity.parser;

import entity.Product;
import entity.Boots;
import entity.Cloth;

public class ProductParser {

    public static Product stringToProduct(String productString, String productType){
        if (productType.equals("PRODUCT")) {
            return convertToProduct(productString);
        } else if (productType.equals("CLOTH")) {
            return convertToCloth(productString);
        } else if (productType.equals("BOOTS")) {
            return convertToBoots(productString);
        }
        return null;
    }
    private static Boots convertToBoots(String productStr) {
        String [] productInformations = productStr.split(Product.PRODUCT_SEPARATOR);

        Long id = Long.parseLong(productInformations[0]);
        String productName = productInformations[1];
        double price = Double.parseDouble(productInformations[2]);
        double weight = Double.parseDouble(productInformations[3]);
        String color = productInformations[4];
        int productCount = Integer.parseInt(productInformations[5]);
        Integer size = Integer.parseInt(productInformations[6]);
        boolean isNaturalSkin = Boolean.parseBoolean(productInformations[7]);

        return new Boots(id, productName, price, weight, color, productCount, size, isNaturalSkin);
    }

    private static Cloth convertToCloth(String productStr) {
        String [] productInformations = productStr.split(Product.PRODUCT_SEPARATOR);

        Long id = Long.parseLong(productInformations[0]);
        String productName = productInformations[1];
        double price = Double.parseDouble(productInformations[2]);
        double weight = Double.parseDouble(productInformations[3]);
        String color = productInformations[4];
        Integer productCount = Integer.parseInt(productInformations[5]);
        String size = productInformations[6];
        String material = productInformations[7];

        return new Cloth(id, productName, price, weight, color, productCount, size, material);
    }
    private static Product convertToProduct(String productStr) {
        String [] productInformations = productStr.split(Product.PRODUCT_SEPARATOR);

        Long id = Long.parseLong(productInformations[0]);
        String productName = productInformations[1];
        double price = Double.parseDouble(productInformations[2]);
        double weight = Double.parseDouble(productInformations[3]);
        String color = productInformations[4];
        Integer productCount = Integer.parseInt(productInformations[5]);

        return new Product(id, productName, price, weight, color, productCount);
    }
}
