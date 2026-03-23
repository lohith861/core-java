class AirConditioner {

    static String brandd = "Puma";
    static float tonnagee = 1.7f;
    static String energyRatingg = "7 Star";
    static String inverterTechnologyy = "No";
    static String coolingCapacityy = "5080 Watts";
    static String colorr = "Blue";
    static String condenserTypee = "Copper";
    static String countryOfOriginn = "India";
    static int pricee = 42500;

    public static void main(String[] args) {

        String brand = "Daikin";
        float tonnage = 1.5f;
        String energyRating = "5 Star";
        String inverterTechnology = "Yes";
        String coolingCapacity = "5000 Watts";
        String color = "White";
        String condenserType = "Copper";
        String countryOfOrigin = "India";
        int price = 42000;

        System.out.println("Brand: " + brand);
        System.out.println("Class Brand: " + AirConditioner.brandd);

        System.out.println("Tonnage: " + tonnage + " Ton");
        System.out.println("Class Tonnage: " + AirConditioner.tonnagee);

        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Class Energy Rating: " + AirConditioner.energyRatingg);

        System.out.println("Inverter Technology: " + inverterTechnology);
        System.out.println("Class Inverter Technology: " + AirConditioner.inverterTechnologyy);

        System.out.println("Cooling Capacity: " + coolingCapacity);
        System.out.println("Class Cooling Capacity: " + AirConditioner.coolingCapacityy);

        System.out.println("Color: " + color);
        System.out.println("Class Color: " + AirConditioner.colorr);

        System.out.println("Condenser Type: " + condenserType);
        System.out.println("Class Condenser Type: " + AirConditioner.condenserTypee);

        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Class Country Of Origin: " + AirConditioner.countryOfOriginn);

        System.out.println("Price: ₹" + price);
        System.out.println("Class Price: ₹" + AirConditioner.pricee);
    }
}
