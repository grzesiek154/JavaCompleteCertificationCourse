package src;

import java.util.List;

/**
 * Employee
 */
public class Employee {

    String name;
    List<Vehicle> carsSolded;


    public Employee(String name, List<Vehicle> carsSolded) {
        this.name = name;
        this.carsSolded = carsSolded;
    }

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
        if(finance == true) {
            if (checkIfAfford(cust, vehicle) == true) {
                System.out.println("You have enaugh mone to buy" + vehicle.getType());
            } else {
                System.out.println("You do not have engough money to buy" + vehicle.getType());
            }
        }
    }

    private boolean checkIfAfford(Customer cust, Vehicle vehicle) {
        if (cust.getCashOnHand() <= vehicle.getPrice()) {
            return true;
        } else {
            return false;
        }
    }
}