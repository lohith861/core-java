class AirConditioner {

    static String brand = "Puma";
    static float tonnage = 1.7f;
    static String energyRating = "7 Star";
    static String inverterTechnology = "No";
    static String coolingCapacity = "5080 Watts";
    static String color = "Blue";
    static String condenserType = "Copper";
    static String countryOfOrigin = "India";
    static int price = 42500;

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
		System.out.println("Class Brand: " + AirConditioner.brand);
        System.out.println("Tonnage: " + tonnage + " Ton");
		System.out.println("Class Tonnage: " + AirConditioner.tonnage);
        System.out.println("Energy Rating: " + energyRating);
		System.out.println("Class Energy Rating: " + AirConditioner.energyRating);
        System.out.println("Inverter Technology: " + inverterTechnology);
		System.out.println("Class Inverter Technology: " + AirConditioner.inverterTechnology);
        System.out.println("Cooling Capacity: " + coolingCapacity);
		System.out.println("Class Cooling Capacity: " + AirConditioner.coolingCapacity);
        System.out.println("Color: " + color);
		System.out.println("Class Color: " + AirConditioner.color);
        System.out.println("Condenser Type: " + condenserType);
		System.out.println("Class Condenser Type: " + AirConditioner.condenserType);
        System.out.println("Country Of Origin: " + countryOfOrigin);
		System.out.println("Class Country Of Origin: " + AirConditioner.countryOfOrigin);
        System.out.println("Price: ₹" + price);
		System.out.println("Class Price: ₹" + AirConditioner.price);
    }
}