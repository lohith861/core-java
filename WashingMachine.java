class WashingMachine {

    static String brandd;
    static String typee;
    static int capacityy;
    static String energyRatingg;
    static String spinSpeedd;
    static String colorr;
    static String controlTypee;
    static String countryOfOriginn;
    static int pricee;

    public static void main(String[] args) {

        String brand = "LG";
        String type = "Front Load";
        int capacity = 7;
        String energyRating = "5 Star";
        String spinSpeed = "1200 RPM";
        String color = "White";
        String controlType = "Fully Automatic";
        String countryOfOrigin = "India";
        int price = 32000;

        System.out.println("Brand: " + brand);
        System.out.println("Brand: " + WashingMachine.brandd);

        System.out.println("Type: " + type);
        System.out.println("Type: " + WashingMachine.typee);

        System.out.println("Capacity: " + capacity + "Kg");
        System.out.println("Capacity: " + WashingMachine.capacityy);

        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Energy Rating: " + WashingMachine.energyRatingg);

        System.out.println("Spin Speed: " + spinSpeed);
        System.out.println("Spin Speed: " + WashingMachine.spinSpeedd);

        System.out.println("Color: " + color);
        System.out.println("Color: " + WashingMachine.colorr);

        System.out.println("Control Type: " + controlType);
        System.out.println("Control Type: " + WashingMachine.controlTypee);

        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Country Of Origin: " + WashingMachine.countryOfOriginn);

        System.out.println("Price: ₹" + price);
        System.out.println("Price: ₹" + WashingMachine.pricee);
    }
}
