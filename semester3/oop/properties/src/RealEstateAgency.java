class RealEstateAgency {
    private Property[] properties;
    private int propertyCount;

    public RealEstateAgency() {
        properties = new Property[100];
        propertyCount = 0;
    }

    public void addProperty(Property property) {
        if (propertyCount < 100) {
            properties[propertyCount++] = property;
        } else {
            System.out.println("Cannot add more properties, the list is full.");
        }
    }

    public void removeProperty(int index) {
        if (index >= 0 && index < propertyCount) {
            for (int i = index; i < propertyCount - 1; i++) {
                properties[i] = properties[i + 1];
            }
            properties[--propertyCount] = null;
        } else {
            System.out.println("Invalid index, unable to remove property.");
        }
    }

    public void displayProperties() {
        for (int i = 0; i < propertyCount; i++) {
            properties[i].display();
            System.out.println("-----------------------");
        }
    }
}
