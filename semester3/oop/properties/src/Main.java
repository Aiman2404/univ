public class Main {
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency();

        Villa villa = new Villa(300, 5, "Sulyview", 500000, true, 3);
        Apartment apartment = new Apartment(120, 3, "Ashti", 300000, 2, true);
        FurnishedApartment furnishedApartment = new FurnishedApartment(140, 4, "sulyHights", 350000, 5, true, 1);

        agency.addProperty(villa);
        agency.addProperty(apartment);
        agency.addProperty(furnishedApartment);

        System.out.println("All Properties:");
        agency.displayProperties();

        System.out.println("Removing the second property...");
        agency.removeProperty(1);

        System.out.println("All Properties after removal:");
        agency.displayProperties();
    }
}
