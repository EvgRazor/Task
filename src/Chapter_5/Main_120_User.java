package Chapter_5;

import java.util.Objects;

public class Main_120_User {

    private String age;
    private String name;

    public Main_120_User(String age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Main_120_User that = (Main_120_User) object;
        return Objects.equals(age, that.age) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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
        return "Main_120_User{" +
                "age='" + age + '\'' +
                '}';
    }
}
