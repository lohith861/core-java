class HaierRefrigeratorExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=HaierRefrigerator.getBrand();System.out.println(brand);
        String model=HaierRefrigerator.getModel();System.out.println(model);
        int capacity=HaierRefrigerator.getCapacity();System.out.println(capacity);
        String rating=HaierRefrigerator.getEnergyRating();System.out.println(rating);
        String door=HaierRefrigerator.getDoorType();System.out.println(door);
        String color=HaierRefrigerator.getColor();System.out.println(color);
        double price=HaierRefrigerator.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}