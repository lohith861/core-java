class DellMonitorExecutor {

    public static void main(String[] args) {

        System.out.println("main is started");

        String brand = DellMonitor.getBrand(); System.out.println(brand);
        String model = DellMonitor.getModel(); System.out.println(model);
        int size = DellMonitor.getScreenSize(); System.out.println(size);
        String resolution = DellMonitor.getResolution(); System.out.println(resolution);
        String panel = DellMonitor.getPanelType(); System.out.println(panel);
        int refresh = DellMonitor.getRefreshRate(); System.out.println(refresh);
        double price = DellMonitor.getPrice(); System.out.println(price);

        System.out.println("main is ended");
    }
}