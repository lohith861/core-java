class PumaSlidesExecutor {

    public static void main(String[] args) {

        System.out.println("main is started");

        String brand = PumaSlides.getBrand();
        System.out.println(brand);

        String color = PumaSlides.getColor();
        System.out.println(color);

        String ideal = PumaSlides.getIdealFor();
        System.out.println(ideal);

        int pack = PumaSlides.getPackOf();
        System.out.println(pack);

        String article = PumaSlides.getArticleNumber();
        System.out.println(article);

        int size = PumaSlides.getSize();
        System.out.println(size);

        String type = PumaSlides.getType();
        System.out.println(type);

        System.out.println("main is ended");
    }
}