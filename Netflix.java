class Netflix{
  public static void main(String[] anything){
  
String type = "Netflix Movies List";

String kannadaMovies[]={"Roberrt","Vikrant Rona","KGF","Gaalipata 2","Raajakumara",
"Yuvarathnaa","James","Love Mocktail 2","Kaddipudi","Kotigobba","Chamak","Bhajarangi 2",
"Victory","Masterpiece","Pailwaan","Kurukshetra","Ambareesha","Dodmane Hudga",
"Mr. and Mrs. Ramachari","Saarathi","Raam","Bulbul","Madagaja","Arjun Janya","Kranti",
"Kaatera","Vedha","Badava Rascal","Sapta Sagaradaache Ello","Hostel Hudugaru Bekagiddare"};

String teluguMovies[]={"RRR","Major","Dasara","Tillu Square","HIT: The First Case",
"HIT 2","Ante Sundaraniki","Brochevarevarura","Miss Shetty Mr Polishetty","MAD",
"Skylab","Krishna and His Leela","Cinema Bandi","Ammu","Pitta Kathalu",
"Paava Kadhaigal (Telugu Dub)","Thar","Mallesham","Uma Maheswara Ugra Roopasya","Care of Kancharapalem",
"Middle Class Melodies","Arjun Suravaram","Gang Leader","Sye Raa Narasimha Reddy","Evaru",
"Mathu Vadalara","Rangasthalam","Karthikeya 2","Virupaksha","Agent Sai Srinivasa Athreya"};

String hindiMovies[]={"Darlings","Ludo","The White Tiger","Raat Akeli Hai","Bulbbul",
"Gunjan Saxena: The Kargil Girl","Extraction (Hindi Dub)","Class of '83","Mrs. Serial Killer","Choked",
"Tribhanga","Pagglait","Haseen Dillruba","Sardar Ka Grandson","Ajeeb Daastaans",
"Meenakshi Sundareshwar","Minnal Murali (Hindi Dub)","Jogi","Monica O My Darling","Chor Nikal Ke Bhaga",
"Kathal","Lust Stories","Lust Stories 2","The Archies","Jaane Jaan",
"Mission Majnu","Animal (Netflix Release)","Khufiya","Brahmastra (Netflix Release)","Bhakshak"};

String englishAnime[]={
"Naruto","One Piece","Attack on Titan","Demon Slayer","Jujutsu Kaisen",
"Death Note","Dragon Ball Z","My Hero Academia","Bleach","Hunter x Hunter",
"Fullmetal Alchemist: Brotherhood","Tokyo Ghoul","Black Clover","Sword Art Online","Blue Lock",
"Chainsaw Man","Spy x Family","Vinland Saga","Haikyuu","Code Geass",
"Neon Genesis Evangelion","JoJo's Bizarre Adventure","Baki","Dorohedoro","Record of Ragnarok",
"Cyberpunk: Edgerunners","Castlevania","Seven Deadly Sins","Fairy Tail","Mob Psycho 100"};

String japaneseAnime[]={
"Naruto","One Piece","Attack on Titan","Demon Slayer","Jujutsu Kaisen",
"Death Note","Dragon Ball Super","My Hero Academia","Bleach","Hunter x Hunter",
"Fullmetal Alchemist: Brotherhood","Tokyo Ghoul","Black Clover","Sword Art Online","Blue Exorcist",
"Chainsaw Man","Spy x Family","Vinland Saga","Haikyuu","Code Geass",
"Neon Genesis Evangelion","JoJo's Bizarre Adventure","Baki","Dorohedoro","Record of Ragnarok",
"Mob Psycho 100","Fairy Tail","Gintama","Steins;Gate","Your Lie in April"};

String koreanMovies[]={"Train to Busan","#Alive","The Call","Time to Hunt","Space Sweepers",
"Night in Paradise","Sweet & Sour","Love and Leashes","Unlocked","Kill Boksoon",
"The Pirates: The Last Royal Treasure","Yaksha: Ruthless Operations","Seoul Vibe","Carter","The Witch: Part 1",
"The Witch: Part 2","Veteran","The Man from Nowhere","Confidential Assignment","Confidential Assignment 2",
"Fabricated City","Pandora","Ashfall","The Outlaws","The Outlaws 2",
"Silenced","Tune in for Love","Always","Midnight","Believer"};

System.out.println(type + "\n");

System.out.println("Kannada Movies:\n"+kannadaMovies[0]+"\n"+kannadaMovies[1]+"\n"+kannadaMovies[2]+
"\n"+kannadaMovies[3]+"\n"+kannadaMovies[4]+"\n"+kannadaMovies[5]+"\n"+kannadaMovies[6]+"\n"+kannadaMovies[7]+"\n"+
kannadaMovies[8]+"\n"+kannadaMovies[9]+"\n"+kannadaMovies[10]+"\n"+kannadaMovies[11]+"\n"+
kannadaMovies[12]+"\n"+kannadaMovies[13]+"\n"+kannadaMovies[14]+"\n"+kannadaMovies[15]+"\n"+
kannadaMovies[16]+"\n"+kannadaMovies[17]+"\n"+kannadaMovies[18]+"\n"+kannadaMovies[19]+"\n"+
kannadaMovies[20]+"\n"+kannadaMovies[21]+"\n"+kannadaMovies[22]+"\n"+kannadaMovies[23]+"\n"+
kannadaMovies[24]+"\n"+kannadaMovies[25]+"\n"+kannadaMovies[26]+"\n"+kannadaMovies[27]+"\n"+
kannadaMovies[28]+"\n"+kannadaMovies[29]);

System.out.println("\nTelugu Movies:\n"+teluguMovies[0]+"\n"+teluguMovies[1]+"\n"+teluguMovies[2]+
"\n"+teluguMovies[3]+"\n"+teluguMovies[4]+"\n"+teluguMovies[5]+"\n"+teluguMovies[6]+"\n"+teluguMovies[7]
+"\n"+teluguMovies[8]+"\n"+teluguMovies[9]+"\n"+teluguMovies[10]+"\n"+teluguMovies[11]+"\n"+
teluguMovies[12]+"\n"+teluguMovies[13]+"\n"+teluguMovies[14]+"\n"+teluguMovies[15]+"\n"+
teluguMovies[16]+"\n"+teluguMovies[17]+"\n"+teluguMovies[18]+"\n"+teluguMovies[19]+"\n"+
teluguMovies[20]+"\n"+teluguMovies[21]+"\n"+teluguMovies[22]+"\n"+teluguMovies[23]+"\n"+
teluguMovies[24]+"\n"+teluguMovies[25]+"\n"+teluguMovies[26]+"\n"+teluguMovies[27]+"\n"+
teluguMovies[28]+"\n"+teluguMovies[29]);

System.out.println("\nHindi Movies:\n"+hindiMovies[0]+"\n"+hindiMovies[1]+"\n"+hindiMovies[2]
+"\n"+hindiMovies[3]+"\n"+hindiMovies[4]+"\n"+hindiMovies[5]+"\n"+hindiMovies[6]+"\n"+hindiMovies[7]
+"\n"+hindiMovies[8]+"\n"+hindiMovies[9]+"\n"+hindiMovies[10]+"\n"+hindiMovies[11]+"\n"+
hindiMovies[12]+"\n"+hindiMovies[13]+"\n"+hindiMovies[14]+"\n"+hindiMovies[15]+"\n"+
hindiMovies[16]+"\n"+hindiMovies[17]+"\n"+hindiMovies[18]+"\n"+hindiMovies[19]+"\n"+
hindiMovies[20]+"\n"+hindiMovies[21]+"\n"+hindiMovies[22]+"\n"+hindiMovies[23]+"\n"+
hindiMovies[24]+"\n"+hindiMovies[25]+"\n"+hindiMovies[26]+"\n"+hindiMovies[27]+"\n"+
hindiMovies[28]+"\n"+hindiMovies[29]);

System.out.println("\nEnglishAnime:\n"+englishAnime[0]+"\n"+englishAnime[1]+"\n"+englishAnime[2]+"\n"+englishAnime[3]+"\n"+
englishAnime[4]+"\n"+englishAnime[5]+"\n"+englishAnime[6]+"\n"+englishAnime[7]+"\n"+
englishAnime[8]+"\n"+englishAnime[9]+"\n"+englishAnime[10]+"\n"+englishAnime[11]+"\n"+
englishAnime[12]+"\n"+englishAnime[13]+"\n"+englishAnime[14]+"\n"+englishAnime[15]+"\n"+
englishAnime[16]+"\n"+englishAnime[17]+"\n"+englishAnime[18]+"\n"+englishAnime[19]+"\n"+
englishAnime[20]+"\n"+englishAnime[21]+"\n"+englishAnime[22]+"\n"+englishAnime[23]+"\n"+
englishAnime[24]+"\n"+englishAnime[25]+"\n"+englishAnime[26]+"\n"+englishAnime[27]+"\n"+
englishAnime[28]+"\n"+englishAnime[29]);

System.out.println("\nJapaneseAnime:\n"+japaneseAnime[0]+"\n"+japaneseAnime[1]+"\n"+japaneseAnime[2]+"\n"+japaneseAnime[3]+"\n"+
japaneseAnime[4]+"\n"+japaneseAnime[5]+"\n"+japaneseAnime[6]+"\n"+japaneseAnime[7]+"\n"+
japaneseAnime[8]+"\n"+japaneseAnime[9]+"\n"+japaneseAnime[10]+"\n"+japaneseAnime[11]+"\n"+
japaneseAnime[12]+"\n"+japaneseAnime[13]+"\n"+japaneseAnime[14]+"\n"+japaneseAnime[15]+"\n"+
japaneseAnime[16]+"\n"+japaneseAnime[17]+"\n"+japaneseAnime[18]+"\n"+japaneseAnime[19]+"\n"+
japaneseAnime[20]+"\n"+japaneseAnime[21]+"\n"+japaneseAnime[22]+"\n"+japaneseAnime[23]+"\n"+
japaneseAnime[24]+"\n"+japaneseAnime[25]+"\n"+japaneseAnime[26]+"\n"+japaneseAnime[27]+"\n"+
japaneseAnime[28]+"\n"+japaneseAnime[29]);

System.out.println("\nKorean Movies:\n"+koreanMovies[0]+"\n"+koreanMovies[1]+"\n"+koreanMovies[2]
+"\n"+koreanMovies[3]+"\n"+koreanMovies[4]+"\n"+koreanMovies[5]+"\n"+koreanMovies[6]+"\n"+koreanMovies[7]+"\n"+
koreanMovies[8]+"\n"+koreanMovies[9]+"\n"+koreanMovies[10]+"\n"+koreanMovies[11]+"\n"+
koreanMovies[12]+"\n"+koreanMovies[13]+"\n"+koreanMovies[14]+"\n"+koreanMovies[15]+"\n"+
koreanMovies[16]+"\n"+koreanMovies[17]+"\n"+koreanMovies[18]+"\n"+koreanMovies[19]+"\n"+
koreanMovies[20]+"\n"+koreanMovies[21]+"\n"+koreanMovies[22]+"\n"+koreanMovies[23]+"\n"+
koreanMovies[24]+"\n"+koreanMovies[25]+"\n"+koreanMovies[26]+"\n"+koreanMovies[27]+"\n"+
koreanMovies[28]+"\n"+koreanMovies[29]);




  
  
  
  
  }









}