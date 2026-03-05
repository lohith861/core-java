class PumaShoesExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=PumaShoes.getBrand();System.out.println(brand);
        String model=PumaShoes.getModel();System.out.println(model);
        String type=PumaShoes.getType();System.out.println(type);
        String material=PumaShoes.getMaterial();System.out.println(material);
        int size=PumaShoes.getSize();System.out.println(size);
        String color=PumaShoes.getColor();System.out.println(color);
        double price=PumaShoes.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}