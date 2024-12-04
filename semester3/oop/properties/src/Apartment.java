
class Apartment extends Property {
    private int floor;
    private boolean hasParkingLot;

    public Apartment(double area, int numberOfRooms, String neighborhoodName, double price, int floor, boolean hasParkingLot) {
        super(area, numberOfRooms, neighborhoodName, price);
        this.floor = floor;
        this.hasParkingLot = hasParkingLot;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Apartment");
        System.out.println("Floor: " + floor);
        System.out.println("Has Parking Lot: " + (hasParkingLot ? "Yes" : "No"));
    }
}