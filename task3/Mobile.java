class Mobile {

    static String brandd;
    static String modell;
    static int ramm;
    static int storagee;
    static String batteryy;
    static String cameraa;
    static String displayTypee;
    static String operatingSystemm;
    static int pricee;

    public static void main(String[] args) {

        String brand = "OnePlus";
        String model = "Nord CE 3";
        int ram = 8;
        int storage = 128;
        String battery = "5000 mAh";
        String camera = "50 MP";
        String displayType = "AMOLED";
        String operatingSystem = "Android";
        int price = 24999;

        System.out.println("Brand: " + brand);
        System.out.println("Brand: " + Mobile.brandd);

        System.out.println("Model: " + model);
        System.out.println("Model: " + Mobile.modell);

        System.out.println("RAM: " + ram + "GB");
        System.out.println("RAM: " + Mobile.ramm);

        System.out.println("Storage: " + storage + "GB");
        System.out.println("Storage: " + Mobile.storagee);

        System.out.println("Battery: " + battery);
        System.out.println("Battery: " + Mobile.batteryy);

        System.out.println("Camera: " + camera);
        System.out.println("Camera: " + Mobile.cameraa);

        System.out.println("Display Type: " + displayType);
        System.out.println("Display Type: " + Mobile.displayTypee);

        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Operating System: " + Mobile.operatingSystemm);

        System.out.println("Price: ₹" + price);
        System.out.println("Price: ₹" + Mobile.pricee);
    }
}
