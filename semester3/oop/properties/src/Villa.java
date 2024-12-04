
class Villa extends Property {
    private boolean hasSwimmingPool;
    private int numberOfAdjacentStreets;

    public Villa(double area, int numberOfRooms, String neighborhoodName, double price, boolean hasSwimmingPool, int numberOfAdjacentStreets) {
        super(area, numberOfRooms, neighborhoodName, price);
        this.hasSwimmingPool = hasSwimmingPool;
        this.numberOfAdjacentStreets = numberOfAdjacentStreets;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: Villa");
        System.out.println("Has Swimming Pool: " + (hasSwimmingPool ? "Yes" : "No"));
        System.out.println("Number of Adjacent Streets: " + numberOfAdjacentStreets);
    }
}
