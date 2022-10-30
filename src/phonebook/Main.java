package phonebook;

public class Main {
    public static void main(String[] args) {

        task1();

    }

    private static void task1() {
        var phoneBook = new PhoneBook();
        fillPhoneBook(phoneBook);
        phoneBook.showAll();
    }

    private static void fillPhoneBook(PhoneBook pn) {
        for (int i = 0; i < 20; i++) {
            pn.add(("Name" + i), String.valueOf(i).repeat(6));


        }
    }
}
