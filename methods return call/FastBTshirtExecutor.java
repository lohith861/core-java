class FastBTshirtExecutor {

    public static void main(String[] args) {

        System.out.println("main is started");

        String brand = FastBTshirt.getBrand();
        System.out.println(brand);

        String type = FastBTshirt.getType();
        System.out.println(type);

        String sleeve = FastBTshirt.getSleeve();
        System.out.println(sleeve);

        String fabric = FastBTshirt.getFabric();
        System.out.println(fabric);

        String ideal = FastBTshirt.getIdealFor();
        System.out.println(ideal);

        String color = FastBTshirt.getColor();
        System.out.println(color);

        double price = FastBTshirt.getPrice();
        System.out.println(price);

        System.out.println("main is ended");
    }
}