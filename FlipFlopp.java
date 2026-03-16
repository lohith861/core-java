class FlipFlopp {

    static String materialType;
    static String closureType;
    static String heelType;
    static String waterResistance;
    static String soleMaterial;
    static String style;
    static String strapType;
    static String countryOfOrigin;
    static String genericName;
    static int price;

    public static void main(String[] args) {

        materialType = "EVA";
        closureType = "Buckle";
        heelType = "Flat";
        waterResistance = "Water Resistant";
        soleMaterial = "Rubber";
        style = "Modern";
        strapType = "Double Strap";
        countryOfOrigin = "India";
        genericName = "Flip Flop";
        price = 549;

        System.out.println("Material Type: " + materialType);
        System.out.println("Closure Type: " + closureType);
        System.out.println("Heel Type: " + heelType);
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("Sole Material: " + soleMaterial);
        System.out.println("Style: " + style);
        System.out.println("Strap Type: " + strapType);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Generic Name: " + genericName);
        System.out.println("Price: ₹" + price);
    }
}
