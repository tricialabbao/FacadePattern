package FacadePattern;
 class Valet implements HotelService {

    @Override
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet service has been requested. " + plateNumber);
    }

    @Override
    public void cleanRoom(int roomNumber) {
        // Valet service does not handle room cleaning
    }

    @Override
    public void requestCart(int numberOfCarts) {
        // Valet service does not handle cart requests
    }
}
