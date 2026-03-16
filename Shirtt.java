class Shirtt {

    static String materialComposition;
    static String pattern;
    static String fitType;
    static String length;
    static String neckStyle;
    static String countryOfOrigin;
    static String department;
    static String manufacturer;
    static String genericName;
    static int price;

    public static void main(String[] args) {

        materialComposition = "Cotton Blend";
        pattern = "Solid";
        fitType = "Slim Fit";
        length = "Standard Length";
        neckStyle = "Collared Neck";
        countryOfOrigin = "India";
        department = "Men";
        manufacturer = "Bangalore";
        genericName = "Shirt";
        price = 899;

        System.out.println("Material Composition: " + materialComposition);
        System.out.println("Pattern: " + pattern);
        System.out.println("Fit Type: " + fitType);
        System.out.println("Length: " + length);
        System.out.println("Neck Style: " + neckStyle);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Department: " + department);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Product Name: " + genericName);
        System.out.println("Price: ₹" + price);
    }
}
