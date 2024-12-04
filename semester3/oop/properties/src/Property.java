class Property {
    private double area;
    private int numberOfRooms;
    private String neighborhoodName;
    private double price;

    public Property(double area, int numberOfRooms, String neighborhoodName, double price) {
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.neighborhoodName = neighborhoodName;
        this.price = price;
    }

    public void display() {
        System.out.println("Property Area: " + area + " m2");
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Neighborhood: " + neighborhoodName);
        System.out.println("Price: " + price);
    }
}