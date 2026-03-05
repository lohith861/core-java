class DMart{

public static String[] searchBrand(String productName){
if(productName == "biscuit"){
    String biscuitBrands[] = {"Britannia Good Day","Britannia Marie Gold","Britannia Tiger",
    "Britannia Little Hearts","Parle-G","Parle Monaco","Parle Hide & Seek",
    "Parle Krackjack","Parle 20-20","Oreo Original","Oreo Chocolate","Britannia Bourbon",
    "Oreo Strawberry","Sunfeast Marie Light","Sunfeast Dark Fantasy","Sunfeast Mom's Magic",
    "Sunfeast Dream Cream","Unibic Choco Chip","Unibic Butter Cookies","McVitie's Digestive",
    "McVitie's Marie","Priyagold Butter Bite","Priyagold Cream Wafers","Anmol Marie",
    "Anmol Dream Lite","Cadbury Oreo Dipped","ITC Farmlite","NutriChoice Digestive","Bisk Farm Bourbon"};
    return biscuitBrands;
	}
	
if(productName == "shampoo"){
    String shampooBrands[] = {"Clinic Plus","Dove Intense Repair","Sunsilk Black Shine","Pantene Smooth & Silky","Head & Shoulders Cool Menthol",
    "Tresemme Keratin","Loreal Total Repair","Garnier Fructis","Indulekha Bringha","Himalaya Anti Hairfall",
    "Meera Herbal","Chik Shampoo","Vatika Naturals","Biotique Bio Kelp","Mamaearth Onion",
    "WOW Apple Cider Vinegar","Khadi Natural","SebaMed Everyday","Matrix Biolage","Wella Professionals",
    "Tresemme Botanique","Dove Daily Shine","Pantene Hairfall Control","Clinic Plus Strong & Long","Sunsilk Yellow",
    "Head & Shoulders Smooth","Loreal Clay","Garnier Ultra Blends","Johnson's Baby Shampoo"};
    return shampooBrands;
}
if(productName == "soap"){
    String soapBrands[] = {"Lux","Lifebuoy","Santoor","Pears Pure","Dove Cream Beauty",
    "Dettol Original","Cinthol Lime","Hamam Neem","Mysore Sandal","Medimix Ayurvedic",
    "Patanjali Kanti","Godrej No.1","Fiama Di Wills","Vivel Aloe","Liril Lemon",
    "Chandrika Ayurvedic","Khadi Herbal","Biotique Basil","SebaMed Cleansing","Johnson's Baby Soap",
    "Himalaya Neem","Ayush Purifying","Power Soap","Nirma Bath","Aramusk",
    "Cinthol Cool","Dettol Skincare","Dove Pink","Lux International"};
    return soapBrands;
}
if(productName == "toothpaste"){
    String toothpasteBrands[] = {"Colgate Strong Teeth","Colgate Max Fresh","Colgate Total","Colgate Visible White","Colgate Active Salt",
    "Closeup Red Hot","Closeup Menthol Fresh","Pepsodent Germicheck","Pepsodent Expert Protection","Sensodyne Rapid Relief",
    "Sensodyne Fresh Mint","Dabur Red","Dabur Meswak","Patanjali Dant Kanti","Vicco Vajradanti",
    "Himalaya Complete Care","Oral-B Pro Health","Aquafresh","Anchor White","Promise Neem",
    "Babool","Meswak Herbal","Colgate Kids","Pepsodent Kids","Sensodyne Repair",
    "Closeup Whitening","Colgate Herbal","Dabur Herbal","Oral-B Gum Care"};
    return toothpasteBrands;
}
if(productName == "hairOil"){
    String hairOilBrands[] = {"Parachute Coconut Oil","Dabur Amla","Indulekha Bringha","Bajaj Almond Drops","Navratna Cool Oil",
    "Himalaya Anti Hairfall","Vatika Coconut Oil","Patanjali Kesh Kanti","Khadi Herbal Oil","WOW Onion Oil",
    "Mamaearth Onion Oil","Biotique Bhringraj","Meera Coconut Oil","Nihar Naturals","Emami 7 Oils",
    "Dabur Jasmine Oil","Parachute Advansed","Dabur Vatika Almond","Indulekha Neemraj","Urban Botanics Oil",
    "Soulflower Castor Oil","Khadi Amla Oil","Himani Navratna","Parachute Aloe Vera","Dabur Anmol",
    "Bajaj Brahmi Oil","Shalimar Coconut Oil","Himalaya Coconut Oil","Kesh King Oil"};
    return hairOilBrands;
}
if(productName == "rice"){
    String riceBrands[] = {"India Gate Basmati","Daawat Basmati","Fortune Basmati","Kohinoor Basmati","Sri Lalitha Rice",
    "Sona Masoori Rice","Aashirvaad Basmati","Royal Basmati","Lal Qilla Basmati","24 Mantra Rice",
    "Organic Tattva Rice","BB Royal Rice","Udhayam Rice","Kurnool Rice","HMT Rice",
    "Ponmani Rice","Double Horse Rice","Shree Rice","Nirapara Rice","Patanjali Rice",
    "Vedaka Rice","Natureland Rice","Sri Bhagyalakshmi Rice","Thanjavur Rice","Krishna Rice",
    "Golden Harvest Rice","Saffola Rice","Daawat Rozana","India Gate Feast Rozzana"};
    return riceBrands;
}
if(productName == "teaPowder"){
    String teaBrands[] = {"Tata Tea Gold","Tata Tea Premium","Red Label","3 Roses","Wagh Bakri",
    "Brooke Bond Taj Mahal","Society Tea","Girnar Tea","AVT Tea","Tetley Tea",
    "Lipton Tea","Organic India Tea","Twinings Tea","Tata Agni","Red Label Natural Care",
    "Wagh Bakri Premium","Taj Mahal Gold","Society Masala Tea","Girnar Masala Tea","Tetley Green Tea",
    "Lipton Yellow Label","AVT Premium","Tata Chakra Gold","Brooke Bond Red Label Dust","Society Leaf Tea",
    "Wagh Bakri Leaf","Girnar Elaichi Tea","Tata Kanan Devan","Brooke Bond 3 Roses Dust"};
    return teaBrands;
}
if(productName == "chocolate"){
    String chocolateBrands[] = {"Dairy Milk","Dairy Milk Silk","KitKat","5 Star","Munch",
    "Perk","Milky Bar","Bournville","Snickers","Mars",
    "Galaxy","Ferrero Rocher","Toblerone","Lindt","Kinder Joy",
    "Hershey's Bar","Amul Dark Chocolate","Nestle Classic","Fuse","Temptations",
    "KitKat Dark","Dairy Milk Fruit & Nut","Milky Bar Choo","Kinder Bueno","Ferrero Moments",
    "Mars Mini","Snickers Mini","Galaxy Smooth","Lindt Excellence"};
    return chocolateBrands;
}
if(productName == "faceWash"){
    String faceWashBrands[] = {"Himalaya Neem","Garnier Men Turbo","Garnier Bright Complete","Pond's Pure White","Pond's Men Energy",
    "Clean & Clear","Lakme Blush & Glow","Mamaearth Ubtan","WOW Aloe Vera","Biotique Honey Gel",
    "Lotus Herbals","Nivea Men","L'Oreal Men Expert","Olay Foaming","Simple Kind To Skin",
    "Plum Green Tea","Cetaphil Cleanser","Neutrogena Deep Clean","VLCC Ayurveda","Khadi Herbal",
    "Patanjali Saundarya","Everyuth Naturals","Joy Skin Fruits","Dove Face Wash","Fair & Lovely Clean Up",
    "The Man Company","UrbanGabru","Minimalist Salicylic","Mamaearth Charcoal"};
    return faceWashBrands;
}
if(productName == "detergentPowder"){
    String detergentBrands[] = {"Surf Excel","Surf Excel Easy Wash","Ariel Matic","Ariel Complete","Tide Plus",
    "Tide Naturals","Rin Advanced","Wheel Green","Nirma Super","Ghadi Detergent",
    "Henko Stain Champion","Fena Superwash","Mr.White","Patang Detergent","Trilo",
    "Xpert Detergent","Ujala Detergent","Morelight Detergent","CleanMate","Power Wash",
    "Sunlight Powder","Bright Wash","Classic Detergent","Ace Detergent","OK Powder",
    "Sparkle Wash","Super White","Perfect Wash","Top Clean"};
    return detergentBrands;
}
if(productName == "coffeePowder"){
    String coffeeBrands[] = {"Bru Instant","Bru Gold","Nescafe Classic","Nescafe Sunrise","Nescafe Gold",
    "Continental Coffee","Tata Coffee","Leo Coffee","Narasu's Coffee","Cothas Coffee",
    "Halli Berri Coffee","Seven Beans","Sleepy Owl","Blue Tokai","Davidoff Coffee",
    "Lavazza Coffee","Rage Coffee","Bevzilla Coffee","Colombian Brew","Bayar's Coffee",
    "Levista Coffee","Malgudi Coffee","Sidapur Coffee","Araku Coffee","Mysore Coffee",
    "Filter Coffee Powder","Strong Blend Coffee","Premium Roast Coffee","Classic Filter Coffee"};
    return coffeeBrands;
}

if(productName == "handWash"){
    String handWashBrands[] = {"Dettol Liquid","Lifebuoy Total","Savlon Moisture","Godrej Protekt","Palmolive Handwash",
    "Himalaya Pure Hands","Dove Handwash","Fiama Handwash","Pears Handwash","Santoor Handwash",
    "Medimix Handwash","Khadi Herbal","Biotique Handwash","Patanjali Handwash","Nivea Handwash",
    "BoroPlus Handwash","Clean & Care","Good Vibes","Vivel Handwash","Joy Handwash",
    "Aloe Vera Handwash","Lemon Fresh Handwash","Neem Care Handwash","Advanced Germ Protection","Soft Touch Handwash",
    "Daily Shine Handwash","Fresh Guard","Gentle Care","Antibacterial Plus"};
    return handWashBrands;
}
if(productName == "deodorant"){
    String deodorantBrands[] = {"Axe Dark Temptation","Axe Signature","Wild Stone","Wild Stone Code","Fogg Fresh",
    "Fogg Royal","Nivea Men","Engage M1","Engage W2","Park Avenue Good Morning",
    "Denver Hamilton","Layer'r Shot","Set Wet Cool","Old Spice","Brut Classic",
    "Yardley London","Rexona Women","Adidas Deo","Nike Deo","Bella Vita Deo",
    "Beardo Mafia","The Man Company","Ramsons Deo","Envy 1000","Secret Temptation",
    "Jovan Musk","Police To Be","Armaf Club De Nuit","Ajmal Silver Shade"};
    return deodorantBrands;
}
if(productName == "milk"){
    String milkBrands[] = {"Nandini Milk","Amul Milk","Arokya Milk","Heritage Milk","Mother Dairy",
    "Dodla Milk","Thirumala Milk","Jersey Milk","Hatsun Milk","Milky Mist Milk",
    "Vijaya Milk","Saras Milk","Parag Milk","Gokul Milk","Kwality Milk",
    "Akshayakalpa Milk","Country Delight","Nutralite Milk","Ananda Milk","Verka Milk",
    "Prabhat Milk","Warana Milk","Nestle A+ Milk","Britannia Milk","Reliance Dairy",
    "Metro Dairy","Namdhari Milk","Organic India Milk","Fresh & Pure Milk"};
    return milkBrands;
}
if(productName == "bread"){
    String breadBrands[] = {"Britannia Bread","Harvest Gold","Modern Bread","Fresho Bread","English Oven",
    "Kitty Bread","Spencer's Bread","Nilgiris Bread","Wibs Bread","Bonn Bread",
    "Kalory Bread","Metro Bread","Perfect Bread","Daily Fresh Bread","Golden Harvest Bread",
    "Premium Slice Bread","Brown Crust Bread","Whole Wheat Bread","Milk Bread","Sandwich Bread",
    "Multi Grain Bread","Oats Bread","Fruit Bread","Garlic Bread","Sweet Bread",
    "Classic White Bread","Soft Slice Bread","Fresh Bake Bread","Super Soft Bread"};
    return breadBrands;
}
if(productName == "sugar"){
    String sugarBrands[] = {"Madhur Sugar","Trust Sugar","Parry's Sugar","Uttam Sugar","Dhampur Sugar",
    "Dwarikesh Sugar","Balrampur Sugar","EID Parry Sugar","Sakthi Sugar","Mawana Sugar",
    "Shree Renuka Sugar","Bajaj Sugar","Triveni Sugar","Organic Tattva Sugar","24 Mantra Sugar",
    "Natureland Sugar","BB Royal Sugar","Vedaka Sugar","Fortune Sugar","More Choice Sugar",
    "Daily Choice Sugar","Classic Crystal Sugar","Premium White Sugar","Refined Sugar","Sulphurless Sugar",
    "Fine Grain Sugar","Natural Cane Sugar","Golden Sugar","Pure Crystal Sugar"};
    return sugarBrands;
}
if(productName == "salt"){
    String saltBrands[] = {"Tata Salt","Aashirvaad Salt","Catch Salt","Annapurna Salt","Saffola Salt",
    "Captain Cook Salt","Nirma Salt","Sambhar Salt","Surya Salt","i-Shakti Salt",
    "Nature Fresh Salt","24 Mantra Salt","Organic Tattva Salt","Vedaka Salt","BB Royal Salt",
    "More Choice Salt","Classic Iodised Salt","Sea Salt","Rock Salt","Himalayan Pink Salt",
    "Sendha Namak","Table Salt","Fine Salt","Crystal Salt","Low Sodium Salt",
    "Premium Iodized Salt","Natural Sea Salt","Refined Salt","Pure White Salt"};
    return saltBrands;
}
if(productName == "toothbrush"){
    String toothbrushBrands[] = {"Colgate ZigZag","Colgate Slim Soft","Colgate Gentle","Oral-B Pro Health","Oral-B Indicator",
    "Oral-B Sensitive","Pepsodent Soft","Pepsodent Double Action","Closeup Toothbrush","Sensodyne Toothbrush",
    "Anchor Toothbrush","Promise Toothbrush","Dabur Toothbrush","Himalaya Toothbrush","Patanjali Toothbrush",
    "Aquafresh Toothbrush","Classic Soft Brush","Medium Bristle Brush","Hard Bristle Brush","Kids Toothbrush",
    "Ultra Soft Brush","Deep Clean Brush","Advanced Care Brush","Premium Brush","Twin Pack Brush",
    "Whitening Brush","Gum Care Brush","Compact Head Brush","Flexi Grip Brush"};
    return toothbrushBrands;
}
if(productName == "faceCream"){
    String faceCreamBrands[] = {"Pond's Light Moisturizer","Pond's Bright Beauty","Lakme Peach Milk","Lakme Absolute","Nivea Soft",
    "Nivea Creme","Olay Natural White","Olay Total Effects","Garnier Light","Garnier Vitamin C",
    "Fair & Lovely Advanced","Himalaya Nourishing","Biotique Morning Nectar","Mamaearth Vitamin C","WOW Skin Science",
    "Lotus Herbals WhiteGlow","VLCC Skin Brightening","Cetaphil Moisturizing","Simple Hydrating","Plum Green Tea",
    "Minimalist Vitamin B5","Khadi Herbal Cream","Patanjali Saundarya","Joy Skin Cream","Dove Beauty Cream",
    "L'Oreal Revitalift","Olay Retinol","Nivea Men Creme","The Man Company Cream"};
    return faceCreamBrands;
}
if(productName == "floorCleaner"){
    String floorCleanerBrands[] = {"Lizol Citrus","Lizol Lavender","Harpic Floor Cleaner","Domex Floor Cleaner","Colin Floor Cleaner",
    "Vim Floor Cleaner","Dettol Floor Cleaner","Savlon Floor Cleaner","Pril Floor Cleaner","Fena Floor Cleaner",
    "Nimyle Floor Cleaner","More Choice Cleaner","Classic Floor Cleaner","Sparkle Floor Cleaner","Power Clean",
    "Phenyl White","Black Phenyl","Herbal Floor Cleaner","Neem Floor Cleaner","Rose Floor Cleaner",
    "Jasmine Floor Cleaner","Lemon Fresh Cleaner","Advanced Germ Cleaner","Premium Floor Wash","Strong Action Cleaner",
    "Disinfectant Floor Cleaner","Shine Plus Cleaner","Daily Fresh Cleaner","Extra Power Cleaner"};
    return floorCleanerBrands;
}
if(productName == "cookingOil"){
    String cookingOilBrands[] = {"Fortune Sunflower","Fortune Rice Bran","Saffola Gold","Saffola Active","Sundrop Oil",
    "Dhara Refined","Gemini Oil","Freedom Oil","Gold Winner","Sunpure Oil",
    "Vimal Oil","Nature Fresh Oil","24 Mantra Oil","Organic Tattva Oil","Vedaka Oil",
    "BB Royal Oil","More Choice Oil","Emami Healthy Oil","Patanjali Oil","Engine Mustard Oil",
    "Gokul Oil","Cargill Nature Fresh","Crystal Oil","Classic Refined Oil","Premium Cooking Oil",
    "Double Filter Oil","Filtered Groundnut Oil","Cold Pressed Oil","Healthy Life Oil"};
    return cookingOilBrands;
}
if(productName == "noodles"){
    String noodlesBrands[] = {"Maggi 2 Minute","Maggi Masala","Yippee Magic Masala","Yippee Mood Masala","Top Ramen Curry",
    "Top Ramen Masala","Ching's Secret","Knorr Soupy Noodles","Sunfeast Yippee","Wai Wai Noodles",
    "Patanjali Atta Noodles","Smith & Jones Noodles","Ching's Schezwan","Maggi Oats Noodles","Maggi Chicken Noodles",
    "Yippee Atta Noodles","Knorr Chicken Noodles","Top Ramen Fiery","Maggi Vegetable","Classic Instant Noodles",
    "Cup Noodles","Premium Wheat Noodles","Spicy Masala Noodles","Cheese Noodles","Korean Style Noodles",
    "Chinese Style Noodles","Desi Masala Noodles","Extra Spicy Noodles","Family Pack Noodles"};
    return noodlesBrands;
}
if(productName == "biscuitsCream"){
    String biscuitsCreamBrands[] = {"Oreo Vanilla","Oreo Chocolate","Britannia Bourbon","Britannia Little Hearts","Sunfeast Dream Cream",
    "Hide & Seek Cream","Parle 20-20 Cream","Priyagold Cream Wafers","Bisk Farm Cream","McVitie's Cream",
    "Unibic Cream","Good Day Cream","Tiger Cream","Anmol Cream","Monaco Cream",
    "Krackjack Cream","Mom's Magic Cream","Dark Fantasy Cream","Treat Croissant Cream","Milk Bikis Cream",
    "Chocolate Cream Biscuit","Strawberry Cream Biscuit","Orange Cream Biscuit","Vanilla Cream Biscuit","Double Cream Biscuit",
    "Premium Cream Biscuit","Family Pack Cream","Kids Cream Biscuit","Classic Cream Biscuit"};
    return biscuitsCreamBrands;
}
if(productName == "iceCream"){
    String iceCreamBrands[] = {"Amul Vanilla","Amul Chocolate","Amul Butterscotch","Kwality Walls Cornetto","Kwality Walls Magnum",
    "Vadilal Vanilla","Vadilal Cassata","Mother Dairy Ice Cream","Arun Ice Cream","Havmor Ice Cream",
    "Cream Bell","Naturals Ice Cream","Baskin Robbins","London Dairy","Top N Town",
    "Dinshaw's Ice Cream","Polar Bear Ice Cream","Scoops Ice Cream","Milky Mist Ice Cream","Nandini Ice Cream",
    "Amul Kulfi","Kwality Walls Feast","Vadilal Kulfi","Mother Dairy Kulfi","Havmor Kulfi",
    "Chocolate Cone","Strawberry Cup","Family Pack Ice Cream","Premium Ice Cream"};
    return iceCreamBrands;
}
if(productName == "jam"){
    String jamBrands[] = {"Kissan Mixed Fruit","Kissan Strawberry","Kissan Mango","Mapro Mixed Fruit","Mapro Strawberry",
    "Tops Mixed Fruit","Tops Orange","Mala's Jam","Urban Platter Jam","24 Mantra Jam",
    "Organic Tattva Jam","BB Royal Jam","More Choice Jam","Classic Fruit Jam","Premium Strawberry Jam",
    "Mixed Berry Jam","Blueberry Jam","Pineapple Jam","Apple Jam","Mango Jam",
    "Raspberry Jam","Natural Fruit Jam","No Sugar Jam","Kids Special Jam","Family Pack Jam",
    "Fresh Fruit Jam","Homestyle Jam","Golden Harvest Jam","Pure Delight Jam"};
    return jamBrands;
}
if(productName == "ketchup"){
    String ketchupBrands[] = {"Kissan Tomato","Maggi Tomato","Tops Tomato","Del Monte Tomato","Heinz Tomato",
    "Veeba Tomato","Ching's Tomato","Urban Platter Ketchup","24 Mantra Ketchup","Organic Tattva Ketchup",
    "BB Royal Ketchup","More Choice Ketchup","Classic Tomato Ketchup","Premium Tomato Sauce","Spicy Tomato Sauce",
    "Sweet Tomato Sauce","Garlic Tomato Sauce","Chilli Tomato Sauce","Hot & Sweet Sauce","Kids Tomato Sauce",
    "Family Pack Ketchup","Restaurant Style Sauce","Desi Style Ketchup","Tangy Tomato Sauce","Extra Spicy Sauce",
    "Natural Tomato Sauce","Fresh Blend Ketchup","Golden Harvest Ketchup","Pure Tomato Sauce"};
    return ketchupBrands;
}
if(productName == "oats"){
    String oatsBrands[] = {"Quaker Oats","Saffola Oats","Kellogg's Oats","Bagrry's Oats","True Elements Oats",
    "24 Mantra Oats","Organic Tattva Oats","BB Royal Oats","More Choice Oats","Patanjali Oats",
    "Natureland Oats","Yoga Bar Oats","Urban Platter Oats","Classic Rolled Oats","Instant Oats",
    "Steel Cut Oats","Masala Oats","Honey Oats","High Fiber Oats","Premium Oats",
    "Healthy Heart Oats","Diet Oats","Family Pack Oats","Kids Oats","Natural Oats",
    "Fresh Harvest Oats","Golden Grain Oats","Wholesome Oats","Pure Oats"};
    return oatsBrands;
}
if(productName == "pickle"){
    String pickleBrands[] = {"Mother's Recipe Mango","Mother's Recipe Lime","Priya Mango Pickle","Priya Lemon Pickle","Aachi Mango Pickle",
    "Aachi Garlic Pickle","Eastern Pickle","Nilons Mango","Nilons Mixed","Bedekar Mango",
    "Patanjali Pickle","24 Mantra Pickle","Organic Tattva Pickle","BB Royal Pickle","More Choice Pickle",
    "Classic Mango Pickle","Premium Lime Pickle","Andhra Avakaya","Gongura Pickle","Garlic Pickle",
    "Mixed Veg Pickle","Red Chilli Pickle","Sweet Lime Pickle","Green Chilli Pickle","Family Pack Pickle",
    "Homestyle Pickle","Traditional Pickle","Desi Style Pickle","Spicy Mango Pickle"};
    return pickleBrands;
}
if(productName == "butter"){
    String butterBrands[] = {"Amul Butter","Nandini Butter","Milky Mist Butter","Mother Dairy Butter","Britannia Butter",
    "Heritage Butter","Dodla Butter","Arokya Butter","Gokul Butter","Saras Butter",
    "Vijaya Butter","Kwality Butter","Ananda Butter","Parag Butter","Warana Butter",
    "Akshayakalpa Butter","Country Delight Butter","Metro Butter","Nilgiris Butter","Daily Fresh Butter",
    "Classic Salted Butter","Unsalted Butter","Premium Butter","Fresh Cream Butter","Farm Fresh Butter",
    "Pure Cow Butter","Table Butter","Spread Butter","Golden Butter"};
    return butterBrands;
}

if(productName == "cheese"){
    String cheeseBrands[] = {"Amul Cheese","Britannia Cheese","Milky Mist Cheese","Mother Dairy Cheese","Go Cheese",
    "D'lecta Cheese","Gowardhan Cheese","Nandini Cheese","Heritage Cheese","Kodai Cheese",
    "Laughing Cow","Arla Cheese","President Cheese","Parag Cheese","Akshayakalpa Cheese",
    "Metro Cheese","Nilgiris Cheese","Processed Cheese","Cheddar Cheese","Mozzarella Cheese",
    "Pizza Cheese","Cheese Cubes","Cheese Slices","Cheese Spread","Cheese Block",
    "Premium Cheese","Classic Cheese","Fresh Cream Cheese","Smoked Cheese"};
    return cheeseBrands;
}

if(productName == "paneer"){
    String paneerBrands[] = {"Amul Paneer","Milky Mist Paneer","Mother Dairy Paneer","Britannia Paneer","Gowardhan Paneer",
    "Nandini Paneer","Heritage Paneer","Dodla Paneer","Arokya Paneer","Akshayakalpa Paneer",
    "Metro Paneer","Nilgiris Paneer","Fresh Paneer","Malai Paneer","Premium Paneer",
    "Organic Paneer","Classic Paneer","Soft Paneer","Farm Fresh Paneer","Cow Milk Paneer",
    "Buffalo Milk Paneer","Malabar Paneer","Daily Fresh Paneer","Healthy Paneer","Pure Paneer",
    "Desi Paneer","Homestyle Paneer","Creamy Paneer","Special Paneer"};
    return paneerBrands;
}

if(productName == "ghee"){
    String gheeBrands[] = {"Amul Ghee","Nandini Ghee","Milky Mist Ghee","Mother Dairy Ghee","Gowardhan Ghee",
    "Aashirvaad Ghee","Patanjali Ghee","Heritage Ghee","Dodla Ghee","Arokya Ghee",
    "Akshayakalpa Ghee","Metro Ghee","Nilgiris Ghee","Desi Cow Ghee","Organic Ghee",
    "Classic Ghee","Premium Ghee","Farm Fresh Ghee","Pure Cow Ghee","Buffalo Ghee",
    "Vedic Ghee","Ananda Ghee","Saras Ghee","Vijaya Ghee","Parag Ghee",
    "Traditional Ghee","Healthy Ghee","Golden Ghee","Fresh Ghee"};
    return gheeBrands;
}

if(productName == "curd"){
    String curdBrands[] = {"Nandini Curd","Amul Curd","Milky Mist Curd","Mother Dairy Curd","Heritage Curd",
    "Dodla Curd","Arokya Curd","Gowardhan Curd","Akshayakalpa Curd","Metro Curd",
    "Nilgiris Curd","Fresh Curd","Thick Curd","Premium Curd","Classic Curd",
    "Organic Curd","Farm Fresh Curd","Healthy Curd","Probiotic Curd","Low Fat Curd",
    "Full Cream Curd","Desi Curd","Homestyle Curd","Daily Fresh Curd","Pure Curd",
    "Natural Curd","Buffalo Curd","Cow Milk Curd","Special Curd"};
    return curdBrands;
}
if(productName == "maida"){
    String maidaBrands[] = {"Aashirvaad Maida","Pillsbury Maida","Fortune Maida","24 Mantra Maida","Organic Tattva Maida",
    "BB Royal Maida","More Choice Maida","Natureland Maida","Classic Maida","Premium Maida",
    "Fine Maida","Super White Maida","Fresh Harvest Maida","Golden Grain Maida","Daily Choice Maida",
    "Shakti Bhog Maida","Rajdhani Maida","Annapurna Maida","Reliable Maida","Grihasthi Maida",
    "Vikram Maida","Samrat Maida","Healthy Life Maida","Pure Maida","Quality Maida",
    "Special Maida","Ultra Fine Maida","Select Maida","Traditional Maida"};
    return maidaBrands;
}

if(productName == "rava"){
    String ravaBrands[] = {"Aashirvaad Rava","Pillsbury Rava","Fortune Rava","24 Mantra Rava","Organic Tattva Rava",
    "BB Royal Rava","More Choice Rava","Natureland Rava","Classic Rava","Premium Rava",
    "Bombay Rava","Fine Rava","Fresh Harvest Rava","Golden Grain Rava","Daily Choice Rava",
    "Shakti Bhog Rava","Rajdhani Rava","Annapurna Rava","Reliable Rava","Grihasthi Rava",
    "Vikram Rava","Samrat Rava","Healthy Life Rava","Pure Rava","Quality Rava",
    "Special Rava","Ultra Fine Rava","Select Rava","Traditional Rava"};
    return ravaBrands;
}

if(productName == "wheatFlour"){
    String wheatFlourBrands[] = {"Aashirvaad Atta","Pillsbury Atta","Fortune Atta","24 Mantra Atta","Organic Tattva Atta",
    "BB Royal Atta","More Choice Atta","Natureland Atta","Classic Atta","Premium Atta",
    "Shakti Bhog Atta","Rajdhani Atta","Annapurna Atta","Reliable Atta","Grihasthi Atta",
    "Vikram Atta","Samrat Atta","Healthy Life Atta","Pure Atta","Quality Atta",
    "Chakki Fresh Atta","Whole Wheat Atta","Multigrain Atta","Daily Choice Atta","Golden Grain Atta",
    "Select Atta","Traditional Atta","Fine Atta","Fresh Harvest Atta"};
    return wheatFlourBrands;
}

if(productName == "poha"){
    String pohaBrands[] = {"Tata Sampann Poha","24 Mantra Poha","Organic Tattva Poha","BB Royal Poha","More Choice Poha",
    "Natureland Poha","Classic Poha","Premium Poha","Thin Poha","Thick Poha",
    "Fresh Harvest Poha","Golden Grain Poha","Daily Choice Poha","Shakti Bhog Poha","Rajdhani Poha",
    "Annapurna Poha","Reliable Poha","Grihasthi Poha","Vikram Poha","Samrat Poha",
    "Healthy Life Poha","Pure Poha","Quality Poha","Special Poha","Select Poha",
    "Traditional Poha","Fine Poha","Farm Fresh Poha","Desi Poha"};
    return pohaBrands;
}

if(productName == "vermicelli"){
    String vermicelliBrands[] = {"MTR Vermicelli","Bambino Vermicelli","Nestle Vermicelli","24 Mantra Vermicelli","Organic Tattva Vermicelli",
    "BB Royal Vermicelli","More Choice Vermicelli","Natureland Vermicelli","Classic Vermicelli","Premium Vermicelli",
    "Roasted Vermicelli","Thin Vermicelli","Fresh Harvest Vermicelli","Golden Grain Vermicelli","Daily Choice Vermicelli",
    "Shakti Bhog Vermicelli","Rajdhani Vermicelli","Annapurna Vermicelli","Reliable Vermicelli","Grihasthi Vermicelli",
    "Vikram Vermicelli","Samrat Vermicelli","Healthy Life Vermicelli","Pure Vermicelli","Quality Vermicelli",
    "Special Vermicelli","Select Vermicelli","Traditional Vermicelli","Fine Vermicelli"};
    return vermicelliBrands;
}

if(productName == "pasta"){
    String pastaBrands[] = {"Maggi Pasta","Sunfeast Pasta","Weikfield Pasta","Borges Pasta","24 Mantra Pasta",
    "Organic Tattva Pasta","BB Royal Pasta","More Choice Pasta","Natureland Pasta","Classic Pasta",
    "Premium Pasta","Penne Pasta","Macaroni Pasta","Spaghetti Pasta","Fusilli Pasta",
    "Whole Wheat Pasta","Cheese Pasta","Tomato Pasta","Italian Style Pasta","Family Pack Pasta",
    "Kids Pasta","Masala Pasta","Healthy Pasta","Fresh Harvest Pasta","Golden Grain Pasta",
    "Select Pasta","Traditional Pasta","Fine Pasta","Special Pasta"};
    return pastaBrands;
}

if(productName == "macaroni"){
    String macaroniBrands[] = {"Weikfield Macaroni","Sunfeast Macaroni","Maggi Macaroni","Borges Macaroni","24 Mantra Macaroni",
    "Organic Tattva Macaroni","BB Royal Macaroni","More Choice Macaroni","Natureland Macaroni","Classic Macaroni",
    "Premium Macaroni","Elbow Macaroni","Cheese Macaroni","Masala Macaroni","Whole Wheat Macaroni",
    "Italian Style Macaroni","Family Pack Macaroni","Kids Macaroni","Healthy Macaroni","Fresh Harvest Macaroni",
    "Golden Grain Macaroni","Select Macaroni","Traditional Macaroni","Fine Macaroni","Special Macaroni",
    "Quality Macaroni","Pure Macaroni","Standard Macaroni","Daily Choice Macaroni"};
    return macaroniBrands;
}

if(productName == "cornflakes"){
    String cornflakesBrands[] = {"Kellogg's Cornflakes","Bagrry's Cornflakes","Quaker Cornflakes","24 Mantra Cornflakes","Organic Tattva Cornflakes",
    "BB Royal Cornflakes","More Choice Cornflakes","Natureland Cornflakes","Classic Cornflakes","Premium Cornflakes",
    "Honey Cornflakes","Choco Cornflakes","Fruit Cornflakes","Almond Cornflakes","High Fiber Cornflakes",
    "Healthy Heart Cornflakes","Kids Cornflakes","Family Pack Cornflakes","Golden Grain Cornflakes","Fresh Harvest Cornflakes",
    "Select Cornflakes","Traditional Cornflakes","Fine Cornflakes","Special Cornflakes","Quality Cornflakes",
    "Pure Cornflakes","Crunchy Cornflakes","Diet Cornflakes","Multigrain Cornflakes"};
    return cornflakesBrands;
}

if(productName == "muesli"){
    String muesliBrands[] = {"Kellogg's Muesli","Bagrry's Muesli","Yoga Bar Muesli","True Elements Muesli","24 Mantra Muesli",
    "Organic Tattva Muesli","BB Royal Muesli","More Choice Muesli","Natureland Muesli","Classic Muesli",
    "Premium Muesli","Fruit & Nut Muesli","Choco Muesli","Almond Muesli","High Fiber Muesli",
    "Healthy Heart Muesli","Kids Muesli","Family Pack Muesli","Golden Grain Muesli","Fresh Harvest Muesli",
    "Select Muesli","Traditional Muesli","Fine Muesli","Special Muesli","Quality Muesli",
    "Pure Muesli","Crunchy Muesli","Diet Muesli","Multigrain Muesli"};
    return muesliBrands;
}

if(productName == "boost"){
    String boostBrands[] = {"Boost Original","Boost Chocolate","Horlicks Classic","Horlicks Chocolate","Bournvita",
    "Complan","Pediasure","Ensure","Protinex","Milo",
    "Junior Horlicks","Women's Horlicks","Mother Horlicks","Junior Complan","Protein Plus",
    "Health Mix Powder","Maltova","Nutrela Health Drink","Junior Boost","Chocolate Malt Drink",
    "Premium Health Drink","Kids Nutrition Drink","Strong Bones Drink","Energy Health Drink","Family Pack Health Drink",
    "Classic Malt Drink","High Protein Drink","Daily Nutrition Drink","Special Boost Pack"};
    return boostBrands;
}
if(productName == "horlicks"){
    String horlicksBrands[] = {"Horlicks Classic","Horlicks Chocolate","Horlicks Elaichi","Horlicks Women's","Horlicks Junior",
    "Horlicks Growth+","Horlicks Protein+","Lite Horlicks","Mother Horlicks","Junior Chocolate Horlicks",
    "Horlicks Diabetes Plus","Horlicks Stage 1","Horlicks Stage 2","Horlicks Stage 3","Horlicks Health & Nutrition",
    "Horlicks Immunity+","Horlicks Malt","Horlicks Vanilla","Horlicks Caramel","Horlicks Almond",
    "Horlicks Kesar","Horlicks Strong","Horlicks Family Pack","Horlicks Sachet","Horlicks Jar",
    "Horlicks Refill","Horlicks Mini Pack","Horlicks Energy","Horlicks Special Edition"};
    return horlicksBrands;
}

if(productName == "bournvita"){
    String bournvitaBrands[] = {"Bournvita Classic","Bournvita Lil Champs","Bournvita 5 Star Magic","Bournvita Women","Bournvita Shakti",
    "Bournvita Chocolate","Bournvita Health Drink","Bournvita Jar Pack","Bournvita Refill","Bournvita Sachet",
    "Bournvita Pro-Health","Bournvita Strong","Bournvita Kids Pack","Bournvita Premium","Bournvita Family Pack",
    "Bournvita Energy+","Bournvita Growth+","Bournvita Mini Pack","Bournvita Almond","Bournvita Caramel",
    "Bournvita Vanilla","Bournvita Malt","Bournvita Jar Small","Bournvita Jar Large","Bournvita Combo Pack",
    "Bournvita Value Pack","Bournvita Limited Edition","Bournvita Immunity+","Bournvita Special Pack"};
    return bournvitaBrands;
}

if(productName == "greenTea"){
    String greenTeaBrands[] = {"Lipton Green Tea","Tetley Green Tea","Tata Green Tea","Girnar Green Tea","Society Green Tea",
    "Wagh Bakri Green Tea","Organic India Green Tea","24 Mantra Green Tea","Twinings Green Tea","Typhoo Green Tea",
    "Lipton Lemon Green Tea","Lipton Honey Green Tea","Tetley Lemon Green Tea","Girnar Tulsi Green Tea","Organic Tulsi Tea",
    "Chamomile Green Tea","Jasmine Green Tea","Mint Green Tea","Slim Green Tea","Detox Green Tea",
    "Classic Green Tea","Premium Green Tea","Family Pack Green Tea","Tea Bags Pack","Loose Green Tea",
    "Herbal Green Tea","Immunity Green Tea","Weight Loss Tea","Pure Green Tea"};
    return greenTeaBrands;
}

if(productName == "peanuts"){
    String peanutsBrands[] = {"Haldiram's Peanuts","Balaji Peanuts","BB Royal Peanuts","24 Mantra Peanuts","Organic Tattva Peanuts",
    "More Choice Peanuts","Classic Peanuts","Premium Peanuts","Salted Peanuts","Masala Peanuts",
    "Roasted Peanuts","Spicy Peanuts","Plain Peanuts","Healthy Peanuts","Fresh Peanuts",
    "Golden Peanuts","Crunchy Peanuts","Desi Peanuts","Farm Fresh Peanuts","Family Pack Peanuts",
    "Jumbo Peanuts","Dry Roasted Peanuts","Chilli Peanuts","Tandoori Peanuts","Value Pack Peanuts",
    "Super Crunch Peanuts","Pure Peanuts","Quality Peanuts","Select Peanuts"};
    return peanutsBrands;
}

if(productName == "almonds"){
    String almondsBrands[] = {"California Almonds","BB Royal Almonds","24 Mantra Almonds","Organic Tattva Almonds","More Choice Almonds",
    "Nutraj Almonds","Happilo Almonds","Vedaka Almonds","Classic Almonds","Premium Almonds",
    "Mamra Almonds","Salted Almonds","Roasted Almonds","Plain Almonds","Healthy Almonds",
    "Fresh Almonds","Golden Almonds","Jumbo Almonds","Family Pack Almonds","Value Pack Almonds",
    "Pure Almonds","Quality Almonds","Select Almonds","Desi Almonds","Natural Almonds",
    "Crunchy Almonds","Super Almonds","Fine Almonds","Special Almonds"};
    return almondsBrands;
}

if(productName == "cashews"){
    String cashewsBrands[] = {"BB Royal Cashews","24 Mantra Cashews","Organic Tattva Cashews","More Choice Cashews","Nutraj Cashews",
    "Happilo Cashews","Vedaka Cashews","Classic Cashews","Premium Cashews","Salted Cashews",
    "Roasted Cashews","Plain Cashews","Healthy Cashews","Fresh Cashews","Golden Cashews",
    "Jumbo Cashews","Family Pack Cashews","Value Pack Cashews","Pure Cashews","Quality Cashews",
    "Select Cashews","Desi Cashews","Natural Cashews","Crunchy Cashews","Super Cashews",
    "Fine Cashews","Special Cashews","W320 Cashews","Goan Cashews"};
    return cashewsBrands;
}

if(productName == "raisins"){
    String raisinsBrands[] = {"BB Royal Raisins","24 Mantra Raisins","Organic Tattva Raisins","More Choice Raisins","Nutraj Raisins",
    "Happilo Raisins","Vedaka Raisins","Classic Raisins","Premium Raisins","Golden Raisins",
    "Black Raisins","Seedless Raisins","Plain Raisins","Healthy Raisins","Fresh Raisins",
    "Jumbo Raisins","Family Pack Raisins","Value Pack Raisins","Pure Raisins","Quality Raisins",
    "Select Raisins","Desi Raisins","Natural Raisins","Crunchy Raisins","Super Raisins",
    "Fine Raisins","Special Raisins","Afghan Raisins","Kishmish Premium"};
    return raisinsBrands;
}

if(productName == "dates"){
    String datesBrands[] = {"Lion Dates","BB Royal Dates","24 Mantra Dates","Organic Tattva Dates","More Choice Dates",
    "Nutraj Dates","Happilo Dates","Vedaka Dates","Classic Dates","Premium Dates",
    "Medjool Dates","Omani Dates","Seedless Dates","Plain Dates","Healthy Dates",
    "Fresh Dates","Golden Dates","Jumbo Dates","Family Pack Dates","Value Pack Dates",
    "Pure Dates","Quality Dates","Select Dates","Desi Dates","Natural Dates",
    "Crunchy Dates","Super Dates","Fine Dates","Special Dates"};
    return datesBrands;
}

if(productName == "candy"){
    String candyBrands[] = {"Alpenliebe","Eclairs","Pulse Candy","Mentos","Center Fresh",
    "Center Fruit","Hajmola Candy","Parle Kismi","Lotte Choco Pie Candy","Lactogem",
    "Pan Pasand","Poppins","Gems Candy","Skittles","Chupa Chups",
    "Jolly Rancher","Toffichoo","Caramel Candy","Milk Toffee","Fruit Candy",
    "Orange Candy","Strawberry Candy","Mint Candy","Chocolate Candy","Sour Candy",
    "Kids Candy Pack","Family Candy Pack","Premium Candy","Classic Candy"};
    return candyBrands;
}

if(productName == "juice"){
    String juiceBrands[] = {"Real Fruit Juice","Tropicana Juice","Minute Maid","B Natural Juice","Paper Boat Juice",
    "Frooti Mango","Maaza Mango","Slice Mango","Appy Fizz","Coolberg Juice",
    "BB Royal Juice","24 Mantra Juice","Organic Tattva Juice","More Choice Juice","Mixed Fruit Juice",
    "Orange Juice","Apple Juice","Pineapple Juice","Guava Juice","Litchi Juice",
    "Mango Juice","Cranberry Juice","Grape Juice","Pomegranate Juice","Fresh Juice Pack",
    "Family Pack Juice","Premium Juice","Classic Juice","Healthy Juice"};
    return juiceBrands;
}
if(productName == "mineralWater"){
    String mineralWaterBrands[] = {"Bisleri","Kinley","Aquafina","Bailley","Himalayan Water",
    "Tata Copper+","Vedica Water","Rail Neer","Kingfisher Water","Oxyrich Water",
    "BB Royal Water","24 Mantra Water","Organic Tattva Water","More Choice Water","Fresh Water Bottle",
    "1L Water Bottle","2L Water Bottle","500ml Water","Premium Mineral Water","Natural Spring Water",
    "Packaged Drinking Water","Pure Life Water","Crystal Clear Water","Healthy Hydration Water","Family Pack Water",
    "Club Soda Water","Sparkling Water","Copper Infused Water","Classic Mineral Water"};
    return mineralWaterBrands;
}

if(productName == "energyDrink"){
    String energyDrinkBrands[] = {"Red Bull","Monster Energy","Sting Energy","Tzinga Energy","Glucon-D Energy",
    "Electral Energy","Enerzal Drink","Paper Boat Energy","BB Royal Energy","24 Mantra Energy",
    "Organic Energy Drink","More Choice Energy","Classic Energy Drink","Premium Energy Drink","Sports Energy Drink",
    "Electrolyte Drink","Orange Energy Drink","Lemon Energy Drink","Mango Energy Drink","Berry Energy Drink",
    "Vitamin Energy Drink","Power Energy Drink","Family Pack Energy","Strong Energy Drink","Healthy Energy Drink",
    "Zero Sugar Energy","Spark Energy","Active Energy","Boost Energy Bottle"};
    return energyDrinkBrands;
}

if(productName == "mayonnaise"){
    String mayonnaiseBrands[] = {"Veeba Mayonnaise","Del Monte Mayo","Dr.Oetker FunFoods","Wingreens Mayo","Heinz Mayo",
    "Kissan Mayo","Urban Platter Mayo","24 Mantra Mayo","Organic Tattva Mayo","BB Royal Mayo",
    "More Choice Mayo","Classic Mayonnaise","Premium Mayo","Garlic Mayo","Chilli Mayo",
    "Tandoori Mayo","Mint Mayo","Olive Oil Mayo","Eggless Mayo","Cheese Mayo",
    "Sandwich Spread Mayo","Burger Mayo","Pizza Mayo","Healthy Mayo","Low Fat Mayo",
    "Family Pack Mayo","Restaurant Style Mayo","Special Mayo","Extra Creamy Mayo"};
    return mayonnaiseBrands;
}

if(productName == "honey"){
    String honeyBrands[] = {"Dabur Honey","Patanjali Honey","Himalaya Honey","Zandu Honey","Lion Honey",
    "24 Mantra Honey","Organic Tattva Honey","BB Royal Honey","More Choice Honey","Apis Honey",
    "Hitkari Honey","Nature's Nectar Honey","Indigenous Honey","Forest Honey","Wild Honey",
    "Raw Honey","Pure Honey","Premium Honey","Classic Honey","Natural Honey",
    "Multiflora Honey","Tulsi Honey","Eucalyptus Honey","Mustard Honey","Farm Fresh Honey",
    "Golden Honey","Healthy Honey","Family Pack Honey","Special Honey"};
    return honeyBrands;
}

if(productName == "peanutButter"){
    String peanutButterBrands[] = {"Pintola Peanut Butter","Sundrop Peanut Butter","Dr.Oetker Peanut Butter","Alpino Peanut Butter","MyFitness Peanut Butter",
    "24 Mantra Peanut Butter","Organic Tattva Peanut Butter","BB Royal Peanut Butter","More Choice Peanut Butter","Crunchy Peanut Butter",
    "Creamy Peanut Butter","Chocolate Peanut Butter","Natural Peanut Butter","Honey Peanut Butter","Classic Peanut Butter",
    "Premium Peanut Butter","High Protein Peanut Butter","Low Sugar Peanut Butter","Family Pack Peanut Butter","Healthy Peanut Butter",
    "Smooth Peanut Butter","Extra Crunch Peanut Butter","Roasted Peanut Butter","Desi Peanut Butter","Value Pack Peanut Butter",
    "Pure Peanut Butter","Quality Peanut Butter","Special Peanut Butter","Select Peanut Butter"};
    return peanutButterBrands;
}

if(productName == "chocoSpread"){
    String chocoSpreadBrands[] = {"Nutella","Hershey's Spread","Sundrop Choco Spread","Dr.Oetker Choco Spread","Veeba Choco Spread",
    "Urban Platter Spread","24 Mantra Spread","Organic Tattva Spread","BB Royal Spread","More Choice Spread",
    "Chocolate Hazelnut Spread","Classic Choco Spread","Premium Choco Spread","Dark Choco Spread","Milk Choco Spread",
    "Crunchy Choco Spread","Smooth Choco Spread","Family Pack Spread","Healthy Choco Spread","Value Pack Spread",
    "Hazelnut Cocoa Spread","Almond Choco Spread","Kids Choco Spread","Dessert Spread","Sweet Spread",
    "Golden Choco Spread","Pure Choco Spread","Quality Spread","Special Spread"};
    return chocoSpreadBrands;
}

if(productName == "papad"){
    String papadBrands[] = {"Lijjat Papad","Haldiram's Papad","Aashirvaad Papad","24 Mantra Papad","Organic Tattva Papad",
    "BB Royal Papad","More Choice Papad","Classic Papad","Premium Papad","Masala Papad",
    "Plain Papad","Punjabi Papad","Jeera Papad","Urad Papad","Moong Papad",
    "Chilli Papad","Garlic Papad","Family Pack Papad","Value Pack Papad","Healthy Papad",
    "Roasted Papad","Fryums Papad","Mini Papad","Large Papad","Desi Papad",
    "Traditional Papad","Golden Papad","Crunchy Papad","Special Papad"};
    return papadBrands;
}

if(productName == "readyToEat"){
    String readyToEatBrands[] = {"MTR Ready To Eat","Haldiram's Ready To Eat","ITC Kitchens Ready","Tasty Bite","Gits Ready Meals",
    "24 Mantra Ready Meals","Organic Tattva Ready","BB Royal Ready","More Choice Ready","Classic Ready Meal",
    "Premium Ready Meal","Rajma Chawal Pack","Dal Makhani Pack","Paneer Butter Masala Pack","Veg Biryani Pack",
    "Poha Ready Pack","Upma Ready Pack","Healthy Ready Meal","Family Pack Meal","Value Pack Meal",
    "Instant Meal Pack","Quick Cook Meal","Desi Ready Meal","Traditional Ready Meal","Frozen Ready Meal",
    "Restaurant Style Meal","Spicy Ready Meal","Special Ready Meal","Mini Ready Meal"};
    return readyToEatBrands;
}

if(productName == "frozenParatha"){
    String frozenParathaBrands[] = {"ITC Frozen Paratha","MTR Frozen Paratha","Gits Frozen Paratha","Haldiram's Paratha","Tasty Bite Paratha",
    "24 Mantra Paratha","Organic Tattva Paratha","BB Royal Paratha","More Choice Paratha","Classic Paratha",
    "Premium Paratha","Aloo Paratha","Methi Paratha","Plain Paratha","Malabar Paratha",
    "Laccha Paratha","Butter Paratha","Family Pack Paratha","Value Pack Paratha","Healthy Paratha",
    "Frozen Roti","Frozen Chapati","Desi Paratha","Traditional Paratha","Restaurant Style Paratha",
    "Mini Paratha","Large Paratha","Special Paratha","Quick Cook Paratha"};
    return frozenParathaBrands;
}

if(productName == "frozenVeggies"){
    String frozenVeggiesBrands[] = {"Safal Frozen Veggies","ITC Frozen Veggies","MTR Frozen Veggies","24 Mantra Frozen","Organic Tattva Frozen",
    "BB Royal Frozen","More Choice Frozen","Classic Frozen Veggies","Premium Frozen Veggies","Frozen Peas Pack",
    "Frozen Corn Pack","Frozen Mixed Veg","Frozen Carrot","Frozen Beans","Frozen Spinach",
    "Healthy Frozen Veg","Family Pack Frozen","Value Pack Frozen","Desi Frozen Veg","Traditional Frozen Veg",
    "Restaurant Style Frozen","Quick Cook Frozen","Mini Frozen Pack","Large Frozen Pack","Special Frozen Veg",
    "Fresh Harvest Frozen","Golden Frozen Veg","Pure Frozen Veg","Quality Frozen Veg"};
    return frozenVeggiesBrands;
}
if(productName == "frozenPeas"){
    String frozenPeasBrands[] = {"Safal Frozen Peas","ITC Frozen Peas","MTR Frozen Peas","24 Mantra Frozen Peas","Organic Tattva Frozen Peas",
    "BB Royal Frozen Peas","More Choice Frozen Peas","Classic Frozen Peas","Premium Frozen Peas","Green Peas Pack",
    "Sweet Peas Pack","Healthy Frozen Peas","Family Pack Peas","Value Pack Peas","Desi Frozen Peas",
    "Traditional Frozen Peas","Restaurant Style Peas","Quick Cook Peas","Mini Peas Pack","Large Peas Pack",
    "Special Frozen Peas","Fresh Harvest Peas","Golden Peas","Pure Frozen Peas","Quality Peas",
    "Standard Frozen Peas","Daily Choice Peas","Farm Fresh Peas","Select Frozen Peas"};
    return frozenPeasBrands;
}

if(productName == "frozenCorn"){
    String frozenCornBrands[] = {"Safal Frozen Corn","ITC Frozen Corn","MTR Frozen Corn","24 Mantra Frozen Corn","Organic Tattva Frozen Corn",
    "BB Royal Frozen Corn","More Choice Frozen Corn","Classic Frozen Corn","Premium Frozen Corn","Sweet Corn Pack",
    "American Corn Pack","Healthy Frozen Corn","Family Pack Corn","Value Pack Corn","Desi Frozen Corn",
    "Traditional Frozen Corn","Restaurant Style Corn","Quick Cook Corn","Mini Corn Pack","Large Corn Pack",
    "Special Frozen Corn","Fresh Harvest Corn","Golden Corn","Pure Frozen Corn","Quality Corn",
    "Standard Frozen Corn","Daily Choice Corn","Farm Fresh Corn","Select Frozen Corn"};
    return frozenCornBrands;
}

if(productName == "tissuePaper"){
    String tissuePaperBrands[] = {"Origami Tissue","Bella Tissue","Premier Tissue","Kleenex Tissue","Soft Touch Tissue",
    "Selpak Tissue","Paseo Tissue","BB Royal Tissue","More Choice Tissue","Classic Tissue",
    "Premium Tissue","Soft Napkin Tissue","Kitchen Tissue Roll","Facial Tissue","Pocket Tissue",
    "Family Pack Tissue","Value Pack Tissue","Extra Soft Tissue","Strong Tissue","Double Ply Tissue",
    "Triple Ply Tissue","White Tissue","Eco Friendly Tissue","Pure Soft Tissue","Quality Tissue",
    "Standard Tissue","Daily Use Tissue","Fresh Tissue Pack","Select Tissue"};
    return tissuePaperBrands;
}

if(productName == "toiletPaper"){
    String toiletPaperBrands[] = {"Origami Toilet Roll","Bella Toilet Roll","Premier Toilet Roll","Kleenex Toilet Roll","Soft Touch Toilet Roll",
    "Selpak Toilet Roll","Paseo Toilet Roll","BB Royal Toilet Roll","More Choice Toilet Roll","Classic Toilet Roll",
    "Premium Toilet Roll","Double Ply Roll","Triple Ply Roll","Family Pack Roll","Value Pack Roll",
    "Extra Soft Roll","Strong Roll","White Roll","Eco Friendly Roll","Pure Soft Roll",
    "Quality Roll","Standard Roll","Daily Use Roll","Fresh Roll Pack","Select Roll",
    "Comfort Roll","Gentle Roll","Luxury Roll","Max Soft Roll"};
    return toiletPaperBrands;
}

if(productName == "garbageBags"){
    String garbageBagsBrands[] = {"Clean Mate Garbage Bags","Origami Garbage Bags","BB Royal Garbage Bags","More Choice Garbage Bags","Classic Garbage Bags",
    "Premium Garbage Bags","Large Garbage Bags","Medium Garbage Bags","Small Garbage Bags","Black Garbage Bags",
    "Green Garbage Bags","Strong Garbage Bags","Extra Thick Bags","Eco Friendly Bags","Compostable Bags",
    "Family Pack Bags","Value Pack Bags","Daily Use Bags","Heavy Duty Bags","Jumbo Bags",
    "Mini Bags","Quality Bags","Standard Bags","Fresh Pack Bags","Select Bags",
    "Kitchen Garbage Bags","Office Garbage Bags","Dustbin Bags","Bio Degradable Bags"};
    return garbageBagsBrands;
}

if(productName == "aluminumFoil"){
    String aluminumFoilBrands[] = {"Hindalco Foil","Freshwrapp Foil","Clean Wrap Foil","BB Royal Foil","More Choice Foil",
    "Classic Foil","Premium Foil","Kitchen Foil Roll","Heavy Duty Foil","Extra Thick Foil",
    "Standard Foil","Family Pack Foil","Value Pack Foil","Strong Foil","Silver Foil",
    "Pure Aluminum Foil","Daily Use Foil","Fresh Pack Foil","Select Foil","Quality Foil",
    "Jumbo Foil Roll","Mini Foil Roll","Eco Friendly Foil","Food Grade Foil","Special Foil",
    "Multipurpose Foil","Home Foil","Professional Foil","Extra Strength Foil"};
    return aluminumFoilBrands;
}

if(productName == "clingWrap"){
    String clingWrapBrands[] = {"Clean Wrap Cling Film","Freshwrapp Cling Film","BB Royal Cling Wrap","More Choice Cling Wrap","Classic Cling Wrap",
    "Premium Cling Wrap","Kitchen Wrap Roll","Stretch Wrap","Extra Strong Wrap","Standard Wrap",
    "Family Pack Wrap","Value Pack Wrap","Food Wrap Film","Transparent Wrap","Multipurpose Wrap",
    "Daily Use Wrap","Fresh Pack Wrap","Select Wrap","Quality Wrap","Jumbo Wrap Roll",
    "Mini Wrap Roll","Eco Friendly Wrap","Food Grade Wrap","Special Wrap","Home Wrap",
    "Professional Wrap","Extra Stretch Wrap","Crystal Clear Wrap","Seal Tight Wrap"};
    return clingWrapBrands;
}

if(productName == "matchBox"){
    String matchBoxBrands[] = {"Ship Matchbox","Homelite Matchbox","Three Mangoes Matchbox","BB Royal Matchbox","More Choice Matchbox",
    "Classic Matchbox","Premium Matchbox","Safety Matchbox","Kitchen Matchbox","Family Pack Matchbox",
    "Value Pack Matchbox","Standard Matchbox","Long Stick Matchbox","Wax Matchbox","Wooden Matchbox",
    "Daily Use Matchbox","Select Matchbox","Quality Matchbox","Jumbo Matchbox","Mini Matchbox",
    "Extra Safety Matchbox","Home Matchbox","Professional Matchbox","Special Matchbox","Strong Matchbox",
    "Traditional Matchbox","Reliable Matchbox","Super Safety Matchbox","Fresh Pack Matchbox"};
    return matchBoxBrands;
}

if(productName == "agarbatti"){
    String agarbattiBrands[] = {"Cycle Agarbatti","Mysore Deepam","Mangaldeep Agarbatti","Zed Black Agarbatti","Patanjali Agarbatti",
    "24 Mantra Agarbatti","Organic Tattva Agarbatti","BB Royal Agarbatti","More Choice Agarbatti","Classic Agarbatti",
    "Premium Agarbatti","Sandal Agarbatti","Rose Agarbatti","Jasmine Agarbatti","Lavender Agarbatti",
    "Family Pack Agarbatti","Value Pack Agarbatti","Long Lasting Agarbatti","Natural Agarbatti","Temple Agarbatti",
    "Pooja Agarbatti","Special Agarbatti","Strong Fragrance Agarbatti","Desi Agarbatti","Traditional Agarbatti",
    "Golden Agarbatti","Pure Agarbatti","Quality Agarbatti","Select Agarbatti"};
    return agarbattiBrands;
}

if(productName == "candle"){
    String candleBrands[] = {"Mysore Candle","Pooja Candle","Aroma Candle","BB Royal Candle","More Choice Candle",
    "Classic Candle","Premium Candle","White Candle","Decorative Candle","Scented Candle",
    "Lavender Candle","Rose Candle","Vanilla Candle","Jasmine Candle","Family Pack Candle",
    "Value Pack Candle","Long Burning Candle","Tea Light Candle","Pillar Candle","Floating Candle",
    "Birthday Candle","Spiral Candle","Color Candle","Eco Friendly Candle","Pure Wax Candle",
    "Golden Candle","Traditional Candle","Special Candle","Festival Candle"};
    return candleBrands;
}
if(productName == "mosquitoCoil"){
    String mosquitoCoilBrands[] = {"Goodknight Coil","All Out Coil","Mortein Coil","Maxo Coil","Tortoise Coil",
    "BB Royal Coil","More Choice Coil","Classic Coil","Premium Coil","Jumbo Coil",
    "Mini Coil","Extra Power Coil","Herbal Coil","Neem Coil","Lavender Coil",
    "Family Pack Coil","Value Pack Coil","Long Lasting Coil","Strong Coil","Night Protection Coil",
    "Daily Use Coil","Select Coil","Quality Coil","Special Coil","Traditional Coil",
    "Green Coil","Gold Coil","Super Coil","Ultra Coil"};
    return mosquitoCoilBrands;
}

if(productName == "mosquitoLiquid"){
    String mosquitoLiquidBrands[] = {"Goodknight Liquid","All Out Liquid","Mortein Liquid","Maxo Liquid","BB Royal Liquid",
    "More Choice Liquid","Classic Liquid","Premium Liquid","Extra Power Liquid","Herbal Liquid",
    "Neem Liquid","Lavender Liquid","Night Protection Liquid","Family Pack Liquid","Value Pack Liquid",
    "Jumbo Liquid","Mini Liquid","Strong Liquid","Daily Use Liquid","Select Liquid",
    "Quality Liquid","Special Liquid","Long Lasting Liquid","Ultra Liquid","Power Plus Liquid",
    "Refill Liquid","Combo Pack Liquid","Advance Protection Liquid","Gold Liquid"};
    return mosquitoLiquidBrands;
}

if(productName == "floorMop"){
    String floorMopBrands[] = {"Scotch Brite Mop","Gala Mop","Spotzero Mop","Milton Mop","BB Royal Mop",
    "More Choice Mop","Classic Mop","Premium Mop","Spin Mop","Flat Mop",
    "Microfiber Mop","Wet Mop","Dry Mop","Jumbo Mop","Mini Mop",
    "Family Pack Mop","Value Pack Mop","Strong Handle Mop","Steel Rod Mop","Plastic Mop",
    "Daily Use Mop","Select Mop","Quality Mop","Special Mop","Traditional Mop",
    "Super Absorb Mop","Easy Clean Mop","Pro Mop","Ultra Mop"};
    return floorMopBrands;
}

if(productName == "broom"){
    String broomBrands[] = {"Gala Broom","Spotzero Broom","BB Royal Broom","More Choice Broom","Classic Broom",
    "Premium Broom","Soft Broom","Hard Broom","Grass Broom","Plastic Broom",
    "Long Handle Broom","Mini Broom","Jumbo Broom","Family Pack Broom","Value Pack Broom",
    "Strong Stick Broom","Steel Rod Broom","Daily Use Broom","Select Broom","Quality Broom",
    "Special Broom","Traditional Broom","Super Clean Broom","Easy Sweep Broom","Eco Broom",
    "Heavy Duty Broom","Light Weight Broom","Pro Broom","Ultra Broom"};
    return broomBrands;
}

if(productName == "bucket"){
    String bucketBrands[] = {"Milton Bucket","Cello Bucket","Supreme Bucket","Princeware Bucket","BB Royal Bucket",
    "More Choice Bucket","Classic Bucket","Premium Bucket","Plastic Bucket","Steel Bucket",
    "Jumbo Bucket","Mini Bucket","Large Bucket","Small Bucket","Family Pack Bucket",
    "Value Pack Bucket","Strong Handle Bucket","Color Bucket","Designer Bucket","Eco Bucket",
    "Daily Use Bucket","Select Bucket","Quality Bucket","Special Bucket","Traditional Bucket",
    "Super Strong Bucket","Heavy Duty Bucket","Light Weight Bucket","Ultra Bucket"};
    return bucketBrands;
}

if(productName == "mug"){
    String mugBrands[] = {"Milton Mug","Cello Mug","Supreme Mug","Princeware Mug","BB Royal Mug",
    "More Choice Mug","Classic Mug","Premium Mug","Plastic Mug","Steel Mug",
    "Jumbo Mug","Mini Mug","Large Mug","Small Mug","Family Pack Mug",
    "Value Pack Mug","Strong Mug","Color Mug","Designer Mug","Eco Mug",
    "Daily Use Mug","Select Mug","Quality Mug","Special Mug","Traditional Mug",
    "Super Strong Mug","Heavy Duty Mug","Light Weight Mug","Ultra Mug"};
    return mugBrands;
}

if(productName == "lunchBox"){
    String lunchBoxBrands[] = {"Milton Lunch Box","Cello Lunch Box","Tupperware Lunch Box","Signoraware Lunch Box","BB Royal Lunch Box",
    "More Choice Lunch Box","Classic Lunch Box","Premium Lunch Box","Steel Lunch Box","Plastic Lunch Box",
    "Jumbo Lunch Box","Mini Lunch Box","Large Lunch Box","Small Lunch Box","Family Pack Lunch Box",
    "Value Pack Lunch Box","Microwave Safe Lunch Box","Leak Proof Lunch Box","Designer Lunch Box","Eco Lunch Box",
    "Daily Use Lunch Box","Select Lunch Box","Quality Lunch Box","Special Lunch Box","Traditional Lunch Box",
    "Super Strong Lunch Box","Heavy Duty Lunch Box","Light Weight Lunch Box","Ultra Lunch Box"};
    return lunchBoxBrands;
}

if(productName == "waterBottle"){
    String waterBottleBrands[] = {"Milton Bottle","Cello Bottle","Tupperware Bottle","Signoraware Bottle","BB Royal Bottle",
    "More Choice Bottle","Classic Bottle","Premium Bottle","Steel Bottle","Plastic Bottle",
    "Copper Bottle","Jumbo Bottle","Mini Bottle","Large Bottle","Small Bottle",
    "Family Pack Bottle","Value Pack Bottle","Leak Proof Bottle","Designer Bottle","Eco Bottle",
    "Daily Use Bottle","Select Bottle","Quality Bottle","Special Bottle","Traditional Bottle",
    "Super Strong Bottle","Heavy Duty Bottle","Light Weight Bottle","Ultra Bottle"};
    return waterBottleBrands;
}

if(productName == "pressureCooker"){
    String pressureCookerBrands[] = {"Prestige Cooker","Hawkins Cooker","Butterfly Cooker","Pigeon Cooker","BB Royal Cooker",
    "More Choice Cooker","Classic Cooker","Premium Cooker","Steel Cooker","Aluminium Cooker",
    "Jumbo Cooker","Mini Cooker","5L Cooker","3L Cooker","Family Pack Cooker",
    "Value Pack Cooker","Induction Base Cooker","Gas Stove Cooker","Designer Cooker","Eco Cooker",
    "Daily Use Cooker","Select Cooker","Quality Cooker","Special Cooker","Traditional Cooker",
    "Super Strong Cooker","Heavy Duty Cooker","Light Weight Cooker","Ultra Cooker"};
    return pressureCookerBrands;
}

if(productName == "fryingPan"){
    String fryingPanBrands[] = {"Prestige Frying Pan","Hawkins Frying Pan","Butterfly Frying Pan","Pigeon Frying Pan","BB Royal Frying Pan",
    "More Choice Frying Pan","Classic Frying Pan","Premium Frying Pan","Non Stick Pan","Steel Pan",
    "Cast Iron Pan","Jumbo Pan","Mini Pan","Large Pan","Small Pan",
    "Family Pack Pan","Value Pack Pan","Induction Base Pan","Gas Stove Pan","Designer Pan",
    "Eco Pan","Daily Use Pan","Select Pan","Quality Pan","Special Pan",
    "Super Strong Pan","Heavy Duty Pan","Light Weight Pan","Ultra Pan"};
    return fryingPanBrands;
}
if(productName == "kadai"){
    String kadaiBrands[] = {"Prestige Kadai","Hawkins Kadai","Butterfly Kadai","Pigeon Kadai","BB Royal Kadai",
    "More Choice Kadai","Classic Kadai","Premium Kadai","Non Stick Kadai","Steel Kadai",
    "Cast Iron Kadai","Jumbo Kadai","Mini Kadai","Large Kadai","Small Kadai",
    "Family Pack Kadai","Value Pack Kadai","Induction Base Kadai","Gas Stove Kadai","Designer Kadai",
    "Eco Kadai","Daily Use Kadai","Select Kadai","Quality Kadai","Special Kadai",
    "Super Strong Kadai","Heavy Duty Kadai","Light Weight Kadai","Ultra Kadai"};
    return kadaiBrands;
}

if(productName == "gasStove"){
    String gasStoveBrands[] = {"Prestige Gas Stove","Butterfly Gas Stove","Pigeon Gas Stove","Sunflame Gas Stove","Glen Gas Stove",
    "BB Royal Gas Stove","More Choice Gas Stove","Classic Gas Stove","Premium Gas Stove","2 Burner Stove",
    "3 Burner Stove","4 Burner Stove","Steel Stove","Glass Top Stove","Auto Ignition Stove",
    "Manual Ignition Stove","Family Pack Stove","Value Pack Stove","Designer Stove","Eco Stove",
    "Daily Use Stove","Select Stove","Quality Stove","Special Stove","Traditional Stove",
    "Super Strong Stove","Heavy Duty Stove","Light Weight Stove","Ultra Stove"};
    return gasStoveBrands;
}

if(productName == "inductionStove"){
    String inductionStoveBrands[] = {"Prestige Induction","Philips Induction","Butterfly Induction","Pigeon Induction","Usha Induction",
    "BB Royal Induction","More Choice Induction","Classic Induction","Premium Induction","Single Plate Induction",
    "Double Plate Induction","Digital Induction","Touch Panel Induction","Steel Induction","Portable Induction",
    "Family Pack Induction","Value Pack Induction","Designer Induction","Eco Induction","Daily Use Induction",
    "Select Induction","Quality Induction","Special Induction","Traditional Induction","Super Strong Induction",
    "Heavy Duty Induction","Light Weight Induction","Ultra Induction","Pro Induction"};
    return inductionStoveBrands;
}

if(productName == "mixerGrinder"){
    String mixerGrinderBrands[] = {"Preethi Mixer","Philips Mixer","Butterfly Mixer","Bajaj Mixer","Prestige Mixer",
    "BB Royal Mixer","More Choice Mixer","Classic Mixer","Premium Mixer","750W Mixer",
    "500W Mixer","3 Jar Mixer","4 Jar Mixer","Steel Jar Mixer","Plastic Jar Mixer",
    "Family Pack Mixer","Value Pack Mixer","Designer Mixer","Eco Mixer","Daily Use Mixer",
    "Select Mixer","Quality Mixer","Special Mixer","Traditional Mixer","Super Strong Mixer",
    "Heavy Duty Mixer","Light Weight Mixer","Ultra Mixer","Pro Mixer"};
    return mixerGrinderBrands;
}

if(productName == "electricKettle"){
    String electricKettleBrands[] = {"Prestige Kettle","Philips Kettle","Butterfly Kettle","Pigeon Kettle","Bajaj Kettle",
    "BB Royal Kettle","More Choice Kettle","Classic Kettle","Premium Kettle","1L Kettle",
    "1.5L Kettle","2L Kettle","Steel Kettle","Plastic Kettle","Auto Cut Kettle",
    "Family Pack Kettle","Value Pack Kettle","Designer Kettle","Eco Kettle","Daily Use Kettle",
    "Select Kettle","Quality Kettle","Special Kettle","Traditional Kettle","Super Strong Kettle",
    "Heavy Duty Kettle","Light Weight Kettle","Ultra Kettle","Pro Kettle"};
    return electricKettleBrands;
}

if(productName == "riceCooker"){
    String riceCookerBrands[] = {"Prestige Rice Cooker","Philips Rice Cooker","Butterfly Rice Cooker","Pigeon Rice Cooker","Panasonic Rice Cooker",
    "BB Royal Rice Cooker","More Choice Rice Cooker","Classic Rice Cooker","Premium Rice Cooker","1L Cooker",
    "2L Cooker","3L Cooker","Steel Cooker","Non Stick Cooker","Electric Cooker",
    "Family Pack Cooker","Value Pack Cooker","Designer Cooker","Eco Cooker","Daily Use Cooker",
    "Select Cooker","Quality Cooker","Special Cooker","Traditional Cooker","Super Strong Cooker",
    "Heavy Duty Cooker","Light Weight Cooker","Ultra Cooker","Pro Cooker"};
    return riceCookerBrands;
}

if(productName == "bedsheet"){
    String bedsheetBrands[] = {"Bombay Dyeing Bedsheet","Spaces Bedsheet","Portico Bedsheet","BB Royal Bedsheet","More Choice Bedsheet",
    "Classic Bedsheet","Premium Bedsheet","Cotton Bedsheet","King Size Bedsheet","Queen Size Bedsheet",
    "Single Bedsheet","Double Bedsheet","Designer Bedsheet","Printed Bedsheet","Plain Bedsheet",
    "Family Pack Bedsheet","Value Pack Bedsheet","Eco Bedsheet","Daily Use Bedsheet","Select Bedsheet",
    "Quality Bedsheet","Special Bedsheet","Traditional Bedsheet","Super Soft Bedsheet","Heavy Duty Bedsheet",
    "Light Weight Bedsheet","Ultra Bedsheet","Pro Bedsheet","Luxury Bedsheet"};
    return bedsheetBrands;
}

if(productName == "pillowCover"){
    String pillowCoverBrands[] = {"Bombay Dyeing Pillow Cover","Spaces Pillow Cover","Portico Pillow Cover","BB Royal Pillow Cover","More Choice Pillow Cover",
    "Classic Pillow Cover","Premium Pillow Cover","Cotton Pillow Cover","King Size Pillow Cover","Queen Size Pillow Cover",
    "Single Pillow Cover","Double Pillow Cover","Designer Pillow Cover","Printed Pillow Cover","Plain Pillow Cover",
    "Family Pack Pillow Cover","Value Pack Pillow Cover","Eco Pillow Cover","Daily Use Pillow Cover","Select Pillow Cover",
    "Quality Pillow Cover","Special Pillow Cover","Traditional Pillow Cover","Super Soft Pillow Cover","Heavy Duty Pillow Cover",
    "Light Weight Pillow Cover","Ultra Pillow Cover","Pro Pillow Cover","Luxury Pillow Cover"};
    return pillowCoverBrands;
}

if(productName == "blanket"){
    String blanketBrands[] = {"Spaces Blanket","Portico Blanket","Bombay Dyeing Blanket","BB Royal Blanket","More Choice Blanket",
    "Classic Blanket","Premium Blanket","Cotton Blanket","Wool Blanket","Single Blanket",
    "Double Blanket","King Size Blanket","Queen Size Blanket","Designer Blanket","Printed Blanket",
    "Family Pack Blanket","Value Pack Blanket","Eco Blanket","Daily Use Blanket","Select Blanket",
    "Quality Blanket","Special Blanket","Traditional Blanket","Super Soft Blanket","Heavy Blanket",
    "Light Weight Blanket","Ultra Blanket","Pro Blanket","Luxury Blanket"};
    return blanketBrands;
}

if(productName == "towel"){
    String towelBrands[] = {"Bombay Dyeing Towel","Spaces Towel","Portico Towel","BB Royal Towel","More Choice Towel",
    "Classic Towel","Premium Towel","Cotton Towel","Bath Towel","Hand Towel",
    "Face Towel","Large Towel","Small Towel","Designer Towel","Printed Towel",
    "Family Pack Towel","Value Pack Towel","Eco Towel","Daily Use Towel","Select Towel",
    "Quality Towel","Special Towel","Traditional Towel","Super Soft Towel","Heavy Duty Towel",
    "Light Weight Towel","Ultra Towel","Pro Towel","Luxury Towel"};
    return towelBrands;
}
if(productName == "napkin"){
    String napkinBrands[] = {"Origami Napkin","Bella Napkin","Premier Napkin","Kleenex Napkin","Soft Touch Napkin",
    "Selpak Napkin","Paseo Napkin","BB Royal Napkin","More Choice Napkin","Classic Napkin",
    "Premium Napkin","Paper Napkin","Cloth Napkin","Family Pack Napkin","Value Pack Napkin",
    "Eco Napkin","Daily Use Napkin","Select Napkin","Quality Napkin","Special Napkin",
    "Designer Napkin","Printed Napkin","White Napkin","Color Napkin","Super Soft Napkin",
    "Heavy Duty Napkin","Light Weight Napkin","Ultra Napkin","Luxury Napkin"};
    return napkinBrands;
}

if(productName == "schoolBag"){
    String schoolBagBrands[] = {"Skybags","American Tourister","Wildcraft","Safari","VIP School Bag",
    "BB Royal Bag","More Choice Bag","Classic Bag","Premium Bag","Kids School Bag",
    "Large School Bag","Small School Bag","Waterproof Bag","Trolley Bag","Designer Bag",
    "Eco Bag","Daily Use Bag","Select Bag","Quality Bag","Special Bag",
    "Printed Bag","Cartoon Bag","Strong Zip Bag","Light Weight Bag","Heavy Duty Bag",
    "Super Strong Bag","Pro School Bag","Ultra Bag","Luxury Bag"};
    return schoolBagBrands;
}

if(productName == "notebook"){
    String notebookBrands[] = {"Classmate Notebook","Navneet Notebook","Camlin Notebook","Paperkraft Notebook","Luxor Notebook",
    "BB Royal Notebook","More Choice Notebook","Classic Notebook","Premium Notebook","Long Notebook",
    "Short Notebook","A4 Notebook","Ruled Notebook","Unruled Notebook","Graph Notebook",
    "Spiral Notebook","Hard Cover Notebook","Soft Cover Notebook","Eco Notebook","Daily Use Notebook",
    "Select Notebook","Quality Notebook","Special Notebook","Designer Notebook","Printed Notebook",
    "Mini Notebook","Jumbo Notebook","Pro Notebook","Ultra Notebook"};
    return notebookBrands;
}

if(productName == "pen"){
    String penBrands[] = {"Reynolds Pen","Cello Pen","Parker Pen","Pilot Pen","Luxor Pen",
    "BB Royal Pen","More Choice Pen","Classic Pen","Premium Pen","Ball Pen",
    "Gel Pen","Ink Pen","Blue Pen","Black Pen","Red Pen",
    "Eco Pen","Daily Use Pen","Select Pen","Quality Pen","Special Pen",
    "Designer Pen","Smooth Pen","Fine Tip Pen","Broad Tip Pen","Jumbo Pack Pen",
    "Mini Pack Pen","Pro Pen","Ultra Pen","Luxury Pen"};
    return penBrands;
}

if(productName == "pencil"){
    String pencilBrands[] = {"Nataraj Pencil","Apsara Pencil","Faber Castell Pencil","Camlin Pencil","Luxor Pencil",
    "BB Royal Pencil","More Choice Pencil","Classic Pencil","Premium Pencil","HB Pencil",
    "2B Pencil","Drawing Pencil","Color Pencil","Graphite Pencil","Eco Pencil",
    "Daily Use Pencil","Select Pencil","Quality Pencil","Special Pencil","Designer Pencil",
    "Mini Pencil","Jumbo Pencil","Pro Pencil","Ultra Pencil","Luxury Pencil",
    "Smooth Pencil","Fine Pencil","Strong Pencil","Standard Pencil"};
    return pencilBrands;
}

if(productName == "eraser"){
    String eraserBrands[] = {"Nataraj Eraser","Apsara Eraser","Faber Castell Eraser","Camlin Eraser","Luxor Eraser",
    "BB Royal Eraser","More Choice Eraser","Classic Eraser","Premium Eraser","Soft Eraser",
    "Hard Eraser","White Eraser","Color Eraser","Eco Eraser","Daily Use Eraser",
    "Select Eraser","Quality Eraser","Special Eraser","Designer Eraser","Mini Eraser",
    "Jumbo Eraser","Pro Eraser","Ultra Eraser","Luxury Eraser","Smooth Eraser",
    "Strong Eraser","Standard Eraser","School Eraser","Office Eraser"};
    return eraserBrands;
}

if(productName == "sharpener"){
    String sharpenerBrands[] = {"Nataraj Sharpener","Apsara Sharpener","Faber Castell Sharpener","Camlin Sharpener","Luxor Sharpener",
    "BB Royal Sharpener","More Choice Sharpener","Classic Sharpener","Premium Sharpener","Metal Sharpener",
    "Plastic Sharpener","Single Hole Sharpener","Double Hole Sharpener","Eco Sharpener","Daily Use Sharpener",
    "Select Sharpener","Quality Sharpener","Special Sharpener","Designer Sharpener","Mini Sharpener",
    "Jumbo Sharpener","Pro Sharpener","Ultra Sharpener","Luxury Sharpener","Smooth Sharpener",
    "Strong Sharpener","Standard Sharpener","School Sharpener","Office Sharpener"};
    return sharpenerBrands;
}

if(productName == "scale"){
    String scaleBrands[] = {"Nataraj Scale","Apsara Scale","Faber Castell Scale","Camlin Scale","Luxor Scale",
    "BB Royal Scale","More Choice Scale","Classic Scale","Premium Scale","Steel Scale",
    "Plastic Scale","Transparent Scale","30cm Scale","15cm Scale","Eco Scale",
    "Daily Use Scale","Select Scale","Quality Scale","Special Scale","Designer Scale",
    "Mini Scale","Jumbo Scale","Pro Scale","Ultra Scale","Luxury Scale",
    "Smooth Scale","Strong Scale","Standard Scale","School Scale"};
    return scaleBrands;
}

if(productName == "glue"){
    String glueBrands[] = {"Fevicol Glue","Fevi Stick","Camlin Glue","Pidilite Glue","Dr Fixit Glue",
    "BB Royal Glue","More Choice Glue","Classic Glue","Premium Glue","Liquid Glue",
    "Stick Glue","White Glue","Strong Glue","Quick Fix Glue","Eco Glue",
    "Daily Use Glue","Select Glue","Quality Glue","Special Glue","Designer Glue",
    "Mini Glue","Jumbo Glue","Pro Glue","Ultra Glue","Luxury Glue",
    "Smooth Glue","Heavy Duty Glue","Standard Glue","School Glue"};
    return glueBrands;
}

if(productName == "sketchPen"){
    String sketchPenBrands[] = {"Camlin Sketch Pen","Faber Castell Sketch Pen","Luxor Sketch Pen","Reynolds Sketch Pen","Cello Sketch Pen",
    "BB Royal Sketch Pen","More Choice Sketch Pen","Classic Sketch Pen","Premium Sketch Pen","Color Sketch Pen",
    "Mini Sketch Pen","Jumbo Sketch Pen","Fine Tip Sketch Pen","Broad Tip Sketch Pen","Eco Sketch Pen",
    "Daily Use Sketch Pen","Select Sketch Pen","Quality Sketch Pen","Special Sketch Pen","Designer Sketch Pen",
    "School Sketch Pen","Office Sketch Pen","Smooth Sketch Pen","Strong Sketch Pen","Ultra Sketch Pen",
    "Pro Sketch Pen","Luxury Sketch Pen","Standard Sketch Pen","Art Sketch Pen"};
    return sketchPenBrands;
}
if(productName == "colorPencils"){
    String colorPencilsBrands[] = {"Faber Castell Color Pencils","Camlin Color Pencils","Apsara Color Pencils","Nataraj Color Pencils","Luxor Color Pencils",
    "BB Royal Color Pencils","More Choice Color Pencils","Classic Color Pencils","Premium Color Pencils","12 Shades Pack",
    "24 Shades Pack","36 Shades Pack","Water Color Pencils","Eco Color Pencils","Mini Pack Pencils",
    "Jumbo Pack Pencils","Fine Tip Pencils","Smooth Color Pencils","School Pack Pencils","Art Pack Pencils",
    "Select Color Pencils","Quality Color Pencils","Special Color Pencils","Designer Color Pencils","Ultra Color Pencils",
    "Pro Color Pencils","Luxury Color Pencils","Standard Color Pencils","Kids Color Pencils"};
    return colorPencilsBrands;
}

if(productName == "babyDiapers"){
    String babyDiapersBrands[] = {"Pampers Diapers","Huggies Diapers","MamyPoko Diapers","Himalaya Diapers","BB Royal Diapers",
    "More Choice Diapers","Classic Diapers","Premium Diapers","Small Size Diapers","Medium Size Diapers",
    "Large Size Diapers","XL Size Diapers","XXL Size Diapers","Eco Diapers","Daily Use Diapers",
    "Select Diapers","Quality Diapers","Special Diapers","Designer Diapers","Extra Soft Diapers",
    "Overnight Diapers","Active Baby Diapers","Dry Pants Diapers","Tape Style Diapers","Pant Style Diapers",
    "Ultra Dry Diapers","Pro Diapers","Luxury Diapers","Newborn Diapers"};
    return babyDiapersBrands;
}

if(productName == "babyWipes"){
    String babyWipesBrands[] = {"Pampers Wipes","Huggies Wipes","MamyPoko Wipes","Himalaya Wipes","BB Royal Wipes",
    "More Choice Wipes","Classic Wipes","Premium Wipes","Aloe Wipes","Sensitive Wipes",
    "Fragrance Free Wipes","Eco Wipes","Daily Use Wipes","Select Wipes","Quality Wipes",
    "Special Wipes","Designer Wipes","Extra Soft Wipes","Overnight Wipes","Active Baby Wipes",
    "Dry Wipes","Wet Wipes","Travel Pack Wipes","Family Pack Wipes","Ultra Soft Wipes",
    "Pro Wipes","Luxury Wipes","Newborn Wipes","Pure Wipes"};
    return babyWipesBrands;
}

if(productName == "babySoap"){
    String babySoapBrands[] = {"Johnson's Baby Soap","Himalaya Baby Soap","Pears Baby Soap","Dove Baby Soap","BB Royal Baby Soap",
    "More Choice Baby Soap","Classic Baby Soap","Premium Baby Soap","Gentle Baby Soap","Extra Soft Baby Soap",
    "Sensitive Baby Soap","Eco Baby Soap","Daily Use Baby Soap","Select Baby Soap","Quality Baby Soap",
    "Special Baby Soap","Designer Baby Soap","Pure Baby Soap","Natural Baby Soap","Herbal Baby Soap",
    "Moisturizing Baby Soap","Cream Baby Soap","Milk Baby Soap","Ultra Soft Baby Soap","Pro Baby Soap",
    "Luxury Baby Soap","Standard Baby Soap","Kids Soap","Newborn Soap"};
    return babySoapBrands;
}

if(productName == "babyShampoo"){
    String babyShampooBrands[] = {"Johnson's Baby Shampoo","Himalaya Baby Shampoo","Mamaearth Baby Shampoo","Chicco Baby Shampoo","BB Royal Baby Shampoo",
    "More Choice Baby Shampoo","Classic Baby Shampoo","Premium Baby Shampoo","Tear Free Shampoo","Extra Mild Shampoo",
    "Sensitive Baby Shampoo","Eco Baby Shampoo","Daily Use Baby Shampoo","Select Baby Shampoo","Quality Baby Shampoo",
    "Special Baby Shampoo","Designer Baby Shampoo","Pure Baby Shampoo","Natural Baby Shampoo","Herbal Baby Shampoo",
    "Moisturizing Baby Shampoo","Milk Baby Shampoo","Ultra Soft Baby Shampoo","Pro Baby Shampoo","Luxury Baby Shampoo",
    "Standard Baby Shampoo","Kids Shampoo","Newborn Shampoo","Gentle Care Shampoo"};
    return babyShampooBrands;
}

if(productName == "sanitaryPads"){
    String sanitaryPadsBrands[] = {"Whisper Pads","Stayfree Pads","Sofy Pads","Bella Pads","BB Royal Pads",
    "More Choice Pads","Classic Pads","Premium Pads","XL Pads","XXL Pads",
    "Ultra Thin Pads","Cottony Soft Pads","Eco Pads","Daily Use Pads","Select Pads",
    "Quality Pads","Special Pads","Designer Pads","Extra Long Pads","Overnight Pads",
    "Max Coverage Pads","Pro Pads","Luxury Pads","Standard Pads","Wings Pads",
    "No Wings Pads","Dry Net Pads","Soft Care Pads","Ultra Protection Pads"};
    return sanitaryPadsBrands;
}

if(productName == "adultDiapers"){
    String adultDiapersBrands[] = {"Friends Diapers","Depend Diapers","Dignity Diapers","BB Royal Adult Diapers","More Choice Adult Diapers",
    "Classic Adult Diapers","Premium Adult Diapers","Large Adult Diapers","XL Adult Diapers","XXL Adult Diapers",
    "Pant Style Adult Diapers","Tape Style Adult Diapers","Overnight Adult Diapers","Eco Adult Diapers","Daily Use Adult Diapers",
    "Select Adult Diapers","Quality Adult Diapers","Special Adult Diapers","Designer Adult Diapers","Extra Soft Adult Diapers",
    "Ultra Dry Adult Diapers","Pro Adult Diapers","Luxury Adult Diapers","Standard Adult Diapers","High Absorb Adult Diapers",
    "Comfort Adult Diapers","Active Adult Diapers","Secure Adult Diapers","Plus Size Adult Diapers"};
    return adultDiapersBrands;
}

if(productName == "proteinPowder"){
    String proteinPowderBrands[] = {"Protinex Powder","Ensure Powder","Pediasure Powder","Horlicks Protein+","BB Royal Protein",
    "More Choice Protein","Classic Protein","Premium Protein","Whey Protein","Soy Protein",
    "Plant Protein","Chocolate Protein","Vanilla Protein","Strawberry Protein","Mass Gainer Protein",
    "Weight Gain Protein","Weight Loss Protein","Gym Protein","Eco Protein","Daily Use Protein",
    "Select Protein","Quality Protein","Special Protein","Designer Protein","Ultra Protein",
    "Pro Protein","Luxury Protein","Standard Protein","Healthy Protein"};
    return proteinPowderBrands;
}

if(productName == "attaNoodles"){
    String attaNoodlesBrands[] = {"Maggi Atta Noodles","Yippee Atta Noodles","Top Ramen Atta","Ching's Atta Noodles","BB Royal Atta Noodles",
    "More Choice Atta Noodles","Classic Atta Noodles","Premium Atta Noodles","Masala Atta Noodles","Spicy Atta Noodles",
    "Veg Atta Noodles","Chicken Atta Noodles","Eco Atta Noodles","Daily Use Atta Noodles","Select Atta Noodles",
    "Quality Atta Noodles","Special Atta Noodles","Designer Atta Noodles","Family Pack Atta Noodles","Value Pack Atta Noodles",
    "Mini Pack Atta Noodles","Jumbo Pack Atta Noodles","Healthy Atta Noodles","Traditional Atta Noodles","Restaurant Style Atta Noodles",
    "Quick Cook Atta Noodles","Pro Atta Noodles","Ultra Atta Noodles","Standard Atta Noodles"};
    return attaNoodlesBrands;
}

if(productName == "sooji"){
    String soojiBrands[] = {"Aashirvaad Sooji","Pillsbury Sooji","Fortune Sooji","24 Mantra Sooji","Organic Tattva Sooji",
    "BB Royal Sooji","More Choice Sooji","Classic Sooji","Premium Sooji","Bombay Sooji",
    "Fine Sooji","Fresh Harvest Sooji","Golden Grain Sooji","Daily Choice Sooji","Shakti Bhog Sooji",
    "Rajdhani Sooji","Annapurna Sooji","Reliable Sooji","Grihasthi Sooji","Vikram Sooji",
    "Samrat Sooji","Healthy Life Sooji","Pure Sooji","Quality Sooji","Special Sooji",
    "Ultra Fine Sooji","Select Sooji","Traditional Sooji","Standard Sooji"};
    return soojiBrands;
}
if(productName == "dalToor"){
    String dalToorBrands[] = {"Tata Sampann Toor Dal","Aashirvaad Toor Dal","24 Mantra Toor Dal","Organic Tattva Toor Dal","BB Royal Toor Dal",
    "More Choice Toor Dal","Classic Toor Dal","Premium Toor Dal","Unpolished Toor Dal","Polished Toor Dal",
    "Desi Toor Dal","Organic Toor Dal","Family Pack Toor Dal","Value Pack Toor Dal","Daily Use Toor Dal",
    "Select Toor Dal","Quality Toor Dal","Special Toor Dal","Golden Toor Dal","Fresh Harvest Toor Dal",
    "Healthy Toor Dal","Traditional Toor Dal","Standard Toor Dal","Pro Toor Dal","Ultra Toor Dal",
    "Farm Fresh Toor Dal","Pure Toor Dal","Fine Toor Dal","Jumbo Pack Toor Dal"};
    return dalToorBrands;
}

if(productName == "dalMoong"){
    String dalMoongBrands[] = {"Tata Sampann Moong Dal","Aashirvaad Moong Dal","24 Mantra Moong Dal","Organic Tattva Moong Dal","BB Royal Moong Dal",
    "More Choice Moong Dal","Classic Moong Dal","Premium Moong Dal","Unpolished Moong Dal","Polished Moong Dal",
    "Desi Moong Dal","Organic Moong Dal","Family Pack Moong Dal","Value Pack Moong Dal","Daily Use Moong Dal",
    "Select Moong Dal","Quality Moong Dal","Special Moong Dal","Golden Moong Dal","Fresh Harvest Moong Dal",
    "Healthy Moong Dal","Traditional Moong Dal","Standard Moong Dal","Pro Moong Dal","Ultra Moong Dal",
    "Farm Fresh Moong Dal","Pure Moong Dal","Fine Moong Dal","Jumbo Pack Moong Dal"};
    return dalMoongBrands;
}

if(productName == "dalChana"){
    String dalChanaBrands[] = {"Tata Sampann Chana Dal","Aashirvaad Chana Dal","24 Mantra Chana Dal","Organic Tattva Chana Dal","BB Royal Chana Dal",
    "More Choice Chana Dal","Classic Chana Dal","Premium Chana Dal","Unpolished Chana Dal","Polished Chana Dal",
    "Desi Chana Dal","Organic Chana Dal","Family Pack Chana Dal","Value Pack Chana Dal","Daily Use Chana Dal",
    "Select Chana Dal","Quality Chana Dal","Special Chana Dal","Golden Chana Dal","Fresh Harvest Chana Dal",
    "Healthy Chana Dal","Traditional Chana Dal","Standard Chana Dal","Pro Chana Dal","Ultra Chana Dal",
    "Farm Fresh Chana Dal","Pure Chana Dal","Fine Chana Dal","Jumbo Pack Chana Dal"};
    return dalChanaBrands;
}

if(productName == "rajma"){
    String rajmaBrands[] = {"Tata Sampann Rajma","Aashirvaad Rajma","24 Mantra Rajma","Organic Tattva Rajma","BB Royal Rajma",
    "More Choice Rajma","Classic Rajma","Premium Rajma","Red Rajma","Kashmiri Rajma",
    "Desi Rajma","Organic Rajma","Family Pack Rajma","Value Pack Rajma","Daily Use Rajma",
    "Select Rajma","Quality Rajma","Special Rajma","Fresh Harvest Rajma","Healthy Rajma",
    "Traditional Rajma","Standard Rajma","Pro Rajma","Ultra Rajma","Farm Fresh Rajma",
    "Pure Rajma","Fine Rajma","Jumbo Pack Rajma","Small Rajma"};
    return rajmaBrands;
}

if(productName == "chole"){
    String choleBrands[] = {"Tata Sampann Chole","Aashirvaad Chole","24 Mantra Chole","Organic Tattva Chole","BB Royal Chole",
    "More Choice Chole","Classic Chole","Premium Chole","Kabuli Chole","Desi Chole",
    "Organic Chole","Family Pack Chole","Value Pack Chole","Daily Use Chole","Select Chole",
    "Quality Chole","Special Chole","Fresh Harvest Chole","Healthy Chole","Traditional Chole",
    "Standard Chole","Pro Chole","Ultra Chole","Farm Fresh Chole","Pure Chole",
    "Fine Chole","Jumbo Pack Chole","Small Chole","Large Chole"};
    return choleBrands;
}

if(productName == "sabudana"){
    String sabudanaBrands[] = {"Tata Sampann Sabudana","Aashirvaad Sabudana","24 Mantra Sabudana","Organic Tattva Sabudana","BB Royal Sabudana",
    "More Choice Sabudana","Classic Sabudana","Premium Sabudana","Medium Sabudana","Large Sabudana",
    "Desi Sabudana","Organic Sabudana","Family Pack Sabudana","Value Pack Sabudana","Daily Use Sabudana",
    "Select Sabudana","Quality Sabudana","Special Sabudana","Fresh Harvest Sabudana","Healthy Sabudana",
    "Traditional Sabudana","Standard Sabudana","Pro Sabudana","Ultra Sabudana","Farm Fresh Sabudana",
    "Pure Sabudana","Fine Sabudana","Jumbo Pack Sabudana","Small Sabudana"};
    return sabudanaBrands;
}

if(productName == "phenyl"){
    String phenylBrands[] = {"Lizol Phenyl","Domex Phenyl","Harpic Phenyl","BB Royal Phenyl","More Choice Phenyl",
    "Classic Phenyl","Premium Phenyl","White Phenyl","Black Phenyl","Herbal Phenyl",
    "Neem Phenyl","Lemon Phenyl","Lavender Phenyl","Rose Phenyl","Jasmine Phenyl",
    "Family Pack Phenyl","Value Pack Phenyl","Daily Use Phenyl","Select Phenyl","Quality Phenyl",
    "Special Phenyl","Strong Phenyl","Extra Power Phenyl","Disinfectant Phenyl","Fresh Fragrance Phenyl",
    "Pro Phenyl","Ultra Phenyl","Standard Phenyl","Eco Phenyl"};
    return phenylBrands;
}

if(productName == "roomFreshener"){
    String roomFreshenerBrands[] = {"Odonil Freshener","Ambi Pur Freshener","Godrej Aer","Air Wick Freshener","BB Royal Freshener",
    "More Choice Freshener","Classic Freshener","Premium Freshener","Lavender Freshener","Rose Freshener",
    "Jasmine Freshener","Citrus Freshener","Ocean Freshener","Floral Freshener","Mogra Freshener",
    "Family Pack Freshener","Value Pack Freshener","Daily Use Freshener","Select Freshener","Quality Freshener",
    "Special Freshener","Long Lasting Freshener","Automatic Freshener","Spray Freshener","Gel Freshener",
    "Pro Freshener","Ultra Freshener","Standard Freshener","Eco Freshener"};
    return roomFreshenerBrands;
}

if(productName == "glassCleaner"){
    String glassCleanerBrands[] = {"Colin Glass Cleaner","Lizol Glass Cleaner","Harpic Glass Cleaner","BB Royal Glass Cleaner","More Choice Glass Cleaner",
    "Classic Glass Cleaner","Premium Glass Cleaner","Spray Glass Cleaner","Liquid Glass Cleaner","Foam Glass Cleaner",
    "Family Pack Glass Cleaner","Value Pack Glass Cleaner","Daily Use Glass Cleaner","Select Glass Cleaner","Quality Glass Cleaner",
    "Special Glass Cleaner","Strong Glass Cleaner","Streak Free Cleaner","Fresh Fragrance Cleaner","Multipurpose Cleaner",
    "Pro Glass Cleaner","Ultra Glass Cleaner","Standard Glass Cleaner","Eco Glass Cleaner","Professional Cleaner",
    "Home Glass Cleaner","Advanced Cleaner","Crystal Clear Cleaner","Power Glass Cleaner"};
    return glassCleanerBrands;
}

if(productName == "toiletCleaner"){
    String toiletCleanerBrands[] = {"Harpic Toilet Cleaner","Domex Toilet Cleaner","Lizol Toilet Cleaner","BB Royal Toilet Cleaner","More Choice Toilet Cleaner",
    "Classic Toilet Cleaner","Premium Toilet Cleaner","Liquid Toilet Cleaner","Gel Toilet Cleaner","Herbal Toilet Cleaner",
    "Lemon Toilet Cleaner","Lavender Toilet Cleaner","Strong Toilet Cleaner","Extra Power Cleaner","Disinfectant Cleaner",
    "Family Pack Cleaner","Value Pack Cleaner","Daily Use Cleaner","Select Cleaner","Quality Cleaner",
    "Special Cleaner","Pro Cleaner","Ultra Cleaner","Standard Cleaner","Eco Cleaner",
    "Professional Cleaner","Home Cleaner","Fresh Fragrance Cleaner","Advanced Toilet Cleaner"};
    return toiletCleanerBrands;
}
if(productName == "bodyLotion"){
    String bodyLotionBrands[] = {"Nivea Lotion","Vaseline Lotion","Pond's Lotion","Parachute Lotion","Himalaya Lotion",
    "BB Royal Lotion","More Choice Lotion","Classic Lotion","Premium Lotion","Aloe Lotion",
    "Cocoa Lotion","Shea Butter Lotion","Milk Lotion","Daily Use Lotion","Select Lotion",
    "Quality Lotion","Special Lotion","Designer Lotion","Extra Moisture Lotion","Dry Skin Lotion",
    "Winter Lotion","Summer Lotion","Pro Lotion","Ultra Lotion","Luxury Lotion",
    "Family Pack Lotion","Value Pack Lotion","Natural Lotion","Soft Care Lotion"};
    return bodyLotionBrands;
}

if(productName == "talcumPowder"){
    String talcumPowderBrands[] = {"Pond's Powder","Nycil Powder","Dermicool Powder","Cinthol Powder","Yardley Powder",
    "BB Royal Powder","More Choice Powder","Classic Powder","Premium Powder","Rose Powder",
    "Lavender Powder","Jasmine Powder","Cooling Powder","Daily Use Powder","Select Powder",
    "Quality Powder","Special Powder","Designer Powder","Extra Fresh Powder","Herbal Powder",
    "Pro Powder","Ultra Powder","Luxury Powder","Family Pack Powder","Value Pack Powder",
    "Natural Powder","Soft Powder","Strong Fragrance Powder","Standard Powder"};
    return talcumPowderBrands;
}

if(productName == "shavingCream"){
    String shavingCreamBrands[] = {"Gillette Cream","Old Spice Cream","Park Avenue Cream","Dettol Cream","Vi-John Cream",
    "BB Royal Cream","More Choice Cream","Classic Cream","Premium Cream","Foam Cream",
    "Gel Cream","Herbal Cream","Daily Use Cream","Select Cream","Quality Cream",
    "Special Cream","Designer Cream","Extra Smooth Cream","Sensitive Skin Cream","Cool Menthol Cream",
    "Pro Cream","Ultra Cream","Luxury Cream","Family Pack Cream","Value Pack Cream",
    "Natural Cream","Strong Hold Cream","Standard Cream","Fresh Cream"};
    return shavingCreamBrands;
}

if(productName == "razor"){
    String razorBrands[] = {"Gillette Razor","Supermax Razor","Laser Razor","Vi-John Razor","Bombay Shaving Razor",
    "BB Royal Razor","More Choice Razor","Classic Razor","Premium Razor","Disposable Razor",
    "Twin Blade Razor","Triple Blade Razor","Steel Razor","Daily Use Razor","Select Razor",
    "Quality Razor","Special Razor","Designer Razor","Extra Sharp Razor","Sensitive Razor",
    "Pro Razor","Ultra Razor","Luxury Razor","Family Pack Razor","Value Pack Razor",
    "Comfort Razor","Smooth Razor","Standard Razor","Advanced Razor"};
    return razorBrands;
}

if(productName == "deodorantSpray"){
    String deodorantSprayBrands[] = {"Axe Spray","Fogg Spray","Wild Stone Spray","Engage Spray","Nivea Spray",
    "BB Royal Spray","More Choice Spray","Classic Spray","Premium Spray","Body Spray",
    "Long Lasting Spray","Fresh Spray","Daily Use Spray","Select Spray","Quality Spray",
    "Special Spray","Designer Spray","Extra Strong Spray","Cool Spray","Herbal Spray",
    "Pro Spray","Ultra Spray","Luxury Spray","Family Pack Spray","Value Pack Spray",
    "Natural Spray","Strong Spray","Standard Spray","Advanced Spray"};
    return deodorantSprayBrands;
}

if(productName == "perfume"){
    String perfumeBrands[] = {"Engage Perfume","Bella Vita Perfume","Ajmal Perfume","Denver Perfume","Park Avenue Perfume",
    "BB Royal Perfume","More Choice Perfume","Classic Perfume","Premium Perfume","Floral Perfume",
    "Woody Perfume","Fresh Perfume","Daily Use Perfume","Select Perfume","Quality Perfume",
    "Special Perfume","Designer Perfume","Long Lasting Perfume","Cool Perfume","Luxury Perfume",
    "Pro Perfume","Ultra Perfume","Family Pack Perfume","Value Pack Perfume","Natural Perfume",
    "Strong Perfume","Standard Perfume","Advanced Perfume","Exclusive Perfume"};
    return perfumeBrands;
}

if(productName == "hairGel"){
    String hairGelBrands[] = {"Set Wet Gel","Gatsby Gel","Park Avenue Gel","Beardo Gel","Livon Gel",
    "BB Royal Gel","More Choice Gel","Classic Gel","Premium Gel","Strong Hold Gel",
    "Wet Look Gel","Daily Use Gel","Select Gel","Quality Gel","Special Gel",
    "Designer Gel","Extra Strong Gel","Cool Gel","Herbal Gel","Pro Gel",
    "Ultra Gel","Luxury Gel","Family Pack Gel","Value Pack Gel","Natural Gel",
    "Smooth Gel","Standard Gel","Advanced Gel","Fresh Gel"};
    return hairGelBrands;
}

if(productName == "coconutOil"){
    String coconutOilBrands[] = {"Parachute Oil","Dabur Oil","Indulekha Oil","Himalaya Oil","Patanjali Oil",
    "BB Royal Oil","More Choice Oil","Classic Oil","Premium Oil","Virgin Coconut Oil",
    "Cold Pressed Oil","Daily Use Oil","Select Oil","Quality Oil","Special Oil",
    "Designer Oil","Extra Pure Oil","Herbal Oil","Pro Oil","Ultra Oil",
    "Luxury Oil","Family Pack Oil","Value Pack Oil","Natural Oil","Strong Oil",
    "Standard Oil","Advanced Oil","Fresh Oil","Pure Oil"};
    return coconutOilBrands;
}

if(productName == "mustardOil"){
    String mustardOilBrands[] = {"Fortune Mustard Oil","Dhara Mustard Oil","Engine Mustard Oil","Emami Mustard Oil","Patanjali Mustard Oil",
    "BB Royal Mustard Oil","More Choice Mustard Oil","Classic Mustard Oil","Premium Mustard Oil","Kachi Ghani Oil",
    "Cold Pressed Oil","Daily Use Oil","Select Oil","Quality Oil","Special Oil",
    "Designer Oil","Extra Pure Oil","Herbal Oil","Pro Oil","Ultra Oil",
    "Luxury Oil","Family Pack Oil","Value Pack Oil","Natural Oil","Strong Oil",
    "Standard Oil","Advanced Oil","Fresh Oil","Pure Mustard Oil"};
    return mustardOilBrands;
}

if(productName == "oliveOil"){
    String oliveOilBrands[] = {"Borges Olive Oil","Figaro Olive Oil","Del Monte Olive Oil","Leonardo Olive Oil","Colavita Olive Oil",
    "BB Royal Olive Oil","More Choice Olive Oil","Classic Olive Oil","Premium Olive Oil","Extra Virgin Oil",
    "Cold Pressed Olive Oil","Daily Use Olive Oil","Select Olive Oil","Quality Olive Oil","Special Olive Oil",
    "Designer Olive Oil","Extra Pure Olive Oil","Herbal Olive Oil","Pro Olive Oil","Ultra Olive Oil",
    "Luxury Olive Oil","Family Pack Olive Oil","Value Pack Olive Oil","Natural Olive Oil","Strong Olive Oil",
    "Standard Olive Oil","Advanced Olive Oil","Fresh Olive Oil","Pure Olive Oil"};
    return oliveOilBrands;
}

if(productName == "sonaMasooriRice"){
    String sonaMasooriRiceBrands[] = {"India Gate Rice","Daawat Rice","Fortune Rice","Kohinoor Rice","BB Royal Rice",
    "More Choice Rice","Classic Rice","Premium Rice","Organic Rice","Daily Use Rice",
    "Select Rice","Quality Rice","Special Rice","Golden Rice","Fresh Harvest Rice",
    "Healthy Rice","Traditional Rice","Standard Rice","Pro Rice","Ultra Rice",
    "Family Pack Rice","Value Pack Rice","Natural Rice","Desi Rice","Pure Rice",
    "Fine Rice","Jumbo Pack Rice","Small Grain Rice","Farm Rice"};
    return sonaMasooriRiceBrands;
}

if(productName == "basmatiRice"){
    String basmatiRiceBrands[] = {"India Gate Basmati","Daawat Basmati","Fortune Basmati","Kohinoor Basmati","BB Royal Basmati",
    "More Choice Basmati","Classic Basmati","Premium Basmati","Organic Basmati","Daily Use Basmati",
    "Select Basmati","Quality Basmati","Special Basmati","Golden Basmati","Fresh Harvest Basmati",
    "Healthy Basmati","Traditional Basmati","Standard Basmati","Pro Basmati","Ultra Basmati",
    "Family Pack Basmati","Value Pack Basmati","Natural Basmati","Desi Basmati","Pure Basmati",
    "Fine Basmati","Jumbo Pack Basmati","Long Grain Basmati","Farm Basmati"};
    return basmatiRiceBrands;
}
if(productName == "softDrink"){
	String softDrinkBrand[] = {"Coca Cola", "Pepsi", "Sprite", "Fanta", "Thumbs Up",
    "Mountain Dew","7Up","Mirinda","Limca","Maaza",
    "Slice","Appy Fizz","Paper Boat","Real Fruit","Tropicana",
    "BB Royal Soft Drink","More Choice Soft Drink","Classic Soft Drink","Premium Soft Drink","Cola Drink",
    "Orange Drink","Lemon Drink","Energy Cola","Strong Cola","Zero Sugar Cola",
    "Family Pack Soft Drink","Value Pack Soft Drink","Mini Bottle Drink","Jumbo Bottle Drink"};
return softDrinkBrand;
}
if(productName == "chips"){
	String chipsBrands[]={"lays Classic","Lays Magic Masala","Lays American style","Bingo Mad Angles",
	"Bingo","Kurkure masala munch","Kurkure Green Chutney","Balaji Wafers","Haldiram Chjips","pringles original",
	"Pringles sour Cream","too yumm Chips","Uncle Chips","Nachoo Cheese","Doritos Cheese Chilli","BB Royal Chips",
	"More ChoiceChips","classuc salted chips","premium potato chips","banana chips","Tortilla Chips","crfeam and onion chips","Tomato Chips",
	"family pack chips","value pack chips","mini value pack chips","Jumbo pack chips"};
	
return chipsBrands;
}
if(productName == "nachos"){
String nachosBrand[] = {"Doritos nacho cheese","doriates sweet chilli","cornitos nacho crips","cornitos cheese",
"cornitos peri peri","Too Yumm Nachos","Haldiram nachos","bingo nachos",
"pringles nacho","bingo nacho","balaji nachos","tortilla nacho","Mexican Style Nacho","cheese nacho",
"spicy nacho","salted nachos","BB Royal Nachos","More Choice Nachos","Classic Nachos","Premium Nachos","Restaurant Style Nachos",
"Family Pack Nachos","Value Pack Nachos","Mini Pack Nachos","Jumbo Pack Nachos","Crunchy Nachos",
"Hot & Spicy Nachos","Tangy Nachos","Corn Nachos","Loaded Nachos"};

return nachosBrand;
}
if(productName == "popcorn"){
String popcornBrands[] = {
        "ACT II Butter Popcorn","ACT II Golden Sizzle","ACT II Chilli Surprise","Popz Microwave Popcorn","4700BC Gourmet Popcorn",
        "Too Yumm Popcorn","Haldiram's Popcorn","PVR Popcorn","Cornitos Popcorn","BB Royal Popcorn",
        "More Choice Popcorn","Classic Salted Popcorn","Premium Butter Popcorn","Cheese Popcorn","Caramel Popcorn",
        "Sweet & Salty Popcorn","Spicy Popcorn","Jumbo Pack Popcorn","Mini Pack Popcorn","Family Pack Popcorn",
        "Ready To Eat Popcorn","Microwave Popcorn","Cinema Style Popcorn","Natural Popcorn","Organic Popcorn",
        "Masala Popcorn","Tangy Tomato Popcorn","Peri Peri Popcorn","Extra Crunch Popcorn" };
   
return popcornBrands;
}
if(productName == "bhujia"){
    String bhujiaBrands[] = {
        "Haldiram's Bhujia","Bikaji Bhujia","Balaji Bhujia","Bikanervala Bhujia","Garden Bhujia",
        "Too Yumm Bhujia","BB Royal Bhujia","More Choice Bhujia","Classic Bhujia","Premium Bhujia",
        "Aloo Bhujia","Navratan Bhujia","Spicy Bhujia","Masala Bhujia","Plain Bhujia",
        "Family Pack Bhujia","Value Pack Bhujia","Mini Pack Bhujia","Jumbo Pack Bhujia","Desi Bhujia",
        "Ratlami Bhujia","Extra Spicy Bhujia","Crunchy Bhujia","Traditional Bhujia","Healthy Bhujia",
        "Fine Sev Bhujia","Golden Bhujia","Special Bhujia","Fresh Bhujia"};
    
    return bhujiaBrands;
}
if(productName == "mixture"){
    String mixtureBrands[] = {
        "Haldiram's Khakhra","Bikaji Khakhra","Balaji Khakhra","Jain Khakhra","Induben Khakhra",
        "Too Yumm Khakhra","BB Royal Khakhra","More Choice Khakhra","Classic Khakhra","Premium Khakhra",
        "Masala Khakhra","Jeera Khakhra","Methi Khakhra","Plain Khakhra","Spicy Khakhra",
        "Family Pack Khakhra","Value Pack Khakhra","Mini Pack Khakhra","Jumbo Pack Khakhra","Desi Khakhra",
        "Whole Wheat Khakhra","Multigrain Khakhra","Garlic Khakhra","Healthy Khakhra","Traditional Khakhra",
	"Crunchy Khakhra","Special Khakhra","Fresh Khakhra","Low Fat Khakhra"};
    
    return mixtureBrands;
}
if(productName == "murukku"){
    String murukkuBrands[] = {
        "MTR Murukku","Haldiram's Murukku","Bikaji Murukku","Aachi Murukku","Grand Sweets Murukku",
        "BB Royal Murukku","More Choice Murukku","Classic Murukku","Premium Murukku","Butter Murukku",
        "Spicy Murukku","Garlic Murukku","Jeera Murukku","Plain Murukku","South Indian Murukku",
        "Family Pack Murukku","Value Pack Murukku","Mini Pack Murukku","Jumbo Pack Murukku","Desi Murukku",
        "Traditional Murukku","Crunchy Murukku","Healthy Murukku","Special Murukku","Fresh Murukku",
        "Rice Murukku","Handmade Murukku","Extra Spicy Murukku","Festival Special Murukku" };
    
    return murukkuBrands;
}
if(productName == "sev"){
    String sevBrands[] = {
        "Haldiram's Sev","Bikaji Sev","Balaji Sev","Bikanervala Sev","Garden Sev",
        "BB Royal Sev","More Choice Sev","Classic Sev","Premium Sev","Nylon Sev",
        "Ratlam Sev","Masala Sev","Plain Sev","Spicy Sev","Garlic Sev",
        "Family Pack Sev","Value Pack Sev","Mini Pack Sev","Jumbo Pack Sev","Desi Sev",
        "Traditional Sev","Crunchy Sev","Healthy Sev","Special Sev","Fresh Sev",
        "Fine Sev","Thick Sev","Extra Spicy Sev","Festival Special Sev"};
    
    return sevBrands;
}
if(productName == "chikki"){
    String chikkiBrands[] = {"Lonavala Chikki","Haldiram's Chikki","Bikaji Chikki","BB Royal Chikki","More Choice Chikki",
    "Peanut Chikki","Til Chikki","Dry Fruit Chikki","Coconut Chikki","Classic Chikki",
    "Premium Chikki","Jaggery Chikki","Mini Pack Chikki","Family Pack Chikki","Value Pack Chikki",
    "Crunchy Chikki","Desi Chikki","Special Chikki","Fresh Chikki","Festival Chikki",
    "Healthy Chikki","Organic Chikki","Traditional Chikki","Golden Chikki","Sweet Chikki",
    "Extra Nut Chikki","Kids Chikki","Energy Chikki","Pure Chikki"};
    return chikkiBrands;
}

if(productName == "granolaBar"){
    String granolaBarBrands[] = {"Kellogg's Bar","Yoga Bar","RiteBite Bar","BB Royal Bar","More Choice Bar",
    "Oats Bar","Chocolate Bar","Peanut Bar","Almond Bar","Protein Bar",
    "Energy Bar","Fruit & Nut Bar","Honey Bar","Diet Bar","Kids Bar",
    "Classic Bar","Premium Bar","Healthy Bar","Mini Bar","Family Pack Bar",
    "Value Pack Bar","Crunchy Bar","Special Bar","Natural Bar","Pure Bar",
    "Fitness Bar","Snack Bar","Morning Bar","Evening Bar"};
    return granolaBarBrands;
}

if(productName == "besan"){
    String besanBrands[] = {"Aashirvaad Besan","24 Mantra Besan","Organic Tattva Besan","BB Royal Besan","More Choice Besan",
    "Classic Besan","Premium Besan","Fine Besan","Super Fine Besan","Fresh Harvest Besan",
    "Shakti Bhog Besan","Rajdhani Besan","Annapurna Besan","Reliable Besan","Grihasthi Besan",
    "Vikram Besan","Samrat Besan","Healthy Besan","Pure Besan","Quality Besan",
    "Family Pack Besan","Value Pack Besan","Daily Use Besan","Golden Besan","Traditional Besan",
    "Special Besan","Select Besan","Farm Besan","Desi Besan"};
    return besanBrands;
}

if(productName == "cornFlour"){
    String cornFlourBrands[] = {"Weikfield Corn Flour","Brown & Polson Corn Flour","BB Royal Corn Flour","More Choice Corn Flour","Classic Corn Flour",
    "Premium Corn Flour","Fine Corn Flour","Super Fine Corn Flour","Fresh Corn Flour","Golden Corn Flour",
    "Organic Corn Flour","24 Mantra Corn Flour","Daily Use Corn Flour","Family Pack Corn Flour","Value Pack Corn Flour",
    "Pure Corn Flour","Quality Corn Flour","Special Corn Flour","Select Corn Flour","Healthy Corn Flour",
    "White Corn Flour","Cooking Corn Flour","Baking Corn Flour","Traditional Corn Flour","Desi Corn Flour",
    "Farm Corn Flour","Mini Pack Corn Flour","Jumbo Pack Corn Flour","Standard Corn Flour"};
    return cornFlourBrands;
}

if(productName == "bakingPowder"){
    String bakingPowderBrands[] = {"Weikfield Baking Powder","Keya Baking Powder","BB Royal Baking Powder","More Choice Baking Powder","Classic Baking Powder",
    "Premium Baking Powder","Double Action Baking Powder","Pure Baking Powder","Fine Baking Powder","Fresh Baking Powder",
    "24 Mantra Baking Powder","Daily Use Baking Powder","Family Pack Baking Powder","Value Pack Baking Powder","Healthy Baking Powder",
    "Quality Baking Powder","Special Baking Powder","Select Baking Powder","Standard Baking Powder","Baker's Baking Powder",
    "Professional Baking Powder","Home Baking Powder","Mini Pack Baking Powder","Jumbo Pack Baking Powder","Golden Baking Powder",
    "White Baking Powder","Cooking Baking Powder","Dessert Baking Powder","Traditional Baking Powder"};
    return bakingPowderBrands;
}

if(productName == "bakingSoda"){
    String bakingSodaBrands[] = {"Tata Baking Soda","Keya Baking Soda","BB Royal Baking Soda","More Choice Baking Soda","Classic Baking Soda",
    "Premium Baking Soda","Pure Baking Soda","Fine Baking Soda","Fresh Baking Soda","Organic Baking Soda",
    "Daily Use Baking Soda","Family Pack Baking Soda","Value Pack Baking Soda","Healthy Baking Soda","Quality Baking Soda",
    "Special Baking Soda","Select Baking Soda","Standard Baking Soda","Home Baking Soda","Cooking Baking Soda",
    "Professional Baking Soda","Mini Pack Baking Soda","Jumbo Pack Baking Soda","Golden Baking Soda","White Baking Soda",
    "Traditional Baking Soda","Desi Baking Soda","Farm Baking Soda","Ultra Baking Soda"};
    return bakingSodaBrands;
}

if(productName == "custardPowder"){
    String custardPowderBrands[] = {"Weikfield Custard","Brown & Polson Custard","BB Royal Custard","More Choice Custard","Classic Custard",
    "Premium Custard","Vanilla Custard","Strawberry Custard","Mango Custard","Chocolate Custard",
    "Pineapple Custard","Mixed Fruit Custard","Daily Use Custard","Family Pack Custard","Value Pack Custard",
    "Healthy Custard","Quality Custard","Special Custard","Select Custard","Golden Custard",
    "Fine Custard","Pure Custard","Traditional Custard","Mini Pack Custard","Jumbo Pack Custard",
    "Dessert Custard","Sweet Custard","Instant Custard","Standard Custard"};
    return custardPowderBrands;
}

if(productName == "yeast"){
    String yeastBrands[] = {"Weikfield Yeast","Keya Yeast","BB Royal Yeast","More Choice Yeast","Classic Yeast",
    "Premium Yeast","Instant Yeast","Dry Yeast","Active Yeast","Baker's Yeast",
    "Daily Use Yeast","Family Pack Yeast","Value Pack Yeast","Healthy Yeast","Quality Yeast",
    "Special Yeast","Select Yeast","Standard Yeast","Home Baking Yeast","Professional Yeast",
    "Mini Pack Yeast","Jumbo Pack Yeast","Pure Yeast","Fine Yeast","Traditional Yeast",
    "Golden Yeast","Fresh Yeast","Ultra Yeast","Pro Yeast"};
    return yeastBrands;
}

if(productName == "soyaChunks"){
    String soyaChunksBrands[] = {"Nutrela Soya","BB Royal Soya","More Choice Soya","Classic Soya","Premium Soya",
    "Mini Soya Chunks","Jumbo Soya Chunks","Protein Rich Soya","Healthy Soya","Pure Soya",
    "Organic Soya","24 Mantra Soya","Daily Use Soya","Family Pack Soya","Value Pack Soya",
    "Select Soya","Quality Soya","Special Soya","Desi Soya","Golden Soya",
    "Fresh Harvest Soya","Traditional Soya","Standard Soya","Pro Soya","Ultra Soya",
    "Fine Soya","Farm Soya","High Protein Soya","Natural Soya"};
    return soyaChunksBrands;
}

if(productName == "chana"){
    String chanaBrands[] = {"Tata Sampann Chana","Aashirvaad Chana","24 Mantra Chana","Organic Tattva Chana","BB Royal Chana",
    "More Choice Chana","Classic Chana","Premium Chana","Kabuli Chana","Desi Chana",
    "Family Pack Chana","Value Pack Chana","Daily Use Chana","Select Chana","Quality Chana",
    "Special Chana","Golden Chana","Fresh Harvest Chana","Healthy Chana","Traditional Chana",
    "Standard Chana","Pro Chana","Ultra Chana","Farm Fresh Chana","Pure Chana",
    "Fine Chana","Jumbo Pack Chana","Small Chana","Large Chana"};
    return chanaBrands;
}
if(productName == "uradDal"){
    String uradDalBrands[] = {"Comfort Softener","Lenor Softener","BB Royal Softener","More Choice Softener","Classic Softener",
    "Premium Softener","Liquid Softener","Floral Softener","Lavender Softener","Rose Softener",
    "Family Pack Softener","Value Pack Softener","Daily Use Softener","Select Softener","Quality Softener",
    "Special Softener","Golden Softener","Eco Softener","Ultra Softener","Pro Softener",
    "Standard Softener","Fresh Softener","Long Lasting Softener","Silky Soft Softener","Advanced Softener",
    "Pure Softener","Extra Care Softener","Mild Softener","Strong Fragrance Softener"};
    return uradDalBrands;
}

if(productName == "airFreshener"){
    String airFreshenerBrands[] = {"Odonil Air Freshener","Ambi Pur Air Freshener","Godrej Aer","Air Wick Freshener","BB Royal Freshener",
    "More Choice Freshener","Classic Freshener","Premium Freshener","Lavender Freshener","Rose Freshener",
    "Jasmine Freshener","Citrus Freshener","Ocean Freshener","Floral Freshener","Family Pack Freshener",
    "Value Pack Freshener","Daily Use Freshener","Select Freshener","Quality Freshener","Special Freshener",
    "Long Lasting Freshener","Spray Freshener","Gel Freshener","Automatic Freshener","Eco Freshener",
    "Pro Freshener","Ultra Freshener","Standard Freshener","Fresh Breeze Freshener"};
    return airFreshenerBrands;
}

if(productName == "faceMask"){
    String faceMaskBrands[] = {"Mamaearth Mask","Himalaya Mask","Plum Mask","BB Royal Mask","More Choice Mask",
    "Classic Mask","Premium Mask","Charcoal Mask","Aloe Mask","Vitamin C Mask",
    "Family Pack Mask","Value Pack Mask","Daily Use Mask","Select Mask","Quality Mask",
    "Special Mask","Golden Mask","Eco Mask","Ultra Mask","Pro Mask",
    "Clay Mask","Sheet Mask","Herbal Mask","Hydrating Mask","Brightening Mask",
    "Pure Mask","Oil Control Mask","Detox Mask","Fresh Mask"};
    return faceMaskBrands;
}

if(productName == "sunscreen"){
    String sunscreenBrands[] = {"Lakme Sunscreen","Nivea Sunscreen","Neutrogena Sunscreen","BB Royal Sunscreen","More Choice Sunscreen",
    "Classic Sunscreen","Premium Sunscreen","SPF 30 Sunscreen","SPF 50 Sunscreen","Gel Sunscreen",
    "Family Pack Sunscreen","Value Pack Sunscreen","Daily Use Sunscreen","Select Sunscreen","Quality Sunscreen",
    "Special Sunscreen","Golden Sunscreen","Eco Sunscreen","Ultra Sunscreen","Pro Sunscreen",
    "Matte Sunscreen","Waterproof Sunscreen","Herbal Sunscreen","Oil Free Sunscreen","Skin Care Sunscreen",
    "Pure Sunscreen","Advanced Sunscreen","Cooling Sunscreen","Fresh Sunscreen"};
    return sunscreenBrands;
}

if(productName == "lipBalm"){
    String lipBalmBrands[] = {"Vaseline Lip Balm","Nivea Lip Balm","Maybelline Lip Balm","BB Royal Lip Balm","More Choice Lip Balm",
    "Classic Lip Balm","Premium Lip Balm","Strawberry Lip Balm","Rose Lip Balm","Aloe Lip Balm",
    "Family Pack Lip Balm","Value Pack Lip Balm","Daily Use Lip Balm","Select Lip Balm","Quality Lip Balm",
    "Special Lip Balm","Golden Lip Balm","Eco Lip Balm","Ultra Lip Balm","Pro Lip Balm",
    "Moisturizing Lip Balm","Tinted Lip Balm","SPF Lip Balm","Herbal Lip Balm","Natural Lip Balm",
    "Pure Lip Balm","Advanced Lip Balm","Soft Care Lip Balm","Fresh Lip Balm"};
    return lipBalmBrands;
}

if(productName == "handCream"){
    String handCreamBrands[] = {"Nivea Hand Cream","Vaseline Hand Cream","Himalaya Hand Cream","BB Royal Hand Cream","More Choice Hand Cream",
    "Classic Hand Cream","Premium Hand Cream","Aloe Hand Cream","Shea Butter Hand Cream","Milk Hand Cream",
    "Family Pack Hand Cream","Value Pack Hand Cream","Daily Use Hand Cream","Select Hand Cream","Quality Hand Cream",
    "Special Hand Cream","Golden Hand Cream","Eco Hand Cream","Ultra Hand Cream","Pro Hand Cream",
    "Moisturizing Hand Cream","Herbal Hand Cream","Soft Care Hand Cream","Dry Skin Hand Cream","Natural Hand Cream",
    "Pure Hand Cream","Advanced Hand Cream","Cooling Hand Cream","Fresh Hand Cream"};
    return handCreamBrands;
}

if(productName == "footCream"){
    String footCreamBrands[] = {"Himalaya Foot Cream","Krack Foot Cream","BB Royal Foot Cream","More Choice Foot Cream","Classic Foot Cream",
    "Premium Foot Cream","Aloe Foot Cream","Herbal Foot Cream","Cracked Heel Cream","Moisturizing Foot Cream",
    "Family Pack Foot Cream","Value Pack Foot Cream","Daily Use Foot Cream","Select Foot Cream","Quality Foot Cream",
    "Special Foot Cream","Golden Foot Cream","Eco Foot Cream","Ultra Foot Cream","Pro Foot Cream",
    "Soft Care Foot Cream","Dry Skin Foot Cream","Natural Foot Cream","Pure Foot Cream","Advanced Foot Cream",
    "Cooling Foot Cream","Fresh Foot Cream","Extra Care Foot Cream","Strong Repair Cream"};
    return footCreamBrands;
}

if(productName == "shampooConditioner"){
    String shampooConditionerBrands[] = {"Dove Conditioner","Pantene Conditioner","Tresemme Conditioner","BB Royal Conditioner","More Choice Conditioner",
    "Classic Conditioner","Premium Conditioner","Smooth Conditioner","Repair Conditioner","Keratin Conditioner",
    "Family Pack Conditioner","Value Pack Conditioner","Daily Use Conditioner","Select Conditioner","Quality Conditioner",
    "Special Conditioner","Golden Conditioner","Eco Conditioner","Ultra Conditioner","Pro Conditioner",
    "Herbal Conditioner","Moisturizing Conditioner","Strong Conditioner","Soft Conditioner","Natural Conditioner",
    "Pure Conditioner","Advanced Conditioner","Cooling Conditioner","Fresh Conditioner"};
    return shampooConditionerBrands;
}

if(productName == "beardOil"){
    String beardOilBrands[] = {"Beardo Oil","Ustraa Oil","Bombay Shaving Oil","BB Royal Beard Oil","More Choice Beard Oil",
    "Classic Beard Oil","Premium Beard Oil","Herbal Beard Oil","Aloe Beard Oil","Vitamin Beard Oil",
    "Family Pack Beard Oil","Value Pack Beard Oil","Daily Use Beard Oil","Select Beard Oil","Quality Beard Oil",
    "Special Beard Oil","Golden Beard Oil","Eco Beard Oil","Ultra Beard Oil","Pro Beard Oil",
    "Strong Hold Beard Oil","Soft Beard Oil","Natural Beard Oil","Pure Beard Oil","Advanced Beard Oil",
    "Cooling Beard Oil","Fresh Beard Oil","Extra Care Beard Oil","Luxury Beard Oil"};
    return beardOilBrands;
}

if(productName == "hairSerum"){
    String hairSerumBrands[] = {"Livon Serum","Streax Serum","L'Oreal Serum","BB Royal Serum","More Choice Serum",
    "Classic Serum","Premium Serum","Smooth Serum","Repair Serum","Keratin Serum",
    "Family Pack Serum","Value Pack Serum","Daily Use Serum","Select Serum","Quality Serum",
    "Special Serum","Golden Serum","Eco Serum","Ultra Serum","Pro Serum",
    "Herbal Serum","Moisturizing Serum","Strong Serum","Soft Serum","Natural Serum",
    "Pure Serum","Advanced Serum","Cooling Serum","Fresh Serum"};
    return hairSerumBrands;
}
if(productName == "faceScrub"){
    String faceScrubBrands[] = {"Himalaya Scrub","Garnier Scrub","Lotus Scrub","BB Royal Scrub","More Choice Scrub",
    "Classic Scrub","Premium Scrub","Walnut Scrub","Apricot Scrub","Charcoal Scrub",
    "Family Pack Scrub","Value Pack Scrub","Daily Use Scrub","Select Scrub","Quality Scrub",
    "Special Scrub","Golden Scrub","Eco Scrub","Ultra Scrub","Pro Scrub",
    "Herbal Scrub","Oil Control Scrub","Brightening Scrub","Natural Scrub","Pure Scrub",
    "Advanced Scrub","Cooling Scrub","Fresh Scrub","Skin Care Scrub"};
    return faceScrubBrands;
}

if(productName == "bodyWash"){
    String bodyWashBrands[] = {"Dove Body Wash","Lux Body Wash","Nivea Body Wash","BB Royal Body Wash","More Choice Body Wash",
    "Classic Body Wash","Premium Body Wash","Aloe Body Wash","Rose Body Wash","Lavender Body Wash",
    "Family Pack Body Wash","Value Pack Body Wash","Daily Use Body Wash","Select Body Wash","Quality Body Wash",
    "Special Body Wash","Golden Body Wash","Eco Body Wash","Ultra Body Wash","Pro Body Wash",
    "Herbal Body Wash","Moisturizing Body Wash","Cooling Body Wash","Natural Body Wash","Pure Body Wash",
    "Advanced Body Wash","Fresh Body Wash","Skin Care Body Wash","Luxury Body Wash"};
    return bodyWashBrands;
}

if(productName == "soda"){
    String sodaBrands[] = {"Kinley Soda","Bisleri Soda","Schweppes Soda","BB Royal Soda","More Choice Soda",
    "Classic Soda","Premium Soda","Club Soda","Lemon Soda","Mint Soda",
    "Family Pack Soda","Value Pack Soda","Daily Use Soda","Select Soda","Quality Soda",
    "Special Soda","Golden Soda","Eco Soda","Ultra Soda","Pro Soda",
    "Sparkling Soda","Fresh Soda","Strong Soda","Natural Soda","Pure Soda",
    "Advanced Soda","Cooling Soda","Mini Pack Soda","Jumbo Soda"};
    return sodaBrands;
}

if(productName == "buttermilk"){
    String buttermilkBrands[] = {"Amul Buttermilk","Nandini Buttermilk","Heritage Buttermilk","BB Royal Buttermilk","More Choice Buttermilk",
    "Classic Buttermilk","Premium Buttermilk","Masala Buttermilk","Salted Buttermilk","Spiced Buttermilk",
    "Family Pack Buttermilk","Value Pack Buttermilk","Daily Use Buttermilk","Select Buttermilk","Quality Buttermilk",
    "Special Buttermilk","Golden Buttermilk","Eco Buttermilk","Ultra Buttermilk","Pro Buttermilk",
    "Fresh Buttermilk","Healthy Buttermilk","Traditional Buttermilk","Natural Buttermilk","Pure Buttermilk",
    "Advanced Buttermilk","Cooling Buttermilk","Mini Pack Buttermilk","Farm Buttermilk"};
    return buttermilkBrands;
}

if(productName == "lassi"){
    String lassiBrands[] = {"Amul Lassi","Nandini Lassi","Mother Dairy Lassi","BB Royal Lassi","More Choice Lassi",
    "Classic Lassi","Premium Lassi","Sweet Lassi","Salted Lassi","Mango Lassi",
    "Family Pack Lassi","Value Pack Lassi","Daily Use Lassi","Select Lassi","Quality Lassi",
    "Special Lassi","Golden Lassi","Eco Lassi","Ultra Lassi","Pro Lassi",
    "Fresh Lassi","Healthy Lassi","Traditional Lassi","Natural Lassi","Pure Lassi",
    "Advanced Lassi","Cooling Lassi","Mini Pack Lassi","Farm Lassi"};
    return lassiBrands;
}

if(productName == "flavoredMilk"){
    String flavoredMilkBrands[] = {"Amul Flavored Milk","Nandini Flavored Milk","Heritage Flavored Milk","BB Royal Flavored Milk","More Choice Flavored Milk",
    "Classic Flavored Milk","Premium Flavored Milk","Chocolate Milk","Strawberry Milk","Badam Milk",
    "Family Pack Milk","Value Pack Milk","Daily Use Milk","Select Milk","Quality Milk",
    "Special Milk","Golden Milk","Eco Milk","Ultra Milk","Pro Milk",
    "Fresh Milk","Healthy Milk","Traditional Milk","Natural Milk","Pure Milk",
    "Advanced Milk","Cooling Milk","Mini Pack Milk","Farm Milk"};
    return flavoredMilkBrands;
}

if(productName == "coldCoffee"){
    String coldCoffeeBrands[] = {"Bru Cold Coffee","Nescafe Cold Coffee","BB Royal Cold Coffee","More Choice Cold Coffee","Classic Cold Coffee",
    "Premium Cold Coffee","Chocolate Cold Coffee","Vanilla Cold Coffee","Strong Cold Coffee","Family Pack Cold Coffee",
    "Value Pack Cold Coffee","Daily Use Cold Coffee","Select Cold Coffee","Quality Cold Coffee","Special Cold Coffee",
    "Golden Cold Coffee","Eco Cold Coffee","Ultra Cold Coffee","Pro Cold Coffee","Fresh Cold Coffee",
    "Healthy Cold Coffee","Traditional Cold Coffee","Natural Cold Coffee","Pure Cold Coffee",
    "Advanced Cold Coffee","Cooling Cold Coffee","Mini Pack Cold Coffee","Farm Cold Coffee","Luxury Cold Coffee"};
    return coldCoffeeBrands;
}

if(productName == "coconutWater"){
    String coconutWaterBrands[] = {"Paper Boat Coconut Water","Tender Coconut Water","BB Royal Coconut Water","More Choice Coconut Water","Classic Coconut Water",
    "Premium Coconut Water","Fresh Coconut Water","Natural Coconut Water","Family Pack Coconut Water","Value Pack Coconut Water",
    "Daily Use Coconut Water","Select Coconut Water","Quality Coconut Water","Special Coconut Water","Golden Coconut Water",
    "Eco Coconut Water","Ultra Coconut Water","Pro Coconut Water","Healthy Coconut Water","Pure Coconut Water",
    "Farm Coconut Water","Cooling Coconut Water","Mini Pack Coconut Water","Advanced Coconut Water",
    "Organic Coconut Water","Traditional Coconut Water","Sweet Coconut Water","Green Coconut Water","Desi Coconut Water"};
    return coconutWaterBrands;
}

if(productName == "glucosePowder"){
    String glucosePowderBrands[] = {"Glucon-D","Enerzal Powder","BB Royal Glucose","More Choice Glucose","Classic Glucose",
    "Premium Glucose","Orange Glucose","Lemon Glucose","Energy Glucose","Family Pack Glucose",
    "Value Pack Glucose","Daily Use Glucose","Select Glucose","Quality Glucose","Special Glucose",
    "Golden Glucose","Eco Glucose","Ultra Glucose","Pro Glucose","Healthy Glucose",
    "Pure Glucose","Natural Glucose","Cooling Glucose","Advanced Glucose","Strong Glucose",
    "Mini Pack Glucose","Jumbo Pack Glucose","Instant Energy Powder","Sports Glucose"};
    return glucosePowderBrands;
}

if(productName == "herbalTea"){
    String herbalTeaBrands[] = {"Organic India Tea","Girnar Herbal Tea","Tetley Herbal Tea","BB Royal Herbal Tea","More Choice Herbal Tea",
    "Classic Herbal Tea","Premium Herbal Tea","Tulsi Tea","Ginger Tea","Lemon Tea",
    "Family Pack Tea","Value Pack Tea","Daily Use Tea","Select Tea","Quality Tea",
    "Special Tea","Golden Tea","Eco Tea","Ultra Tea","Pro Tea",
    "Fresh Tea","Healthy Tea","Traditional Tea","Natural Tea","Pure Tea",
    "Advanced Tea","Cooling Tea","Mini Pack Tea","Herbal Infusion Tea"};
    return herbalTeaBrands;
}

if(productName == "blackCoffee"){
    String blackCoffeeBrands[] = {"Nescafe Black Coffee","Bru Black Coffee","Continental Black Coffee","BB Royal Black Coffee","More Choice Black Coffee",
    "Classic Black Coffee","Premium Black Coffee","Strong Black Coffee","Instant Black Coffee","Filter Black Coffee",
    "Family Pack Black Coffee","Value Pack Black Coffee","Daily Use Black Coffee","Select Black Coffee","Quality Black Coffee",
    "Special Black Coffee","Golden Black Coffee","Eco Black Coffee","Ultra Black Coffee","Pro Black Coffee",
    "Fresh Black Coffee","Healthy Black Coffee","Traditional Black Coffee","Natural Black Coffee","Pure Black Coffee",
    "Advanced Black Coffee","Mini Pack Black Coffee","Jumbo Pack Black Coffee","Luxury Black Coffee"};
    return blackCoffeeBrands;
}
	return null;
} 
}


