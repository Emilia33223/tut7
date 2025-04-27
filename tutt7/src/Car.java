public class Car extends Vehicle {
    private int numberOfSeats;


    public Car(int seats) {
        this.numberOfSeats = seats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }
}
