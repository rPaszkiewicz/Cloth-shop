package dao;

import api.ProductDao;
import entity.Product;
import entity.parser.ProductParser;
import utils.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ProductDaoImpl implements ProductDao {

    private final String fileName;
    private final String productType;


    public ProductDaoImpl(String fileName, String productType) throws IOException{
        this.fileName = fileName;
        this.productType = productType;
        FileUtils.createNewFile(fileName);
    }

    public void saveProduct(Product product) throws IOException{
        List<Product> products = getAllProducts();
        products.add(product);
        saveProducts(products);
    }

    public void saveProducts(List<Product> products)throws IOException{
        FileUtils.clearFile(fileName);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(fileName,true));
        for (Product product : products) {
            printWriter.println(product);
        }
        printWriter.close();
    }

    public void removeProductById(Long productId) throws IOException{
        List<Product> products = getAllProducts();
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                products.remove(product);
            }
        }
        saveProducts(products);
    }

    public void removeProductByName(String productName)throws IOException{
        List<Product> products = getAllProducts();
        for (Product product : products) {
            if (product.getProductName().equals(productName)){
                products.remove(product);
            }
        }
        saveProducts(products);
    }

    public List<Product> getAllProducts() throws IOException{
        List<Product> products = new ArrayList<Product>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String lineReader = reader.readLine();
        while(lineReader != null){
            Product product = ProductParser.stringToProduct(lineReader,productType);
            if (product != null) {
                products.add(product);
            }
            lineReader = reader.readLine();
        }
        reader.close();

        return products;

    }

    public Product getProductById(Long productId) throws IOException{
        List<Product> products = getAllProducts();
        for (Product product : products){
            if (product.getId().equals(productId)){
                return product;
            }
        }
        return null;
    }

    public  Product getProductByName(String productName) throws IOException{
        List<Product> products = getAllProducts();
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

}
