class WorldCupGroups {

    static String groupA[] = {
        "India","Pakistan","United States",
        "Netherlands","Namibia"
    };

    static String groupB[] = {
        "Australia","Sri Lanka","Ireland",
        "Zimbabwe","Oman"
    };

    static String groupC[] = {
        "England","West Indies","Scotland",
        "Nepal","Italy"
    };

    static String groupD[] = {
        "New Zealand","South Africa",
        "Afghanistan","Canada",
        "United Arab Emirates"
    };

    public static void getGroupA() {
        System.out.println("This is Group A:");
        for(String team : groupA)
            System.out.println(team);
    }

    public static void getGroupB() {
        System.out.println("\nThis is Group B:");
        for(String team : groupB)
            System.out.println(team);
    }

    public static void getGroupC() {
        System.out.println("\nThis is Group C:");
        for(String team : groupC)
            System.out.println(team);
    }

    public static void getGroupD() {
        System.out.println("\nThis is Group D:");
        for(String team : groupD)
            System.out.println(team);
    }
}