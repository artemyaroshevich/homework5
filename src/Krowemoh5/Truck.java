package Krowemoh5;

public class Truck extends Terrestrial {
   private int maxCargo = ;
   private int weight;

    public void isCargo(int maxCargo, int weight) {
        if (maxCargo < weight) {
            System.out.println("You need bigger truck");
        } else {
            System.out.println(" This truck fits");
        }

    }
}





