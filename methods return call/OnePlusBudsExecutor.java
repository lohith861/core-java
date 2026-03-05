class OnePlusBudsExecutor {

    public static void main(String[] args) {

        System.out.println("main is started");

        String connectivity = OnePlusBuds.getConnectivity();
        System.out.println(connectivity);

        String design = OnePlusBuds.getHeadphoneDesign();
        System.out.println(design);

        String devices = OnePlusBuds.getCompatibleDevices();
        System.out.println(devices);

        String sweat = OnePlusBuds.getSweatProof();
        System.out.println(sweat);

        String bass = OnePlusBuds.getDeepBass();
        System.out.println(bass);

        String range = OnePlusBuds.getWirelessRange();
        System.out.println(range);

        double version = OnePlusBuds.getBluetoothVersion();
        System.out.println(version);

        System.out.println("main is ended");
    }
}