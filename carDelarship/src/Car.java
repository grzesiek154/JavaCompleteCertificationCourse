package src;

public class Car extends Vehicle {

    private String color;
    


    public Car(String type, double price, String company ) {
        super(type, price, company);
    }



	@Override
	void accelerate() {
		System.out.println("The speed is getting bigger!");
	}



	@Override
	void start() {
		System.out.println(type + "has strated.");
	}



	@Override
	void stop() {
		System.out.println(type + "has stoped.");
	}

    
  
}