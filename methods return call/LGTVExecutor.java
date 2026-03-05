class LGTVExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=LGTV.getBrand();System.out.println(brand);
        String model=LGTV.getModel();System.out.println(model);
        int size=LGTV.getScreenSize();System.out.println(size);
        String display=LGTV.getDisplayType();System.out.println(display);
        String resolution=LGTV.getResolution();System.out.println(resolution);
        String smart=LGTV.getSmartFeatures();System.out.println(smart);
        double price=LGTV.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}