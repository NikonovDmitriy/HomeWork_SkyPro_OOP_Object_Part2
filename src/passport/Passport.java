package passport;

public class Passport {

    private final int number;
    private String name;
    private String surname;
    private String patronymic;
    private int date;

    public Passport(int number, String name, String surname, String patronymic, int date) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
