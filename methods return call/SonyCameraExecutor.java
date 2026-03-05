class SonyCameraExecutor {

    public static void main(String[] args) {

        System.out.println("main is started");

        String brand = SonyCamera.getBrand(); System.out.println(brand);
        String model = SonyCamera.getModel(); System.out.println(model);
        String sensor = SonyCamera.getSensor(); System.out.println(sensor);
        String lens = SonyCamera.getLensType(); System.out.println(lens);
        String video = SonyCamera.getVideoQuality(); System.out.println(video);
        String connect = SonyCamera.getConnectivity(); System.out.println(connect);
        double price = SonyCamera.getPrice(); System.out.println(price);

        System.out.println("main is ended");
    }
}