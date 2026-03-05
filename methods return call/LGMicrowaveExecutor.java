class LGMicrowaveExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=LGMicrowave.getBrand();System.out.println(brand);
        String type=LGMicrowave.getType();System.out.println(type);
        int capacity=LGMicrowave.getCapacity();System.out.println(capacity);
        int power=LGMicrowave.getPower();System.out.println(power);
        String control=LGMicrowave.getControlType();System.out.println(control);
        String color=LGMicrowave.getColor();System.out.println(color);
        double price=LGMicrowave.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}