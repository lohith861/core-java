class BluetoothSpeaker {

    static String brand;
    static String modelName;
    static String connectivity;
    static String batteryLife;
    static String outputPower;
    static String waterResistance;
    static String color;
    static String compatibleDevices;
    static int price;

    public static void main(String[] args) {

        brand = "JBL";
        modelName = "Flip 6";
        connectivity = "Bluetooth";
        batteryLife = "12 Hours";
        outputPower = "30W";
        waterResistance = "IP67";
        color = "Black";
        compatibleDevices = "Android & iOS";
        price = 9999;

        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Output Power: " + outputPower);
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("Color: " + color);
        System.out.println("Compatible Devices: " + compatibleDevices);
        System.out.println("Price: ₹" + price);
    }
}
