package entity;

public class Cloth extends Product{
    private String size;
    private String material;

    public Cloth(Long id, String productName, double price, double weight, String color, int productCount,String size, String material){
        super(id, productName, price, weight, color, productCount);
        this.material = material;
        this.size = size;
    }

    public static class Builder{
        private Long id;
        private String productName;
        private double price;
        private double weight;
        private String color;
        private int productCount;
        private String size;
        private String material;

        public Builder(){
        }

        public Builder setId(Long id){
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

        public Builder setProductCount(int productCount){
            this.productCount = productCount;
            return this;
        }

        public Builder setSize(String size){
            this.size = size;
            return this;
        }

        public Builder setMaterial(String material){
            this.material = material;
            return this;
        }

        public Cloth build(){
            return new Cloth(id,productName,price,weight,color,productCount, size,material);
        }
    }

    public String getSize(){
        return  size;
    }

    public String getMaterial(){
        return material;
    }

    @Override
    public String toString(){
        return  super.toString() + PRODUCT_SEPARATOR + size + PRODUCT_SEPARATOR + material;

    }

}
