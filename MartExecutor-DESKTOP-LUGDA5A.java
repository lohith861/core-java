class MartExecutor {

    public static void main(String[] args) {

        String[] brands = Mart.searchBrandByProductOf("biscuit");

        for(int i = 0; i < brands.length; i++){
            System.out.println(brands[i]);
        }
    }
}