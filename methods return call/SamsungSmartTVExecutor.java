class SamsungSmartTVExecutor {

    public static void main(String[] args) {

        System.out.println("main is started");

        String brand = SamsungSmartTV.getBrand();
        System.out.println(brand);

        String model = SamsungSmartTV.getModel();
        System.out.println(model);

        int size = SamsungSmartTV.getScreenSize();
        System.out.println(size);

        String display = SamsungSmartTV.getDisplayType();
        System.out.println(display);

        String resolution = SamsungSmartTV.getResolution();
        System.out.println(resolution);

        String features = SamsungSmartTV.getSmartFeatures();
        System.out.println(features);

        double price = SamsungSmartTV.getPrice();
        System.out.println(price);

        System.out.println("main is ended");
    }
}