public class Sem6 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPhone("Maria", "859465");
        phoneBook.addPhone("Maria", "858934");
        phoneBook.addPhone("Ivan",  "946596");
        phoneBook.addPhone("Nikita", "480486");
        phoneBook.addPhone("Ivan", "965839");
        phoneBook.addPhone("Anna", "457523");
        phoneBook.addPhone("Maria", "858634");

        phoneBook.printPhone();
    }
}
