class WashingMachine {

    static String brand;
    static String type;
    static int capacity;
    static String energyRating;
    static String spinSpeed;
    static String color;
    static String controlType;
    static String countryOfOrigin;
    static int price;

    public static void main(String[] args) {

        brand = "LG";
        type = "Front Load";
        capacity = 7;
        energyRating = "5 Star";
        spinSpeed = "1200 RPM";
        color = "White";
        controlType = "Fully Automatic";
        countryOfOrigin = "India";
        price = 32000;

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity + "Kg");
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Spin Speed: " + spinSpeed);
        System.out.println("Color: " + color);
        System.out.println("Control Type: " + controlType);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Price: ₹" + price);
    }
}
