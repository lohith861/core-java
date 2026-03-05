class Camera {

    static String brandd = "Canon";
    static String resolutionn = "24 MP";
    static String lensTypee = "Prime Lens";
    static String sensorTypee = "CMOS";
    static String connectivityy = "WiFi";
    static String colorr = "Black";
    static String batteryTypee = "Lithium-ion";
    static String countryOfOriginn = "Japan";
    static int pricee = 55000;

    public static void main(String[] args) {

        String brand = "Nikon";
        String resolution = "20 MP";
        String lensType = "Zoom Lens";
        String sensorType = "CCD";
        String connectivity = "Bluetooth";
        String color = "Grey";
        String batteryType = "Rechargeable";
        String countryOfOrigin = "Thailand";
        int price = 48000;

        System.out.println("Brand: " + brand);
        System.out.println("Class Brand: " + Camera.brandd);

        System.out.println("Resolution: " + resolution);
        System.out.println("Class Resolution: " + Camera.resolutionn);

        System.out.println("Lens Type: " + lensType);
        System.out.println("Class Lens Type: " + Camera.lensTypee);

        System.out.println("Sensor Type: " + sensorType);
        System.out.println("Class Sensor Type: " + Camera.sensorTypee);

        System.out.println("Connectivity: " + connectivity);
        System.out.println("Class Connectivity: " + Camera.connectivityy);

        System.out.println("Color: " + color);
        System.out.println("Class Color: " + Camera.colorr);

        System.out.println("Battery Type: " + batteryType);
        System.out.println("Class Battery Type: " + Camera.batteryTypee);

        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Class Country Of Origin: " + Camera.countryOfOriginn);

        System.out.println("Price: ₹" + price);
        System.out.println("Class Price: ₹" + Camera.pricee);
    }
}
