class HeroBikeExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=HeroBike.getBrand();System.out.println(brand);
        String model=HeroBike.getModel();System.out.println(model);
        int cc=HeroBike.getEngineCC();System.out.println(cc);
        String fuel=HeroBike.getFuelType();System.out.println(fuel);
        String mileage=HeroBike.getMileage();System.out.println(mileage);
        String color=HeroBike.getColor();System.out.println(color);
        double price=HeroBike.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}