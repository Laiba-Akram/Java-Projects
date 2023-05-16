import java.util.ArrayList;

class Vehicle {
    private String name;
    private String price;
    private int model;

    public Vehicle() {
        // Default constructor
    }

    public Vehicle(String name, String price, int model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getModel() {
        return model;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Model: " + model);
    }
}

public class vehicleprogram {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        // Create object vehicle1 using parameterized constructor
        Vehicle vehicle1 = new Vehicle("Suzuki", "95Lac", 2023);
        vehicles.add(vehicle1);

        // Create object vehicle2 using default constructor and setter functions
        Vehicle vehicle2 = new Vehicle();
        vehicle2.setName("Honda City");
        vehicle2.setPrice("50Lac");
        vehicle2.setModel(2023);
        vehicles.add(vehicle2);

        System.out.println("By Laiba Akram");

        // Display the details of each vehicle in the ArrayList
        for (Vehicle vehicle : vehicles) {
            vehicle.display();
            System.out.println();
        }
    }
}
