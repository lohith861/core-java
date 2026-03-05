class PhilipsTrimmerExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=PhilipsTrimmer.getBrand();System.out.println(brand);
        String model=PhilipsTrimmer.getModel();System.out.println(model);
        String type=PhilipsTrimmer.getType();System.out.println(type);
        int battery=PhilipsTrimmer.getBatteryLife();System.out.println(battery);
        String blade=PhilipsTrimmer.getBladeType();System.out.println(blade);
        String color=PhilipsTrimmer.getColor();System.out.println(color);
        double price=PhilipsTrimmer.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}