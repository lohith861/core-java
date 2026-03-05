class TitanWatchExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=TitanWatch.getBrand();System.out.println(brand);
        String model=TitanWatch.getModel();System.out.println(model);
        String type=TitanWatch.getType();System.out.println(type);
        String strap=TitanWatch.getStrapMaterial();System.out.println(strap);
        String dial=TitanWatch.getDialColor();System.out.println(dial);
        String water=TitanWatch.getWaterResistance();System.out.println(water);
        double price=TitanWatch.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}