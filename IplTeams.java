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

    public static void main(String[] args) {
        
        getIplTeams();
    }

    
    public static void getIplTeams() {

       
        for (String team : tenTeams) {
            System.out.println(team);
        }
    }
}