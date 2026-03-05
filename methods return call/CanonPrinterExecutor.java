class  CanonPrinterExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=CanonPrinter.getBrand();System.out.println(brand);
        String model=CanonPrinter.getModel();System.out.println(model);
        String type=CanonPrinter.getType();System.out.println(type);
        String conn=CanonPrinter.getConnectivity();System.out.println(conn);
        String color=CanonPrinter.getColorPrint();System.out.println(color);
        int speed=CanonPrinter.getPrintSpeed();System.out.println(speed);
        double price=CanonPrinter.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}