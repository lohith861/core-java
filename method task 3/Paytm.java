class Paytm {

    public static void createAccount(String fullName,
                                     long mobileNumber,
                                     String emailId,
                                     String password,
                                     String panNumber,
									 String... address
                                     ) {


        System.out.println("*******************************");
        System.out.println("Paytm Full Name : " + fullName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Email Id : " + emailId);
        System.out.println("Password : " + password);
        System.out.println("PAN Number : " + panNumber);
		
		for(String s : address){
			
		
        System.out.println("Address : " + s);
		}
    }
}