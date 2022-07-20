package academia;

import academia.vehicles.Vehicle;
import academia.vehicles.VehicleType;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Vehicle motorcyle = shop.rent(VehicleType.MOTORCYCLE);
        motorcyle.move(79,(float) 5);
        motorcyle.move(79,(float) 5);
        shop.unRent(motorcyle);
    }
}
