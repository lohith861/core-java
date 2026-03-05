class AmazonPrimeVideoExecutor {

    public static void main(String[] args) {

        System.out.println("Amazon Prime Video Series List");

        AmazonPrimeVideo.getKannadaSeries();
        AmazonPrimeVideo.getMalayalamSeries();
        AmazonPrimeVideo.getEnglishSeries();
        AmazonPrimeVideo.getHindiSeries();
        AmazonPrimeVideo.getTamilSeries();
        AmazonPrimeVideo.getTeluguSeries();

        System.out.println("End of Series List");
    }
}