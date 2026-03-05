class Cafee {

    static String teaNames[] = {
        "Amruth Tea",
        "Black Tea",
        "White Tea",
        "Lemon Tea",
        "Masala Tea",
        "Ginger Tea"
    };

    static String coffeeNames[] = {
        "Black Coffee",
        "Cold Coffee",
        "Filter Coffee",
        "Caramel Coffee",
        "Irish Coffee",
        "Americano Coffee"
    };

    static String snacks[] = {
        "Samosa",
        "Pakoda",
        "Pizza",
        "Burger",
        "French Fries",
        "Vada Pav"
    };

    public static void getTeaNames() {
        System.out.println("Tea Names:");
        for (String teaName : teaNames)
            System.out.println(teaName);
    }

    public static void getCoffeeNames() {
        System.out.println("Coffee Names:");
        for (String coffeeName : coffeeNames)
            System.out.println(coffeeName);
    }

    public static void getSnacks() {
        System.out.println("Snack Items:");
        for (String snack : snacks)
            System.out.println(snack);
    }
}