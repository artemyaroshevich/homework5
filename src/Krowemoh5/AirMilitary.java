package Krowemoh5;

public class AirMilitary extends Air {
    boolean bailout = true;
    int numRocket;

    public void setNumRocket(int numRocket) {
        if (numRocket != 0) {
            System.out.println("Rocket shoot");
        } else {
            System.out.println("Rocket out");
        }
    }

    public void isBailout() {
        if (true) {
            System.out.println("The bailout was successful");
        } else {
            System.out.println("Dont have bailout");
        }
    }

}
