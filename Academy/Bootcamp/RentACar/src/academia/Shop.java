package academia;

import academia.vehicles.*;


public class Shop {

    private Vehicle[] vehicles;

    public Shop() {
        this.vehicles = new Vehicle[]{new GasCar(VehicleType.GASCAR, (float) 0.05),
                new HybridCar(VehicleType.HYBRIDCAR, (float) 0.05),
                new Motorcycle(VehicleType.MOTORCYCLE, (float) 0.05)
        };
    }





    public void unRent(Vehicle vehicle)  {

        if( vehicle.getFuelLevel() < Util.MINIMUM_DEPOSIT){

            float a = (float) Math.abs((Util.MINIMUM_DEPOSIT - vehicle.getFuelLevel()) * 1.5);
            System.out.println("you have to pay " + a);
        }
        vehicle.setRented(false);


    }


    public Vehicle rent(VehicleType type){
          for (int i = 0; i < vehicles.length; i++) {
              if (vehicles[i].getType() == type){
                  if (!vehicles[i].isRented()){
                      vehicles[i].setRented(true);
                      System.out.println("Vehicle rented with that license : " + i);
                       return vehicles[i];
                  }
              }
          }

              System.out.println("I can't satisfy your order");
          return null;

      }
}
