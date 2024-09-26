package Chapter_2;

public class Main_54_User {

    private final String name;
    private final String surname;
    private final int age;

    public Main_54_User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Main_54_User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '}';
    }
}
