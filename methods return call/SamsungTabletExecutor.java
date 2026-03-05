class SamsungTabletExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=SamsungTablet.getBrand();System.out.println(brand);
        String model=SamsungTablet.getModel();System.out.println(model);
        String processor=SamsungTablet.getProcessor();System.out.println(processor);
        int ram=SamsungTablet.getRam();System.out.println(ram);
        int storage=SamsungTablet.getStorage();System.out.println(storage);
        String display=SamsungTablet.getDisplay();System.out.println(display);
        double price=SamsungTablet.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}