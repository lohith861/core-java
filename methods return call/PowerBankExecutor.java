class PowerBankExecutor {

    public static void main(String[] args) {

        System.out.println("main is started");

        String brand = PowerBank.getBrand();
        System.out.println(brand);

        String model = PowerBank.getModelNumber();
        System.out.println(model);

        int capacity = PowerBank.getBatteryCapacity();
        System.out.println(capacity);

        String type = PowerBank.getBatteryType();
        System.out.println(type);

        int ports = PowerBank.getOutputPorts();
        System.out.println(ports);

        double power = PowerBank.getMaxPowerOutput();
        System.out.println(power);

        double price = PowerBank.getPrice();
        System.out.println(price);

        System.out.println("main is ended");
    }
}