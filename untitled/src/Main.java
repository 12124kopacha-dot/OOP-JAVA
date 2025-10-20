
interface Vessel {
    void prepareToMove();
    void move();
}

class SailingVessel implements Vessel {
    @Override
    public void prepareToMove() {
        System.out.println("Sailing vessel is hoisting the sails...");
    }

    @Override
    public void move() {
        System.out.println("Sailing vessel is moving by wind power.");
    }
}


class Submarine implements Vessel {
    @Override
    public void prepareToMove() {
        System.out.println("Submarine is starting the engine...");
    }

    @Override
    public void move() {
        System.out.println("Submarine is moving underwater.");
    }
}


public class Main {
    public static void main(String[] args) {

        Vessel[] myFleet = new Vessel[2];
        myFleet[0] = new SailingVessel();
        myFleet[1] = new Submarine();


        for (Vessel v : myFleet) {
            System.out.println("--- New Vessel ---");
            v.prepareToMove();
            v.move();
            System.out.println();
        }
    }
}
