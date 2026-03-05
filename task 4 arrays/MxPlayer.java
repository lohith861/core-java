class MxPlayer{

  public static void main(String[] dramas){

    String type = "MX Player Short Movies and Drama List";

    String kannadaShortMovies[]={
      "Loose Connection","Arishadvarga","Malgudi Days Short","Bypass Road Kannada","The Last Note",
      "Room No 306","Cycle","Silent Night Kannada","The Promise Kannada","Behind the Door",
      "Shadow Game","Broken Dreams","Unknown Face","Street Light","Dark Room",
      "Red Signal","The Visitor","Empty Road","Final Call","Secret Letter",
      "Blind Date Kannada","Lost Signal","The Rain Story","Mirror Image","Hidden Truth",
      "Midnight Call","The Escape Kannada","Hope","Second Chance","Last Breath"
    };

    String teluguShortMovies[]={
      "Kshanam Short","Love at First Sight","Silent Love","The Proposal Telugu","Dark Night",
      "Anukokunda","Mouna Ragam Short","The Promise Telugu","Blind Love","Empty Heart",
      "Room No 13","Shadow Telugu","Rain Story Telugu","Unknown Call","Final Day",
      "Secret Love","Broken Heart","Lost Boy","Mirror Life","Hidden Tears",
      "Last Message","Unexpected","Second Life","Street Story","Midnight Telugu",
      "Red Rose","The Escape Telugu","Hope Telugu","Silent Cry","New Beginning"
    };

    String tamilShortMovies[]={
      "Aval Short","Dark Room Tamil","The Promise Tamil","Silent Love Tamil","Unknown Path",
      "Rain Drops","Broken Dreams Tamil","Hidden Face","Street Light Tamil","Final Call Tamil",
      "Blind Date Tamil","Lost Story","Mirror Image Tamil","Secret Letter Tamil","Last Night",
      "Hope Tamil","Second Chance Tamil","Empty Road Tamil","Red Signal Tamil","Shadow Tamil",
      "Unexpected Tamil","New Life","The Escape Tamil","Unknown Girl","Silent Cry Tamil",
      "Behind Door Tamil","Final Message","Lost Time","Broken Promise","Midnight Tamil"
    };

    String englishShortMovies[]={
      "The Last Call","Broken Silence","Unknown Visitor","Final Message","Midnight Escape",
      "Lost in Time","The Secret Room","Blind Date","Dark Street","Empty House",
      "The Promise","Shadow Game","Hidden Truth","Second Chance","Last Breath",
      "The Visitor","Unknown Face","Silent Cry","Mirror Life","Hope",
      "Red Signal","Street Light","Behind the Door","Final Day","Lost Signal",
      "Unexpected","New Beginning","The Rain Story","Secret Letter","Broken Heart"
    };

    String koreanDrama[]={
      "Goblin","Crash Landing on You","Descendants of the Sun","Vincenzo","Itaewon Class",
      "Hotel Del Luna","The King Eternal Monarch","Healer","The Glory","Start Up",
      "My Love from the Star","While You Were Sleeping","Business Proposal","Hometown Cha Cha Cha","Signal",
      "Mouse","Extraordinary Attorney Woo","Sweet Home","All of Us Are Dead","Kingdom",
      "True Beauty","Penthouse","Sky Castle","The Heirs","Reply 1988",
      "My Mister","Flower of Evil","Weightlifting Fairy","Hospital Playlist","Alchemy of Souls"
    };

    String japaneseDrama[]={
      "Alice in Borderland","Good Morning Call","Erased","Midnight Diner","Followers",
      "Terrace House","The Naked Director","Giri Haji","Switched","Atelier",
      "Million Yen Women","Love Lasts Forever","Hana Yori Dango","Death Note Drama","Liar Game",
      "Nodame Cantabile","Rich Man Poor Woman","Code Blue","Unnatural","1 Litre of Tears",
      "Mother","Legal High","Hero","Signal Japan","Tokyo Love Story",
      "Orange Days","Great Teacher Onizuka","Bloody Monday","My Boss My Hero","Dragon Zakura"
    };

System.out.println(type + "\n");
System.out.println("Kannada Short Movies:\n"+
kannadaShortMovies[0]+"\n"+kannadaShortMovies[1]+"\n"+kannadaShortMovies[2]+"\n"+kannadaShortMovies[3]+"\n"+
kannadaShortMovies[4]+"\n"+kannadaShortMovies[5]+"\n"+kannadaShortMovies[6]+"\n"+kannadaShortMovies[7]+"\n"+
kannadaShortMovies[8]+"\n"+kannadaShortMovies[9]+"\n"+kannadaShortMovies[10]+"\n"+kannadaShortMovies[11]+"\n"+
kannadaShortMovies[12]+"\n"+kannadaShortMovies[13]+"\n"+kannadaShortMovies[14]+"\n"+kannadaShortMovies[15]+"\n"+
kannadaShortMovies[16]+"\n"+kannadaShortMovies[17]+"\n"+kannadaShortMovies[18]+"\n"+kannadaShortMovies[19]+"\n"+
kannadaShortMovies[20]+"\n"+kannadaShortMovies[21]+"\n"+kannadaShortMovies[22]+"\n"+kannadaShortMovies[23]+"\n"+
kannadaShortMovies[24]+"\n"+kannadaShortMovies[25]+"\n"+kannadaShortMovies[26]+"\n"+kannadaShortMovies[27]+"\n"+
kannadaShortMovies[28]+"\n"+kannadaShortMovies[29]);

System.out.println("\nTelugu Short Movies:\n"+
teluguShortMovies[0]+"\n"+teluguShortMovies[1]+"\n"+teluguShortMovies[2]+"\n"+teluguShortMovies[3]+"\n"+
teluguShortMovies[4]+"\n"+teluguShortMovies[5]+"\n"+teluguShortMovies[6]+"\n"+teluguShortMovies[7]+"\n"+
teluguShortMovies[8]+"\n"+teluguShortMovies[9]+"\n"+teluguShortMovies[10]+"\n"+teluguShortMovies[11]+"\n"+
teluguShortMovies[12]+"\n"+teluguShortMovies[13]+"\n"+teluguShortMovies[14]+"\n"+teluguShortMovies[15]+"\n"+
teluguShortMovies[16]+"\n"+teluguShortMovies[17]+"\n"+teluguShortMovies[18]+"\n"+teluguShortMovies[19]+"\n"+
teluguShortMovies[20]+"\n"+teluguShortMovies[21]+"\n"+teluguShortMovies[22]+"\n"+teluguShortMovies[23]+"\n"+
teluguShortMovies[24]+"\n"+teluguShortMovies[25]+"\n"+teluguShortMovies[26]+"\n"+teluguShortMovies[27]+"\n"+
teluguShortMovies[28]+"\n"+teluguShortMovies[29]);

System.out.println("\nTamil Short Movies:\n"+
tamilShortMovies[0]+"\n"+tamilShortMovies[1]+"\n"+tamilShortMovies[2]+"\n"+tamilShortMovies[3]+"\n"+
tamilShortMovies[4]+"\n"+tamilShortMovies[5]+"\n"+tamilShortMovies[6]+"\n"+tamilShortMovies[7]+"\n"+
tamilShortMovies[8]+"\n"+tamilShortMovies[9]+"\n"+tamilShortMovies[10]+"\n"+tamilShortMovies[11]+"\n"+
tamilShortMovies[12]+"\n"+tamilShortMovies[13]+"\n"+tamilShortMovies[14]+"\n"+tamilShortMovies[15]+"\n"+
tamilShortMovies[16]+"\n"+tamilShortMovies[17]+"\n"+tamilShortMovies[18]+"\n"+tamilShortMovies[19]+"\n"+
tamilShortMovies[20]+"\n"+tamilShortMovies[21]+"\n"+tamilShortMovies[22]+"\n"+tamilShortMovies[23]+"\n"+
tamilShortMovies[24]+"\n"+tamilShortMovies[25]+"\n"+tamilShortMovies[26]+"\n"+tamilShortMovies[27]+"\n"+
tamilShortMovies[28]+"\n"+tamilShortMovies[29]);

System.out.println("\nEnglish Short Movies:\n"+
englishShortMovies[0]+"\n"+englishShortMovies[1]+"\n"+englishShortMovies[2]+"\n"+englishShortMovies[3]+"\n"+
englishShortMovies[4]+"\n"+englishShortMovies[5]+"\n"+englishShortMovies[6]+"\n"+englishShortMovies[7]+"\n"+
englishShortMovies[8]+"\n"+englishShortMovies[9]+"\n"+englishShortMovies[10]+"\n"+englishShortMovies[11]+"\n"+
englishShortMovies[12]+"\n"+englishShortMovies[13]+"\n"+englishShortMovies[14]+"\n"+englishShortMovies[15]+"\n"+
englishShortMovies[16]+"\n"+englishShortMovies[17]+"\n"+englishShortMovies[18]+"\n"+englishShortMovies[19]+"\n"+
englishShortMovies[20]+"\n"+englishShortMovies[21]+"\n"+englishShortMovies[22]+"\n"+englishShortMovies[23]+"\n"+
englishShortMovies[24]+"\n"+englishShortMovies[25]+"\n"+englishShortMovies[26]+"\n"+englishShortMovies[27]+"\n"+
englishShortMovies[28]+"\n"+englishShortMovies[29]);


System.out.println("Korean Drama:\n"+
koreanDrama[0]+"\n"+koreanDrama[1]+"\n"+koreanDrama[2]+"\n"+koreanDrama[3]+"\n"+
      koreanDrama[4]+"\n"+koreanDrama[5]+"\n"+koreanDrama[6]+"\n"+koreanDrama[7]+"\n"+
      koreanDrama[8]+"\n"+koreanDrama[9]+"\n"+koreanDrama[10]+"\n"+koreanDrama[11]+"\n"+
      koreanDrama[12]+"\n"+koreanDrama[13]+"\n"+koreanDrama[14]+"\n"+koreanDrama[15]+"\n"+
      koreanDrama[16]+"\n"+koreanDrama[17]+"\n"+koreanDrama[18]+"\n"+koreanDrama[19]+"\n"+
      koreanDrama[20]+"\n"+koreanDrama[21]+"\n"+koreanDrama[22]+"\n"+koreanDrama[23]+"\n"+
      koreanDrama[24]+"\n"+koreanDrama[25]+"\n"+koreanDrama[26]+"\n"+koreanDrama[27]+"\n"+
      koreanDrama[28]+"\n"+koreanDrama[29]);

    System.out.println("\nJapanese Drama:\n"+
      japaneseDrama[0]+"\n"+japaneseDrama[1]+"\n"+japaneseDrama[2]+"\n"+japaneseDrama[3]+"\n"+
      japaneseDrama[4]+"\n"+japaneseDrama[5]+"\n"+japaneseDrama[6]+"\n"+japaneseDrama[7]+"\n"+
      japaneseDrama[8]+"\n"+japaneseDrama[9]+"\n"+japaneseDrama[10]+"\n"+japaneseDrama[11]+"\n"+
      japaneseDrama[12]+"\n"+japaneseDrama[13]+"\n"+japaneseDrama[14]+"\n"+japaneseDrama[15]+"\n"+
      japaneseDrama[16]+"\n"+japaneseDrama[17]+"\n"+japaneseDrama[18]+"\n"+japaneseDrama[19]+"\n"+
      japaneseDrama[20]+"\n"+japaneseDrama[21]+"\n"+japaneseDrama[22]+"\n"+japaneseDrama[23]+"\n"+
      japaneseDrama[24]+"\n"+japaneseDrama[25]+"\n"+japaneseDrama[26]+"\n"+japaneseDrama[27]+"\n"+
      japaneseDrama[28]+"\n"+japaneseDrama[29]);

  }
}
