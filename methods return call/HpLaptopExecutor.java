class HpLaptopExecutor {

    public static void main(String[] args) {

        System.out.println("main is started");

        String brand = HpLaptop.getBrand();
        System.out.println(brand);

        String model = HpLaptop.getModel();
        System.out.println(model);

        String processor = HpLaptop.getProcessor();
        System.out.println(processor);

        int ram = HpLaptop.getRam();
        System.out.println(ram);

        int storage = HpLaptop.getStorage();
        System.out.println(storage);

        String os = HpLaptop.getOperatingSystem();
        System.out.println(os);

        double price = HpLaptop.getPrice();
        System.out.println(price);

        System.out.println("main is ended");
    }
}