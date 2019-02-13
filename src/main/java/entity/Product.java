package entity;

public class Product {

    public final static String PRODUCT_SEPARATOR = "#";

    private long id;
    private String productName;
    private double price;
    private double weight;
    private String color;
    private int productCount;

    public Product(Long id, String productName, double price, double weight, String color, int productCount){
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
    }

    public static class Builder {
        private Long id;
        private String productName;
        private double price;
        private double weight;
        private String color;
        private int productCount;

        public Builder(){
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setProductName(String productName){
            this.productName = productName;
            return this;
        }

        public Builder setPrice(double price){
            this.price = price;
            return this;
        }

        public Builder setWeight(double weight){
            this.weight = weight;
            return this;
        }

        public Builder setColor(String color){
            this.color = color;
            return this;
        }

        public Builder productCount(int productCount){
            this.productCount = productCount;
            return this;
        }

        public Product Build(){
            return new Product(id,productName,price,weight,color,productCount);
        }

    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setProductCount(int productCount){
        this.productCount = productCount;
    }

    public Long getId(){
        return this.id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getProductCount() {
        return productCount;
    }

    @Override
    public String toString(){
        return  id + PRODUCT_SEPARATOR + productName + PRODUCT_SEPARATOR + price + PRODUCT_SEPARATOR + weight + PRODUCT_SEPARATOR + color + PRODUCT_SEPARATOR + productCount;

    }
}
