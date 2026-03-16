class SmartWatch {

    static String brand;
    static String displayType;
    static String batteryLife;
    static String strapMaterial;
    static String connectivity;
    static String waterResistance;
    static String shape;
    static String compatibleDevices;
    static int price;

    public static void main(String[] args) {

        brand = "boAt";
        displayType = "AMOLED";
        batteryLife = "7 Days";
        strapMaterial = "Silicone";
        connectivity = "Bluetooth";
        waterResistance = "IP68";
        shape = "Round";
        compatibleDevices = "Android & iOS";
        price = 3499;

        System.out.println("Brand: " + brand);
        System.out.println("Display Type: " + displayType);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Strap Material: " + strapMaterial);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("Shape: " + shape);
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Price: ₹" + price);
    }
}
