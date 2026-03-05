class Mxplayer {

    static String kannadaRealityShows[] = {
        "BiggBossKannada","ComedyKhiladigalu","DanceKarnatakaDance",
        "KannadadaKotyadhipati","DramaJuniors","MasterChefKannada",
        "SaregamapaKannada","SuperSingerKannada","WeekendWithRamesh",
        "HosaComedyTime","MajaaTalkies","ComedyRajaKalakararu",
        "KitchenKhiladigalu","PatreLovers","GenesKannada","Kick",
        "Takadhimita","HejjeGeetham","BangaraPatagalu","LifeGuru",
        "MahaJodi","Maharani","ComedyUtsava","StarSingerKannada",
        "GicchiGiliGili","KannadaGottilla","CookkuKannada",
        "GameOfTheStars","SuperStarKannada","DancingChampionKannada"
    };

    static String teluguRealityShows[] = {
        "BiggBossTelugu","Dhee","Jabardasth","ExtraJabardasth",
        "PaduthaTheeyaga","SuperSingerTelugu","SaregamapaTelugu",
        "MasterChefTelugu","AataJunior","Cash","BoomBoom",
        "StarMahila","Rangoli","BharthiCanCook","DramaJuniorsTelugu",
        "CookWithComaliTelugu","TheVoiceTelugu","Wow","FamilyCircus",
        "ChampionOfTheYear","SumaAdda","TeluguGotTalent",
        "ComedyStars","DancePlusTelugu","SuperChef","GenesTelugu",
        "BigCelebrityChallenge","AhaBhojanambu",
        "StarSingerTelugu","FoodFactoryTelugu"
    };

    static String hindiRealityShows[] = {
        "BiggBossHindi","KhatronKeKhiladi","IndianIdol",
        "DanceIndiaDance","SaReGaMaPa","Roadies","Splitsvilla",
        "MTVHustle","MasterChefIndia","SuperDancer",
        "IndiaGotTalent","ComedyCircus","TheKapilSharmaShow",
        "NachBaliye","SmartJodi","LockUpp","SharkTankIndia",
        "TemptationIsland","FearFactor","IndiaBestDancer",
        "KitchenChampion","DilHaiHindustani","SurvivorIndia",
        "MTVRoadiesRising","MTVRoadiesXtreme","BiggBossOTT",
        "JhalakDikhhlaJaa","Hunarbaz","DancePlus","TheVoiceIndia"
    };

    static String tamilRealityShows[] = {
        "BiggBossTamil","CookWithComali","SuperSingerTamil",
        "SaregamapaTamil","DanceJodiDance","KingsOfComedy",
        "KalakkaPovathuYaaru","StartMusic","MasterChefTamil",
        "TheWallTamil","JodiNo1","NeeyaNaana","DramaJuniorsTamil",
        "ReadySteadyPo","SuperMom","OruKodi","JuniorSuperSinger",
        "TamizhaTamizha","SurvivorTamil",
        "ComedyRajaKalakarargal","Aarambikkalama","StarSingerTamil",
        "TamilGotTalent","KitchenSuperStar","RamarVeedu",
        "NammaVeetuKalyanam","BhakthiThiruvizha","Vaanavil",
        "MrAndMrsTamil","SuperChefTamil"
    };

    static String englishRealityShows[] = {
        "AmericaGotTalent","BritainsGotTalent","TheVoice",
        "MasterChefUS","Survivor","BigBrother","XFactor",
        "AmericasNextTopModel","TheAmazingRace","LoveIsland",
        "TooHotToHandle","HellKitchen","TopChef","NailedIt",
        "QueerEye","RuPaulsDragRace","TheCircle","SharkTankUS",
        "ProjectRunway","DancingWithTheStars",
        "SoYouThinkYouCanDance","KitchenNightmares",
        "InkMaster","GlowUp","NextInFashion","MasterChefCanada"
    };

    static String malayalamRealityShows[] = {
        "BiggBossMalayalam","ComedyStars","FlowersComedy",
        "StarSingerMalayalam","UgramUjjwalam","Super4",
        "SellMeTheAnswer","ComedyUtsavam","KitchenMagic",
        "BumperChiri","LetsRock","Midukki",
        "NingalkkumAakamKodeswaran","D4Dance",
        "MalayalamGotTalent","BestSinger","StarChallenge",
        "SuperChefMalayalam","ChillOut","LaughingVilla",
        "MusicCorner"
    };

    public static void getKannadaShows() {
        System.out.println("Kannada Reality Shows:");
        for(String s : kannadaRealityShows)
            System.out.println(s);
    }

    public static void getTeluguShows() {
        System.out.println("Telugu Reality Shows:");
        for(String s : teluguRealityShows)
            System.out.println(s);
    }

    public static void getHindiShows() {
        System.out.println("Hindi Reality Shows:");
        for(String s : hindiRealityShows)
            System.out.println(s);
    }

    public static void getTamilShows() {
        System.out.println("Tamil Reality Shows:");
        for(String s : tamilRealityShows)
            System.out.println(s);
    }

    public static void getEnglishShows() {
        System.out.println("English Reality Shows:");
        for(String s : englishRealityShows)
            System.out.println(s);
    }

    public static void getMalayalamShows() {
        System.out.println("Malayalam Reality Shows:");
        for(String s : malayalamRealityShows)
            System.out.println(s);
    }
}