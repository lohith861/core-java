class HPPrinterExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=HPPrinter.getBrand();System.out.println(brand);
        String model=HPPrinter.getModel();System.out.println(model);
        String type=HPPrinter.getType();System.out.println(type);
        String conn=HPPrinter.getConnectivity();System.out.println(conn);
        String color=HPPrinter.getColorPrint();System.out.println(color);
        int speed=HPPrinter.getPrintSpeed();System.out.println(speed);
        double price=HPPrinter.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}