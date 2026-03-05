class OppoMobileExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=OppoMobile.getBrand();System.out.println(brand);
        String model=OppoMobile.getModel();System.out.println(model);
        String processor=OppoMobile.getProcessor();System.out.println(processor);
        int ram=OppoMobile.getRam();System.out.println(ram);
        int storage=OppoMobile.getStorage();System.out.println(storage);
        String camera=OppoMobile.getCamera();System.out.println(camera);
        double price=OppoMobile.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}