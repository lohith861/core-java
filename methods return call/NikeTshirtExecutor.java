class NikeTshirtExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=NikeTshirt.getBrand();System.out.println(brand);
        String type=NikeTshirt.getType();System.out.println(type);
        String fabric=NikeTshirt.getFabric();System.out.println(fabric);
        String fit=NikeTshirt.getFit();System.out.println(fit);
        String color=NikeTshirt.getColor();System.out.println(color);
        String ideal=NikeTshirt.getIdealFor();System.out.println(ideal);
        double price=NikeTshirt.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}