class WhirlpoolWashingMachineExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=WhirlpoolWashingMachine.getBrand();System.out.println(brand);
        String type=WhirlpoolWashingMachine.getType();System.out.println(type);
        int capacity=WhirlpoolWashingMachine.getCapacity();System.out.println(capacity);
        String rating=WhirlpoolWashingMachine.getEnergyRating();System.out.println(rating);
        int spin=WhirlpoolWashingMachine.getSpinSpeed();System.out.println(spin);
        String color=WhirlpoolWashingMachine.getColor();System.out.println(color);
        double price=WhirlpoolWashingMachine.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}