class PowerBank {

    public static String getBrand() {
        System.out.println("getBrand() invoked");
        return "boAt";
    }

    public static String getModelNumber() {
        System.out.println("getModelNumber() invoked");
        return "PB400";
    }

    public static int getBatteryCapacity() {
        System.out.println("getBatteryCapacity() invoked");
        return 20000;
    }

    public static String getBatteryType() {
        System.out.println("getBatteryType() invoked");
        return "Lithium Polymer";
    }

    public static int getOutputPorts() {
        System.out.println("getOutputPorts() invoked");
        return 3;
    }

    public static double getMaxPowerOutput() {
        System.out.println("getMaxPowerOutput() invoked");
        return 22.5;
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        return 1749.0;
    }
}