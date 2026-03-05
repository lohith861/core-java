class NetflixExecutor {

    public static void main(String[] args) {

        System.out.println("Netflix Movies List");

        Netflix.getKannadaMovies();
        Netflix.getTeluguMovies();
        Netflix.getHindiMovies();
        Netflix.getTamilMovies();
        Netflix.getEnglishMovies();
        Netflix.getMalayalamMovies();

        System.out.println("End of Movies List");
    }
}