class Netflix {

    static String kannadaMovies[] = {
        "KGF","KGF 2","Kantara","Ugramm","Mufti","Roberrt",
        "Yuvarathnaa","Raajakumara","Tagaru","Avane Srimannarayana",
        "Bell Bottom","777 Charlie","Garuda Gamana Vrishabha Vahana",
        "Ulidavaru Kandanthe","Lucia","Kirik Party","Dia",
        "Love Mocktail","Vikrant Rona","James",
        "Operation Alamelamma","RangiTaranga","Birbal",
        "Pailwaan","Pogaru","Ayogya","Bhajarangi",
        "Mr and Mrs Ramachari","Gaalipata","Hudugaru"
    };

    static String teluguMovies[] = {
        "RRR","Baahubali1","Baahubali2","Pushpa",
        "AlaVaikunthapurramuloo","Magadheera","Eega","Jersey",
        "ArjunReddy","Rangasthalam","Khaidi","Sye","Leader",
        "HappyDays","Pokiri","Athadu","Khaleja","GabbarSingh",
        "AttarintikiDaredi","JanathaGarage","Srimanthudu",
        "BharatAneNenu","Maharshi","VakeelSaab",
        "SarkaruVaariPaata","Dasara","Salaar",
        "Hanuman","HiNanna","Baby"
    };

    static String hindiMovies[] = {
        "3Idiots","Dangal","PK","ChakDeIndia","Lagaan",
        "Sholay","BahubaliHindi","RRRHindi","Pathaan","Jawan",
        "DDLJ","KaranArjun","Andhadhun","Drishyam","Drishyam2",
        "TaareZameenPar","BajrangiBhaijaan","Sultan","War",
        "TigerZindaHai","GullyBoy","ZindagiNaMilegiDobara",
        "KabirSingh","Sanju","Kesari","OMG","OMG2",
        "Badla","Raazi","Article370"
    };

    static String tamilMovies[] = {
        "Vikram","Leo","Jailer","Master","Kaithi","Asuran",
        "SooraraiPottru","JaiBhim","96","Thuppakki",
        "Ghajini","Anniyan","Sivaji","Enthiran","Kabali",
        "Petta","Doctor","Beast","Mersal","Bigil",
        "Theri","Viswasam","Vedalam","Darbar","Valimai",
        "Don","LoveToday","Maamannan","Viduthalai","Thunivu"
    };

    static String englishMovies[] = {
        "Inception","Interstellar","Avatar","Titanic","Avengers",
        "Endgame","InfinityWar","IronMan","Thor","Hulk",
        "CaptainAmerica","DoctorStrange","Batman","Superman",
        "Joker","DarkKnight","Oppenheimer","Tenet","Matrix",
        "JohnWick","FastAndFurious","MissionImpossible",
        "TopGun","Transformers","Gladiator","Godfather",
        "Rocky","Creed","Deadpool","Logan"
    };

    static String malayalamMovies[] = {
        "Drishyam","Drishyam 2","Lucifer","Empuraan","Premam",
        "Bangalore Days","Uyare","Take Off","Kumbalangi Nights",
        "Joji","Maheshinte Prathikaaram","Charlie","Virus",
        "Android Kunjappan","Home","Great Indian Kitchen",
        "Minnal Murali","Kurup","Jaya Jaya Jaya Hey","Hridayam",
        "Romancham","Bheeshma Parvam","Rorschach",
        "Mukundan Unni Associates","Thallumaala","2018",
        "Cold Case","Helen","CU Soon","Bro Daddy"
    };

    public static void getKannadaMovies() {
        System.out.println("Kannada Movies:");
        for(String m : kannadaMovies)
            System.out.println(m);
    }

    public static void getTeluguMovies() {
        System.out.println("Telugu Movies:");
        for(String m : teluguMovies)
            System.out.println(m);
    }

    public static void getHindiMovies() {
        System.out.println("Hindi Movies:");
        for(String m : hindiMovies)
            System.out.println(m);
    }

    public static void getTamilMovies() {
        System.out.println("Tamil Movies:");
        for(String m : tamilMovies)
            System.out.println(m);
    }

    public static void getEnglishMovies() {
        System.out.println("English Movies:");
        for(String m : englishMovies)
            System.out.println(m);
    }

    public static void getMalayalamMovies() {
        System.out.println("Malayalam Movies:");
        for(String m : malayalamMovies)
            System.out.println(m);
    }
}