package src;

import java.util.LinkedList;

public class Dealership {
    
    public static void main(String[] args) {
        
        Customer customer1 = new Customer();

        customer1.setName("Adam");
        customer1.setAddress("Radom");
        customer1.setCashOnHand(12000);

        Employee emp = new Employee("Zbyszek", new LinkedList<>());

        Vehicle car = new Car("City Car",15000, "Toyota");

        emp.handleCustomer(customer1, true, car);
    }
}

