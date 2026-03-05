class LenovoLaptopExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=LenovoLaptop.getBrand();System.out.println(brand);
        String model=LenovoLaptop.getModel();System.out.println(model);
        String processor=LenovoLaptop.getProcessor();System.out.println(processor);
        int ram=LenovoLaptop.getRam();System.out.println(ram);
        int storage=LenovoLaptop.getStorage();System.out.println(storage);
        String os=LenovoLaptop.getOS();System.out.println(os);
        double price=LenovoLaptop.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}