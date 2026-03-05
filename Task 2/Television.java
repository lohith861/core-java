class Television {

    static String brand;
    static int size;
    static String displayType;
    static String resolution;
    static String operatingSystem;
    static String soundOutput;
    static String connectivity;
    static String countryOfOrigin;
    static int price;

    public static void main(String[] args) {

        brand = "Sony";
        size = 55;
        displayType = "LED";
        resolution = "4K UHD";
        operatingSystem = "Android TV";
        soundOutput = "20W";
        connectivity = "WiFi & Bluetooth";
        countryOfOrigin = "India";
        price = 65000;

        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Display Type: " + displayType);
        System.out.println("Resolution: " + resolution);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Sound Output: " + soundOutput);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Price: ₹" + price);
    }
}
