package Krowemoh5;

public class AirCivil extends Air {
    int numPassenger;
    int maxPassenger;
    boolean business = true;


    public void setNumPassenger(int numPassenger) {
        if (numPassenger < maxPassenger ) {
            System.out.println("There is still room");
        } else {
            System.out.println("There are no seats");
        }

    }
}
