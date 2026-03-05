class BoschDishWasherExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=BoschDishWasher.getBrand();System.out.println(brand);
        String model=BoschDishWasher.getModel();System.out.println(model);
        int capacity=BoschDishWasher.getCapacity();System.out.println(capacity);
        String rating=BoschDishWasher.getEnergyRating();System.out.println(rating);
        String color=BoschDishWasher.getColor();System.out.println(color);
        String control=BoschDishWasher.getControlType();System.out.println(control);
        double price=BoschDishWasher.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}