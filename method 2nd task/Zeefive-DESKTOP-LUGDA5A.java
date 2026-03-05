class ZeeFive {

    static String kannadaSerials[] = {
        "Gattimela","Jothe Jotheyali","Naagini","Yaare Nee Mohini",
        "Paaru","Kamali","Krishna Tulasi","Radha Ramana",
        "Sarvamangala Mangalye","Lakshmi Baramma",
        "Puttagowri Maduve","Mangalya","Sathya","Nagini 2",
        "Ashwini Nakshatra","Geetha","Gruhalakshmi","Kaveri",
        "Eradu Kanasu","Suryavamsha","Radha Kalyana",
        "Premaloka","Sundari","Manasa Sarovara","Mayamruga",
        "Janaki Raghava","Amruthavarshini","Hoo Bisilu",
        "Nammane Yuvarani","Gunasundari"
    };

    static String malayalamSerials[] = {
        "Kudumbavilakku","Chembarathi","Pookkalam Varavayi",
        "Kaiyethum Doorath","Parasparam","Karuthamuthu",
        "Sathya Enna Penkutty","Neeyum Njanum","Vanambadi",
        "Bharya","Sthreedhanam","Nilavilakku","Aakashadoothu",
        "Ente Manasaputhri","Kalyani","Mizhi Randilum",
        "Manjil Virinja Poovu","Kanalpoovu","Amrutham",
        "Minnukettu","Chandanamazha","Pranayam","Makalkku"
    };

    static String englishSerials[] = {
        "Blacklist","Suits","Friends","Breaking Bad",
        "Better Call Saul","Money Heist","Dark","Lupin",
        "The Crown","Peaky Blinders","Stranger Things",
        "Narcos","Ozark","Sherlock","Mindhunter",
        "Vikings","The Witcher","Lucifer","Lost",
        "Game of Thrones","Prison Break","Dexter",
        "The Boys","Westworld","The Flash"
    };

    static String hindiSerials[] = {
        "Kumkum Bhagya","Kundali Bhagya","Bhagya Lakshmi",
        "Meet","Tujhse Hai Raabta","Guddan Tumse Na Ho Paayega",
        "Pavitra Rishta","Jhansi Ki Rani","Jodha Akbar",
        "Kasamh Se","Saat Phere","Yeh Teri Galiyan",
        "Jamai Raja","Agnisakshi","Choti Bahu",
        "Bandhan","Zindagi Ki Mehek","Hitler Didi",
        "Punar Vivah","Doli Armaano Ki","Kaala Teeka",
        "Ishq Subhan Allah","Bepanah Pyaar","Ghar Ek Mandir"
    };

    static String teluguSerials[] = {
        "Muddha Mandaram","Radhamma Kuthuru",
        "Gundamma Gari Manavadu","Iddaru Ammayilu",
        "Koilamma","Mutyala Muggu","Chakravakam",
        "Kalyana Vaibhogam","America Ammayi",
        "Sathamanam Bhavathi","Rama Sakkani Seetha",
        "Agni Sakshi","Mangamma Gari Manavadu",
        "Sundari","Amrutham","Bhagya Rekha",
        "Jagadhatri","Prema Entha Madhuram",
        "Trinayani","No.1 Kodalu","Devatha",
        "Akka Chellellu","Krishnaveni"
    };

    static String tamilSerials[] = {
        "Sembaruthi","Oru Oorla Oru Rajakumari",
        "Rettai Roja","Deivamagal","Anandham",
        "Lakshmi","Chellame","Kaatrukkenna Veli",
        "Poove Poochoodava","Sathya",
        "Yaaradi Nee Mohini","Metti Oli",
        "Kolangal","Magarasi","Pandian Stores",
        "Baakiyalakshmi","Thirumathi Hitler",
        "Mouna Ragam","Raja Rani","Roja",
        "Chithi","Endrendrum Punnagai",
        "Kalyanam Mudhal Kadhal Varai","Vidhya No.1"
    };

    public static void getKannadaSerial() {
        System.out.println("Kannada Serials:");
        for(String s : kannadaSerials)
            System.out.println(s);
    }

    public static void getMalayalamSerial() {
        System.out.println("Malayalam Serials:");
        for(String s : malayalamSerials)
            System.out.println(s);
    }

    public static void getEnglishSerial() {
        System.out.println("English Serials:");
        for(String s : englishSerials)
            System.out.println(s);
    }

    public static void getHindiSerial() {
        System.out.println("Hindi Serials:");
        for(String s : hindiSerials)
            System.out.println(s);
    }

    public static void getTeluguSerial() {
        System.out.println("Telugu Serials:");
        for(String s : teluguSerials)
            System.out.println(s);
    }

    public static void getTamilSerial() {
        System.out.println("Tamil Serials:");
        for(String s : tamilSerials)
            System.out.println(s);
    }
}