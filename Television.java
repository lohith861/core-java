class Television {

    static String brandd;
    static int sizee;
    static String displayTypee;
    static String resolutionn;
    static String operatingSystemm;
    static String soundOutputt;
    static String connectivityy;
    static String countryOfOriginn;
    static int pricee;

    public static void main(String[] args) {

        String brand = "Sony";
        int size = 55;
        String displayType = "LED";
        String resolution = "4K UHD";
        String operatingSystem = "Android TV";
        String soundOutput = "20W";
        String connectivity = "WiFi & Bluetooth";
        String countryOfOrigin = "India";
        int price = 65000;

        System.out.println("Brand: " + brand);
        System.out.println("Brand: " + Television.brandd);

        System.out.println("Size: " + size + " inches");
        System.out.println("Size: " + Television.sizee);

        System.out.println("Display Type: " + displayType);
        System.out.println("Display Type: " + Television.displayTypee);

        System.out.println("Resolution: " + resolution);
        System.out.println("Resolution: " + Television.resolutionn);

        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Operating System: " + Television.operatingSystemm);

        System.out.println("Sound Output: " + soundOutput);
        System.out.println("Sound Output: " + Television.soundOutputt);

        System.out.println("Connectivity: " + connectivity);
        System.out.println("Connectivity: " + Television.connectivityy);

        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Country Of Origin: " + Television.countryOfOriginn);

        System.out.println("Price: ₹" + price);
        System.out.println("Price: ₹" + Television.pricee);
    }
}
