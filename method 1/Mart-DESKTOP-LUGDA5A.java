class Mart {

    public static String[] searchBrandByProductOf(String productName){

        if("biscuit".equals(productName)){

            String biscuitBrands[] = {
                "Britannia Good Day","Parle-G","Oreo Original"
            };

            return biscuitBrands;
        }

        return null;
    }
}