class Mobile {

    static String brand;
    static String model;
    static int ram;
    static int storage;
    static String battery;
    static String camera;
    static String displayType;
    static String operatingSystem;
    static int price;

    public static void main(String[] args) {

        brand = "OnePlus";
        model = "Nord CE 3";
        ram = 8;
        storage = 128;
        battery = "5000 mAh";
        camera = "50 MP";
        displayType = "AMOLED";
        operatingSystem = "Android";
        price = 24999;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Battery: " + battery);
        System.out.println("Camera: " + camera);
        System.out.println("Display Type: " + displayType);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Price: ₹" + price);
    }
}
