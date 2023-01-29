public class Admin extends User{

    public String name;
    public String hotelName;
    public String hotelAddress;
    public long phoneNumber;
    public int alternation;

    public Admin(String name, String hotelName, String hotelAddress, String adminLogin, String adminPassword,  long phoneNumber, int alternation) {

        super(adminLogin, adminPassword);

        this.name = name;
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.phoneNumber = phoneNumber;
        this.alternation = alternation;

    }

}
