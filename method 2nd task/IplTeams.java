class IplTeams {

    static String[] tenTeams = {
        "Royal Challengers Bengaluru",
        "Sunrisers Hyderabad",
        "Rajasthan Royals",
        "Punjab Kings",
        "Mumbai Indians",
        "Lucknow Super Giants",
        "Kolkata Knight Riders",
        "Gujarat Titans",
        "Delhi Capitals",
        "Chennai Super Kings"
    };

    public static void getIplTeams() {

        System.out.println("List of IPL Teams:");

        for (String team : tenTeams) {
            System.out.println(team);
        }
    }
}