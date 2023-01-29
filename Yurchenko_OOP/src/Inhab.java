
public class Inhab extends User{
    String inhabName;
    String inhabAddress;
    long inhabPhone;
    int roomId;
    int roomType;
    int residPeriod;

    public Inhab(String inhabName, String inhabAddress, String inhabLogin , String inhabPassword, long inhabPhone, int roomId, int roomType , int residPeriod) {

        super(inhabLogin, inhabPassword);

        this.inhabName = inhabName;
        this.inhabAddress = inhabAddress;
        this.inhabPhone = inhabPhone;
        this.roomId = roomId;
        this.roomType = roomType;
        this.residPeriod = residPeriod;

    }

    @Override
    public String toString() {
        return "Ім'я: " + this.inhabName +
                "\nАдреса: " + this.inhabAddress +
                "\nНомер телефону: " + this.inhabPhone +
                "\nНомер кімнати: " + this.roomId +
                "\nТип кімнати: " + this.roomType + "-го класу" +
                "\nПеріод проживання : " + this.residPeriod + " діб"+ '\n';
    }

}
