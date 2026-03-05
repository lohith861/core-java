class JBLHeadsetExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=JBLHeadset.getBrand();System.out.println(brand);
        String model=JBLHeadset.getModel();System.out.println(model);
        String type=JBLHeadset.getType();System.out.println(type);
        int battery=JBLHeadset.getBatteryLife();System.out.println(battery);
        String color=JBLHeadset.getColor();System.out.println(color);
        String conn=JBLHeadset.getConnectivity();System.out.println(conn);
        double price=JBLHeadset.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}