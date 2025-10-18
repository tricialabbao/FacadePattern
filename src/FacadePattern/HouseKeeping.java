package FacadePattern;

public class HouseKeeping implements HotelService {

    @Override
    public void pickUpVehicle(String plateNumber) {
        // Housekeeping service does not handle vehicle pickup
    }

    @Override
    public void cleanRoom(int roomNumber) {
        System.out.println("Cleaning room number: " + roomNumber);
    }

    @Override
    public void requestCart(int numberOfCarts) {
        // Housekeeping service does not handle cart requests
    }
}
