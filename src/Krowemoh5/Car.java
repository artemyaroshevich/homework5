package Krowemoh5;

public class Car extends Terrestrial {
    String typeBody;
    int numPassengers;
     private int time = 2;
    int km;

    public void calculationFuel (int km, String name, int maxSpeed, int fuel ) {
        km = time * maxSpeed;
        fuel = km / maxSpeed;
        System.out.println("at the time " + time + " hours " + " a car moving " + name +" with maxim speed " + maxSpeed+ " will the use up " + fuel + " liters fuel ");
    }



    public void carLight( int time,  int maxSpeed, int km, int fuel) {

    }


}
