class BajajMixerExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=BajajMixer.getBrand();System.out.println(brand);
        String model=BajajMixer.getModel();System.out.println(model);
        int watt=BajajMixer.getWattage();System.out.println(watt);
        int jars=BajajMixer.getJars();System.out.println(jars);
        String material=BajajMixer.getMaterial();System.out.println(material);
        String color=BajajMixer.getColor();System.out.println(color);
        double price=BajajMixer.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}