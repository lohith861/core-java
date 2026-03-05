class MiSmartWatchExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=MiSmartWatch.getBrand();System.out.println(brand);
        String model=MiSmartWatch.getModel();System.out.println(model);
        String display=MiSmartWatch.getDisplay();System.out.println(display);
        int battery=MiSmartWatch.getBatteryLife();System.out.println(battery);
        String water=MiSmartWatch.getWaterResistance();System.out.println(water);
        String connect=MiSmartWatch.getConnectivity();System.out.println(connect);
        double price=MiSmartWatch.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}