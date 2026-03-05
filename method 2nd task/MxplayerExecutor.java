class MxplayerExecutor {

    public static void main(String[] args) {

        System.out.println("MX Player Reality Shows List");

        Mxplayer.getKannadaShows();
        Mxplayer.getTeluguShows();
        Mxplayer.getHindiShows();
        Mxplayer.getTamilShows();
        Mxplayer.getEnglishShows();
        Mxplayer.getMalayalamShows();

        System.out.println("End of Shows List");
    }
}