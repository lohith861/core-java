class BoatSpeakerExecutor {
    public static void main(String[] args){
        System.out.println("main is started");
        String brand=BoatSpeaker.getBrand();System.out.println(brand);
        String model=BoatSpeaker.getModel();System.out.println(model);
        String conn=BoatSpeaker.getConnectivity();System.out.println(conn);
        int battery=BoatSpeaker.getBatteryLife();System.out.println(battery);
        String water=BoatSpeaker.getWaterProof();System.out.println(water);
        int watt=BoatSpeaker.getWattage();System.out.println(watt);
        double price=BoatSpeaker.getPrice();System.out.println(price);
        System.out.println("main is ended");
    }
}