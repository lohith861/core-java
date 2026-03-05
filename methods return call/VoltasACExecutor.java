class VoltasACExecutor {

    public static void main(String[] args) {

        System.out.println("main is started");

        String brand = VoltasAC.getBrand(); System.out.println(brand);
        String model = VoltasAC.getModel(); System.out.println(model);
        String rating = VoltasAC.getEnergyRating(); System.out.println(rating);
        double capacity = VoltasAC.getCapacity(); System.out.println(capacity);
        String compressor = VoltasAC.getCompressor(); System.out.println(compressor);
        String cooling = VoltasAC.getCoolingType(); System.out.println(cooling);
        double price = VoltasAC.getPrice(); System.out.println(price);

        System.out.println("main is ended");
    }
}