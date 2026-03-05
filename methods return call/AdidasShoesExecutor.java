class AdidasShoesExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=AdidasShoes.getBrand();System.out.println(brand);
        String model=AdidasShoes.getModel();System.out.println(model);
        String type=AdidasShoes.getType();System.out.println(type);
        String material=AdidasShoes.getMaterial();System.out.println(material);
        int size=AdidasShoes.getSize();System.out.println(size);
        String color=AdidasShoes.getColor();System.out.println(color);
        double price=AdidasShoes.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}