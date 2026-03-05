class Hospital {

    static String doctorNames[] = {
        "Dr. Ramesh", "Dr. Priya", "Dr. Suresh", "Dr. Anjali",
        "Dr. Kiran", "Dr. Meena", "Dr. Arjun", "Dr. Kavya",
        "Dr. Rohit", "Dr. Sneha"
    };

    public static void getDoctorNames() {

        for(String doctor : doctorNames){
            System.out.println(doctor);
        }
    }
}