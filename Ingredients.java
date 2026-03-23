class Ingredients {

    public static void main(String[] anything) {

        String type = "Lays Ingredients";

        String one="Rice Bran Oil";
        String two="Spices and Condiments";
        String three="Onion Powder";
        String four="Chilli Powder";
        String five="Coriander Powder";
        String six="Ginger Powder";
        String seven="Garlic Powder";
        String eight="Black Pepper Powder";
        String nine="Spices Extract";
        String ten="Turmeric Powder";
        String eleven="Iodised Salt";
        String twelve="Black Salt";
        String thirteen="Tomato Powder";
        String fourteen="Citric Acid";

        String ingredients[]={one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen};

        System.out.println("The Name is: " + type + "\n");

        for(String item : ingredients) {
            System.out.println(item);
        }

    }
}
