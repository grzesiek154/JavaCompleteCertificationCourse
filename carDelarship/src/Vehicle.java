package src;

public abstract class Vehicle {

    String type;
    double price;
    String company;
    
   

    public Vehicle(String type, double price, String company) {
        this.type = type;
        this.price = price;
        this.company = company;
    }

    abstract void start();
    abstract void stop();
    abstract void accelerate();


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


}