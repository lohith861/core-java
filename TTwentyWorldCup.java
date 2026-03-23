class TTwentyWorldCup {

    public static void main(String[] anything) {

        String type = "TTwentyWorldCup";

        String aone="India";
        String atwo="Pakistan";
        String athree="United States";
        String afour="Netherlands";
        String afive="Namibia";

        String groupA[]={aone,atwo,athree,afour,afive};


        String bone="Australia";
        String btwo="Sri Lanka";
        String bthree="Ireland";
        String bfour="Zimbabwe";
        String bfive="Oman";

        String groupB[]={bone,btwo,bthree,bfour,bfive};


        String cone="England";
        String ctwo="West Indies";
        String cthree="Scotland";
        String cfour="Nepal";
        String cfive="Italy";

        String groupC[]={cone,ctwo,cthree,cfour,cfive};


        String done="New Zealand";
        String dtwo="South Africa";
        String dthree="Afghanistan";
        String dfour="Canada";
        String dfive="United Arab Emirates";

        String groupD[]={done,dtwo,dthree,dfour,dfive};


        System.out.println("This is " + type + "\n");

        System.out.println("This is the Group A:\n");
        for(String team : groupA){
            System.out.println(team);
        }

        System.out.println("\nThis is the Group B:\n");
        for(String team : groupB){
            System.out.println(team);
        }

        System.out.println("\nThis is the Group C:\n");
        for(String team : groupC){
            System.out.println(team);
        }

        System.out.println("\nThis is the Group D:\n");
        for(String team : groupD){
            System.out.println(team);
        }

    }
}
