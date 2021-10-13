package Krowemoh5;

public class Transport {
    int horsePower;
    int maxSpeed;
    int weight;
    String name;

    public static void main(String[] args) {
        Car car = new Car();
        car.calculationFuel(150, "BMW", 230, 20);
        System.out.println(car);

        Truck truck = new Truck();
        truck.isCargo(34, 30);
        System.out.println(truck);

        AirCivil airCivil = new AirCivil();
        airCivil.setNumPassenger(30);
        System.out.println(airCivil);

        AirMilitary airMilitary = new AirMilitary();
        airMilitary.setNumRocket(12);
        System.out.println(airMilitary);
        airMilitary.isBailout();
        System.out.println(airMilitary);

    }


}
