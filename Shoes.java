class Shoes {

    static String brand;
    static String material;
    static String color;
    static String size;
    static String soleMaterial;
    static String closureType;
    static String style;
    static String department;
    static int price;

    public static void main(String[] args) {

        brand = "Adidas";
        material = "Mesh";
        color = "White";
        size = "9";
        soleMaterial = "Rubber";
        closureType = "Lace Up";
        style = "Running";
        department = "Men";
        price = 4999;

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Sole Material: " + soleMaterial);
        System.out.println("Closure Type: " + closureType);
        System.out.println("Style: " + style);
        System.out.println("Department: " + department);
        System.out.println("Price: ₹" + price);
    }
}
