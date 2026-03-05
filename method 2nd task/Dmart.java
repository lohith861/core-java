class Dmart {

    static String groceryItems[] = {
        "Rice", "Wheat Flour", "Sugar", "Salt",
        "Cooking Oil", "Toor Dal", "Moong Dal", "Tea Powder",
        "Coffee Powder", "Biscuits"
    };

    public static void getGroceryItems() {

        for(String item : groceryItems){
            System.out.println(item);
        }
    }
}