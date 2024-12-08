package Chapter_5;

public class Main_113_Test {

    private int age;
    private String name;

    public Main_113_Test(int age, String name) {
        this.age = age;
        this.name = name;
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
        return "Main_113_Test{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
