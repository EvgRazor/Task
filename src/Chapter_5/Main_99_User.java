package Chapter_5;

public class Main_99_User {

    private int age;
    private String name;

    public Main_99_User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Main_99_User() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Main_99_User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
