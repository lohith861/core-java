class JioHotstarExecutor {

    public static void main(String[] args) {

        System.out.println("Jio Hotstar Cartoon List");

        JioHotstar.getEnglishCartoon();
        JioHotstar.getHindiCartoon();
        JioHotstar.getKannadaCartoon();
        JioHotstar.getTeluguCartoon();
        JioHotstar.getTamilCartoon();
        JioHotstar.getMalayalamCartoon();

        System.out.println("End of Cartoon List");
    }
}