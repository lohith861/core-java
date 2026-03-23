class Olympic {

    static String sports[] = {
        "Athletics",
        "Swimming",
        "Badminton",
        "Wrestling",
        "Boxing",
        "Hockey",
        "Gymnastics",
        "Shooting",
        "Archery",
        "Tennis"
    };

    public static void getSports() {

        for(String sport : sports){
            System.out.println(sport);
        }
    }
}