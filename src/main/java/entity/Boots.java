package entity;

public class Boots extends Product {
    private int size;
    private boolean isNaturalLeather;

    public Boots(Long id, String productName, double price, double weight, String color, int productCount,int size, boolean isNaturalLeather){
        super(id,productName,price,weight,color,productCount);
        this.size = size;
        this.isNaturalLeather = isNaturalLeather;
    }

    public static class Builder{
        private Long id;
        private String productName;
        private double price;
        private double weight;
        private String color;
        private int productCount;
        private int size;
        private  boolean isNaturalLeather;

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

        public Builder setSize(int size){
            this.size = size;
            return this;
        }

        public Builder setNaturalLeather(boolean isNaturalLeather){
            this.isNaturalLeather = isNaturalLeather;
            return this;
        }


        public Boots build(){
            return new Boots(id,productName,price,weight,color,productCount,size,isNaturalLeather);
        }

    }

    public int getSize() {
        return size;
    }

    public boolean getIsNaturalLeather() {
        return isNaturalLeather;
    }

    @Override
    public String toString(){
        return super.toString() + PRODUCT_SEPARATOR + size + PRODUCT_SEPARATOR + isNaturalLeather;
    }
}
