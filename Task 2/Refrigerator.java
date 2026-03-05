class Refrigerator {

    static String brand;
    static int capacity;
    static String energyRating;
    static String color;
    static String doorType;
    static String coolingType;
    static String compressorType;
    static String countryOfOrigin;
    static int price;

    public static void main(String[] args) {

        brand = "Samsung";
        capacity = 253;
        energyRating = "3 Star";
        color = "Silver";
        doorType = "Double Door";
        coolingType = "Frost Free";
        compressorType = "Digital Inverter";
        countryOfOrigin = "India";
        price = 28000;

        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + "L");
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Color: " + color);
        System.out.println("Door Type: " + doorType);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Compressor Type: " + compressorType);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Price: ₹" + price);
    }
}
