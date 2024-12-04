
class FurnishedApartment extends Apartment {
    private int furnitureQuality;

    public FurnishedApartment(double area, int numberOfRooms, String neighborhoodName, double price, int floor, boolean hasParkingLot, int furnitureQuality) {
        super(area, numberOfRooms, neighborhoodName, price, floor, hasParkingLot);
        this.furnitureQuality = furnitureQuality;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Furnished Apartment");
        System.out.println("Furniture Quality: " + furnitureQuality);
    }
}