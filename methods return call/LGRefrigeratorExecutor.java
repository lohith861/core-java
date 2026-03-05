class LGRefrigeratorExecutor {

    public static void main(String[] args) {

        System.out.println("main is started");

        String brand = LGRefrigerator.getBrand();
        System.out.println(brand);

        String model = LGRefrigerator.getModel();
        System.out.println(model);

        int capacity = LGRefrigerator.getCapacity();
        System.out.println(capacity);

        String rating = LGRefrigerator.getEnergyRating();
        System.out.println(rating);

        String door = LGRefrigerator.getDoorType();
        System.out.println(door);

        String compressor = LGRefrigerator.getCompressorType();
        System.out.println(compressor);

        double price = LGRefrigerator.getPrice();
        System.out.println(price);

        System.out.println("main is ended");
    }
}