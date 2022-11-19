import java.util.ArrayList;

public class Garage {

    private int maximunSizeOfTheGarage;
    private int currentAumountOfVehicles;
    private double wheelChangePrice;
    private ArrayList<Vehicles> vehicles;

    public void vehicleEntry(ArrayList<Vehicles> vehicles){
        this.vehicles = vehicles;
    }
    public void vehicleExit(ArrayList<Vehicles> vehicles){
        this.vehicles = vehicles;
    }

    public double getWheelChangePrice() {
        return wheelChangePrice;
    }

    public void setWheelChangePrice(double wheelChangePrice) {
        this.wheelChangePrice = wheelChangePrice;
    }

    public int getMaximunSizeOfTheGarage() {
        return maximunSizeOfTheGarage;
    }

    public void setMaximunSizeOfTheGarage(int maximunSizeOfTheGarage) {
        this.maximunSizeOfTheGarage = maximunSizeOfTheGarage;
    }

    public int getCurrentAumountOfVehicles() {
        return currentAumountOfVehicles;
    }

    public void getTotalPrice(ArrayList<Vehicles> vehicles){
        this.vehicles = vehicles;
    }
}
