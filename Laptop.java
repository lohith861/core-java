class Laptop {

    static String brand;
    static String processor;
    static int ram;
    static int storage;
    static String operatingSystem;
    static String displaySize;
    static String color;
    static String weight;
    static int price;

    public static void main(String[] args) {

        brand = "Dell";
        processor = "Intel i7";
        ram = 16;
        storage = 512;
        operatingSystem = "Windows 11";
        displaySize = "15.6 inch";
        color = "Silver";
        weight = "1.8 kg";
        price = 85000;

        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Display Size: " + displaySize);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Price: ₹" + price);
    }
}
