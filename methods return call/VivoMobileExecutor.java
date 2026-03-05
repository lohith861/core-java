class VivoMobileExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=VivoMobile.getBrand();System.out.println(brand);
        String model=VivoMobile.getModel();System.out.println(model);
        String processor=VivoMobile.getProcessor();System.out.println(processor);
        int ram=VivoMobile.getRam();System.out.println(ram);
        int storage=VivoMobile.getStorage();System.out.println(storage);
        String camera=VivoMobile.getCamera();System.out.println(camera);
        double price=VivoMobile.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}