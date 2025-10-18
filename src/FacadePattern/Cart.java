package FacadePattern;

public class Cart implements HotelService {

    @Override
    public void pickUpVehicle(String plateNumber) {
        // Cart service does not handle vehicle pickup
    }

    @Override
    public void cleanRoom(int roomNumber) {
        // Cart service does not handle room cleaning
    }

    @Override
    public void requestCart(int numberOfCarts) {
        System.out.println(numberOfCarts + " Cart service has been requested.");
    }
}