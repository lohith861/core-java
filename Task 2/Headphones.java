class Headphones {

    static String brand;
    static String type;
    static String connectivity;
    static String batteryLife;
    static String color;
    static String noiseCancellation;
    static String driverSize;
    static String compatibleDevices;
    static int price;

    public static void main(String[] args) {

        brand = "Sony";
        type = "Over Ear";
        connectivity = "Wireless";
        batteryLife = "30 Hours";
        color = "Black";
        noiseCancellation = "Active";
        driverSize = "40mm";
        compatibleDevices = "Android & iOS";
        price = 9999;

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Color: " + color);
        System.out.println("Noise Cancellation: " + noiseCancellation);
        System.out.println("Driver Size: " + driverSize);
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Price: ₹" + price);
    }
}
