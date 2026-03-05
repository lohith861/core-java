class AsusLaptopExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=AsusLaptop.getBrand();System.out.println(brand);
        String model=AsusLaptop.getModel();System.out.println(model);
        String processor=AsusLaptop.getProcessor();System.out.println(processor);
        int ram=AsusLaptop.getRam();System.out.println(ram);
        int storage=AsusLaptop.getStorage();System.out.println(storage);
        String os=AsusLaptop.getOS();System.out.println(os);
        double price=AsusLaptop.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}