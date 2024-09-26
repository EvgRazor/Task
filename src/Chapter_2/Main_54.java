package Chapter_2;

public class Main_54 {

    public static void main(String[] args) {
        Main_54_User main54User = new Main_54_User("name", "surname", 25);

        // Без переопределенного toString() увидим имя класса + хешкод
        System.out.println(main54User); // Chapter_2.Main_54_User@3feba861

        // После переопределения будет все ок. ВАЖНО. Если что то не хотим янвно выводить, убираем его из toString()
        System.out.println(main54User); // Main_54_User{name='name', surname='surname', age=25}
    }

}
