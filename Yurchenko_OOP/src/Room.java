
public class Room {
    /**
     *
     */
    public String typesRoom;
    public int residNumb;
    public int prise;
    public int roomId;

    /**
     * Створення об'єкту - Кімната з заданими параметрами
     * @param typesRoom - класи кімнати
     * @param residNumb - кількість мешканців
     * @param prise - ціна
     * @param roomId - номера кімнат
     */
    public Room(String typesRoom, int residNumb, int prise, int roomId){
        this.typesRoom = typesRoom;
        this.residNumb = residNumb;
        this.prise = prise;
        this.roomId = roomId;
    }

    /**
     * Метод повертає кількість мешканців
     * @return кількість певних мешканців
     *
     */
    public int residNumb(){

        return residNumb;
    }

    private void reservNumd(){

    }

}
