public class MobilePhone {
    private String brand;
    private String model;
    private String color;
    private int memory;
    private int ram;
    private int price;

    public MobilePhone (String brand,String model,String color,int memory,int price){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.memory = memory;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                ", price=" + price +
                '}';
    }
}
