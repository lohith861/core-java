class Laptop {

    static String brandd;
    static String processorr;
    static int ramm;
    static int storagee;
    static String operatingSystemm;
    static String displaySizee;
    static String colorr;
    static String weightt;
    static int pricee;

    public static void main(String[] args) {

        String brand = "Dell";
        String processor = "Intel i7";
        int ram = 16;
        int storage = 512;
        String operatingSystem = "Windows 11";
        String displaySize = "15.6 inch";
        String color = "Silver";
        String weight = "1.8 kg";
        int price = 85000;

        System.out.println("Brand: " + brand);
        System.out.println("Brand: " + Laptop.brandd);

        System.out.println("Processor: " + processor);
        System.out.println("Processor: " + Laptop.processorr);

        System.out.println("RAM: " + ram + "GB");
        System.out.println("RAM: " + Laptop.ramm);

        System.out.println("Storage: " + storage + "GB");
        System.out.println("Storage: " + Laptop.storagee);

        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Operating System: " + Laptop.operatingSystemm);

        System.out.println("Display Size: " + displaySize);
        System.out.println("Display Size: " + Laptop.displaySizee);

        System.out.println("Color: " + color);
        System.out.println("Color: " + Laptop.colorr);

        System.out.println("Weight: " + weight);
        System.out.println("Weight: " + Laptop.weightt);

        System.out.println("Price: ₹" + price);
        System.out.println("Price: ₹" + Laptop.pricee);
    }
}
