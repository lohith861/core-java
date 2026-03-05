class PrestigeCookerExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=PrestigeCooker.getBrand();System.out.println(brand);
        String type=PrestigeCooker.getType();System.out.println(type);
        int capacity=PrestigeCooker.getCapacity();System.out.println(capacity);
        String material=PrestigeCooker.getMaterial();System.out.println(material);
        String color=PrestigeCooker.getColor();System.out.println(color);
        String warranty=PrestigeCooker.getWarranty();System.out.println(warranty);
        double price=PrestigeCooker.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}