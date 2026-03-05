class IPhone15Executor {

    public static void main(String[] args) {

        System.out.println("main is started");

        String brand = IPhone15.getBrand();
        System.out.println(brand);

        String model = IPhone15.getModel();
        System.out.println(model);

        String processor = IPhone15.getProcessor();
        System.out.println(processor);

        int ram = IPhone15.getRam();
        System.out.println(ram);

        int storage = IPhone15.getStorage();
        System.out.println(storage);

        String camera = IPhone15.getCamera();
        System.out.println(camera);

        double price = IPhone15.getPrice();
        System.out.println(price);

        System.out.println("main is ended");
    }
}