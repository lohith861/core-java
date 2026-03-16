class Televisionn {

    static String brand;
    static int modelYear;
    static String productDimensions;
    static String itemModelNumber;
    static String operatingSystem;
    static String tunerTechnology;
    static String responseTime;
    static String displayTechnology;
    static String displayType;

    public static void main(String args[]) {

        brand = "LG";
        modelYear = 2025;
        productDimensions = "23 x 123.6 x 78 cm, 11.5 kg";
        itemModelNumber = "55UA82006LA";
        operatingSystem = "WebOS";
        tunerTechnology = "DVB-T2/T (Terrestrial), DVB-C (Cable), DVB-S2/S (Satellite)";
        responseTime = "6.5 Milliseconds";
        displayTechnology = "4K UHD";
        displayType = "IPS";

        System.out.println("The Brand is " + brand);
        System.out.println("The Model Year is " + modelYear);
        System.out.println("The Product Dimensions are " + productDimensions);
        System.out.println("The Item Model Number is " + itemModelNumber);
        System.out.println("The Operating System of Product is " + operatingSystem);
        System.out.println("The Tuner Technology is " + tunerTechnology);
        System.out.println("The Response Time is " + responseTime);
        System.out.println("The Display Technology is " + displayTechnology);
        System.out.println("The Display Type is " + displayType);
    }
}
