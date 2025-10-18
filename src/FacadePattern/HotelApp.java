package FacadePattern;
import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create facades for each service
        FrontDesk facadeCart = new FrontDesk(new Cart());
        FrontDesk facadeHousekeeping = new FrontDesk(new HouseKeeping());
        FrontDesk facadeValet = new FrontDesk(new Valet());

        System.out.println("Enter Choice: \n" +
                "1. Request Cart.\n" +
                "2. Request Housekeeping.\n" +
                "3. Request Valet");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter number of Carts: ");
                int numCarts = scanner.nextInt();
                facadeCart.performRequestCart(numCarts);
                break;
            case 2:
                System.out.print("Enter Room number for Housekeeping: ");
                int roomNumber = scanner.nextInt();
                facadeHousekeeping.performClean(roomNumber);
                break;
            case 3:
                System.out.print("Enter your Plate Number: ");
                String plateNumber = scanner.next();
                facadeValet.performValet(plateNumber);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        
        scanner.close();
    }
}
