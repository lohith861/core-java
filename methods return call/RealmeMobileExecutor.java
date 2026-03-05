class RealmeMobileExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=RealmeMobile.getBrand();System.out.println(brand);
        String model=RealmeMobile.getModel();System.out.println(model);
        String processor=RealmeMobile.getProcessor();System.out.println(processor);
        int ram=RealmeMobile.getRam();System.out.println(ram);
        int storage=RealmeMobile.getStorage();System.out.println(storage);
        String camera=RealmeMobile.getCamera();System.out.println(camera);
        double price=RealmeMobile.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}