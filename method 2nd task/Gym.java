class Gym {

    static String equipments[] = {
        "Treadmill", "Dumbbells", "Bench Press", "Cycling Machine",
        "Leg Press", "Pull-up Bar", "Rowing Machine", "Chest Press",
        "Elliptical Trainer", "Smith Machine"
    };

    public static void getEquipments() {

        for(String equipment : equipments){
            System.out.println(equipment);
        }
    }
}