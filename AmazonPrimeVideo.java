class AmazonPrimeVideo{
  public static void main(String[] webseries){

    String type = "Amazon Prime Video Web Series List";
    String kannadaWebSeries[] = {
      "Naa Kanda Vishnu","Naa Kanda Puttanna Kanagal","Naa Kanda Ambi","Naa Kanda Vajramuni","Naa Kanda Rajkumar",
      "Humble Politician Nograj","Suzhal  The Vortex","Suzhal - The Vortex Season 2","Killers Of The Cosmos",
      "Murder in the Hills","Kavaludaari","Nathicharami","ACT 1978",
      "Gubbi Mele Brahmastra","Kariya","Mysore Masala",
      "Raa Ra","Gultoo","Dare to Dream", "Kannada Chronicles",
      "Moorane Krishnappa","Maaman","Dhandoraa","Bank of Bhagyalakshmi","Vaamana",
      "Urvi","Killers of the Cosmos: Kannada Ep","Puttanna Kanagal Docu","Naa Kanda Classic","Kannada Shorts Collection" };
    String teluguWebSeries[] = {
      "The Family Man","Gullak","Mirzapur","Panchayat",
      "Bandish Bandits","Breathe","Four More Shots Please","Four More Shots",
      "Aspirants","Modern Love Hyderabad","CommitMental","Gods of Dharmapuri","The Family Man Season 2",
      "City of Dreams","Asur","Bestseller","Made in Heaven",
      "Paatal Lok","Mirzapur Season 2","Breathe: Into the Shadows","The Gone Game",
      "Gullak Season 2","Bandish Bandits Season 2","Jubilee","Metro Park","Inside Edge",
	  "Hostages","Aarya","The Last Hour","Sunflower"};
    String hindiWebSeries[] = {
      "Mirzapur","The Family Man","Paatal Lok","Made in Heaven","Inside Edge",
      "Breathe","Panchayat","Four More Shots Please","The Forgotten Army","Bandish Bandits",
      "Bard of Blood","Tandav","Tandav Season 2","Gullak","The Boys",
      "Comicstaan","The Wheel of Time","The Last Hour","Four More Shots Season 2","Breathe: Into the Shadows",
      "Paatal Lok Season 2 ","Farzi","Jubilee","The Night Manager","Blackbird",
      "Panchayat Season 2","The Family Man Season 3","Jungle Cry","City of Dreams","Made in Heaven Season 2"};
    String englishWebSeries[] = {
      "The Boys","Tom Clancy's Jack Ryan","The Man in the High Castle","Fleabag",
      "The Marvelous Mrs. Maisel","Good Omens","Hanna","Bosch",
      "Reacher","The Expanse","Goliath","Transparent","Hunters",
      "Homecoming","Tales from the Loop","Upload","The Peripheral","Mirzapur",
      "Sneaky Pete","Carnival Row","Modern Love","The Wheel of Time","The Grand Tour",
      "Tom Clancy's Without Remorse","Paper Girls","The Lord of the Rings: The Rings of Power",
      "The Power","The Rig","The Peripheral Season 2","Citadel"};
    String japaneseWebSeries[] = {
      "Tsurune","Dororo","Tokyo Ghoul","Alice in Borderland","Attack on Titan",
      "Vinland Saga","Erased","Beastars","Great Pretender",
      "Parasyte","Samurai Champloo","Cowboy Bebop","Ajin",
      "Godzilla: Planet of the Monsters","Your Lie in April","March Comes in Like a Lion","Kabaneri of the Iron Fortress",
      "Ergo Proxy","Psycho-Pass","Monster","Fullmetal Alchemist","Death Note",
      "Steins Gate","Gintama","Neon Genesis Evangelion","Blade of the Immortal","Blade Runner: Black Out 2022",
      "The Forest of Love","Shoplifters","Parasyte"};
    String koreanWebSeries[] = {
      "Pachinko","The Glory","Marry My Husband","Our Blues","The Night Agent",
      "Familiar Wife","My Mister","Prison Playbook","The Silent Sea","Kingdom",
      "Vincenzo","The Good Bad Mother","The Veil","Signal","Crash Landing on You",
      "Mr. Sunshine","Train to Busan","Night in Paradise","Sweet Home","My Name",
      "Itaewon Class","Love Alarm","Reply 1988","Hospital Playlist","Sisyphus: The Myth",
      "The Silent Sea Season 2","Snowdrop","Alchemy of Souls","The Outlaws","The Glory"};

    System.out.println(type + "\n");

    System.out.println("Kannada Web Series:\n"+
      kannadaWebSeries[0]+"\n"+kannadaWebSeries[1]+"\n"+kannadaWebSeries[2]+"\n"+kannadaWebSeries[3]+"\n"+
      kannadaWebSeries[4]+"\n"+kannadaWebSeries[5]+"\n"+kannadaWebSeries[6]+"\n"+kannadaWebSeries[7]+"\n"+
      kannadaWebSeries[8]+"\n"+kannadaWebSeries[9]+"\n"+kannadaWebSeries[10]+"\n"+kannadaWebSeries[11]+"\n"+
      kannadaWebSeries[12]+"\n"+kannadaWebSeries[13]+"\n"+kannadaWebSeries[14]+"\n"+kannadaWebSeries[15]+"\n"+
      kannadaWebSeries[16]+"\n"+kannadaWebSeries[17]+"\n"+kannadaWebSeries[18]+"\n"+kannadaWebSeries[19]+"\n"+
      kannadaWebSeries[20]+"\n"+kannadaWebSeries[21]+"\n"+kannadaWebSeries[22]+"\n"+kannadaWebSeries[23]+"\n"+
      kannadaWebSeries[24]+"\n"+kannadaWebSeries[25]+"\n"+kannadaWebSeries[26]+"\n"+kannadaWebSeries[27]+"\n"+
      kannadaWebSeries[28]+"\n"+kannadaWebSeries[29]);

    System.out.println("\nTelugu Web Series:\n"+
      teluguWebSeries[0]+"\n"+teluguWebSeries[1]+"\n"+teluguWebSeries[2]+"\n"+teluguWebSeries[3]+"\n"+
      teluguWebSeries[4]+"\n"+teluguWebSeries[5]+"\n"+teluguWebSeries[6]+"\n"+teluguWebSeries[7]+"\n"+
      teluguWebSeries[8]+"\n"+teluguWebSeries[9]+"\n"+teluguWebSeries[10]+"\n"+teluguWebSeries[11]+"\n"+
      teluguWebSeries[12]+"\n"+teluguWebSeries[13]+"\n"+teluguWebSeries[14]+"\n"+teluguWebSeries[15]+"\n"+
      teluguWebSeries[16]+"\n"+teluguWebSeries[17]+"\n"+teluguWebSeries[18]+"\n"+teluguWebSeries[19]+"\n"+
      teluguWebSeries[20]+"\n"+teluguWebSeries[21]+"\n"+teluguWebSeries[22]+"\n"+teluguWebSeries[23]+"\n"+
      teluguWebSeries[24]+"\n"+teluguWebSeries[25]+"\n"+teluguWebSeries[26]+"\n"+teluguWebSeries[27]+"\n"+
      teluguWebSeries[28]+"\n"+teluguWebSeries[29]);

    System.out.println("\nHindi Web Series:\n"+
      hindiWebSeries[0]+"\n"+hindiWebSeries[1]+"\n"+hindiWebSeries[2]+"\n"+hindiWebSeries[3]+"\n"+
      hindiWebSeries[4]+"\n"+hindiWebSeries[5]+"\n"+hindiWebSeries[6]+"\n"+hindiWebSeries[7]+"\n"+
      hindiWebSeries[8]+"\n"+hindiWebSeries[9]+"\n"+hindiWebSeries[10]+"\n"+hindiWebSeries[11]+"\n"+
      hindiWebSeries[12]+"\n"+hindiWebSeries[13]+"\n"+hindiWebSeries[14]+"\n"+hindiWebSeries[15]+"\n"+
      hindiWebSeries[16]+"\n"+hindiWebSeries[17]+"\n"+hindiWebSeries[18]+"\n"+hindiWebSeries[19]+"\n"+
      hindiWebSeries[20]+"\n"+hindiWebSeries[21]+"\n"+hindiWebSeries[22]+"\n"+hindiWebSeries[23]+"\n"+
      hindiWebSeries[24]+"\n"+hindiWebSeries[25]+"\n"+hindiWebSeries[26]+"\n"+hindiWebSeries[27]+"\n"+
      hindiWebSeries[28]+"\n"+hindiWebSeries[29]);

    System.out.println("\nEnglish Web Series:\n"+
      englishWebSeries[0]+"\n"+englishWebSeries[1]+"\n"+englishWebSeries[2]+"\n"+englishWebSeries[3]+"\n"+
      englishWebSeries[4]+"\n"+englishWebSeries[5]+"\n"+englishWebSeries[6]+"\n"+englishWebSeries[7]+"\n"+
      englishWebSeries[8]+"\n"+englishWebSeries[9]+"\n"+englishWebSeries[10]+"\n"+englishWebSeries[11]+"\n"+
      englishWebSeries[12]+"\n"+englishWebSeries[13]+"\n"+englishWebSeries[14]+"\n"+englishWebSeries[15]+"\n"+
      englishWebSeries[16]+"\n"+englishWebSeries[17]+"\n"+englishWebSeries[18]+"\n"+englishWebSeries[19]+"\n"+
      englishWebSeries[20]+"\n"+englishWebSeries[21]+"\n"+englishWebSeries[22]+"\n"+englishWebSeries[23]+"\n"+
      englishWebSeries[24]+"\n"+englishWebSeries[25]+"\n"+englishWebSeries[26]+"\n"+englishWebSeries[27]+"\n"+
      englishWebSeries[28]+"\n"+englishWebSeries[29]);

    System.out.println("\nJapanese Web Series (Anime/Shows):\n"+
      japaneseWebSeries[0]+"\n"+japaneseWebSeries[1]+"\n"+japaneseWebSeries[2]+"\n"+japaneseWebSeries[3]+"\n"+
      japaneseWebSeries[4]+"\n"+japaneseWebSeries[5]+"\n"+japaneseWebSeries[6]+"\n"+japaneseWebSeries[7]+"\n"+
      japaneseWebSeries[8]+"\n"+japaneseWebSeries[9]+"\n"+japaneseWebSeries[10]+"\n"+japaneseWebSeries[11]+"\n"+
      japaneseWebSeries[12]+"\n"+japaneseWebSeries[13]+"\n"+japaneseWebSeries[14]+"\n"+japaneseWebSeries[15]+"\n"+
      japaneseWebSeries[16]+"\n"+japaneseWebSeries[17]+"\n"+japaneseWebSeries[18]+"\n"+japaneseWebSeries[19]+"\n"+
      japaneseWebSeries[20]+"\n"+japaneseWebSeries[21]+"\n"+japaneseWebSeries[22]+"\n"+japaneseWebSeries[23]+"\n"+
      japaneseWebSeries[24]+"\n"+japaneseWebSeries[25]+"\n"+japaneseWebSeries[26]+"\n"+japaneseWebSeries[27]+"\n"+
      japaneseWebSeries[28]+"\n"+japaneseWebSeries[29]);

    System.out.println("\nKorean Web Series:\n"+
      koreanWebSeries[0]+"\n"+koreanWebSeries[1]+"\n"+koreanWebSeries[2]+"\n"+koreanWebSeries[3]+"\n"+
      koreanWebSeries[4]+"\n"+koreanWebSeries[5]+"\n"+koreanWebSeries[6]+"\n"+koreanWebSeries[7]+"\n"+
      koreanWebSeries[8]+"\n"+koreanWebSeries[9]+"\n"+koreanWebSeries[10]+"\n"+koreanWebSeries[11]+"\n"+
      koreanWebSeries[12]+"\n"+koreanWebSeries[13]+"\n"+koreanWebSeries[14]+"\n"+koreanWebSeries[15]+"\n"+
      koreanWebSeries[16]+"\n"+koreanWebSeries[17]+"\n"+koreanWebSeries[18]+"\n"+koreanWebSeries[19]+"\n"+
      koreanWebSeries[20]+"\n"+koreanWebSeries[21]+"\n"+koreanWebSeries[22]+"\n"+koreanWebSeries[23]+"\n"+
      koreanWebSeries[24]+"\n"+koreanWebSeries[25]+"\n"+koreanWebSeries[26]+"\n"+koreanWebSeries[27]+"\n"+
      koreanWebSeries[28]+"\n"+koreanWebSeries[29]);

  }
}
