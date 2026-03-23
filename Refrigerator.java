class Refrigerator {

    static String brandd;
    static int capacityy;
    static String energyRatingg;
    static String colorr;
    static String doorTypee;
    static String coolingTypee;
    static String compressorTypee;
    static String countryOfOriginn;
    static int pricee;

    public static void main(String[] args) {

        String brand = "Samsung";
        int capacity = 253;
        String energyRating = "3 Star";
        String color = "Silver";
        String doorType = "Double Door";
        String coolingType = "Frost Free";
        String compressorType = "Digital Inverter";
        String countryOfOrigin = "India";
        int price = 28000;

        System.out.println("Brand: " + brand);
        System.out.println("Brand: " + Refrigerator.brandd);

        System.out.println("Capacity: " + capacity + "L");
        System.out.println("Capacity: " + Refrigerator.capacityy);

        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Energy Rating: " + Refrigerator.energyRatingg);

        System.out.println("Color: " + color);
        System.out.println("Color: " + Refrigerator.colorr);

        System.out.println("Door Type: " + doorType);
        System.out.println("Door Type: " + Refrigerator.doorTypee);

        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Cooling Type: " + Refrigerator.coolingTypee);

        System.out.println("Compressor Type: " + compressorType);
        System.out.println("Compressor Type: " + Refrigerator.compressorTypee);

        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Country Of Origin: " + Refrigerator.countryOfOriginn);

        System.out.println("Price: ₹" + price);
        System.out.println("Price: ₹" + Refrigerator.pricee);
    }
}
