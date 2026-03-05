class SmartWatchExecutor {

    public static void main(String[] args) {

        System.out.println("main is started");

        String brand = SmartWatch.getBrand();
        System.out.println(brand);

        String model = SmartWatch.getModel();
        System.out.println(model);

        String display = SmartWatch.getDisplayType();
        System.out.println(display);

        double size = SmartWatch.getDisplaySize();
        System.out.println(size);

        String water = SmartWatch.getWaterResistance();
        System.out.println(water);

        int battery = SmartWatch.getBatteryLife();
        System.out.println(battery);

        double price = SmartWatch.getPrice();
        System.out.println(price);

        System.out.println("main is ended");
    }
}