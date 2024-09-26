package Chapter_2;

public class Main_55 {

    public static void main(String[] args) {
        // byte, short, char, int. + обертки их. String, Enum

        String name = "Hello";
        // при работе с switch со " -> " мы не ставим break.
        switch (name) {
            case "Hell" -> System.out.println(name);
            case "Hel" -> System.out.println(name);
            case "Helo!" -> System.out.println(name);
            case "Hello!" -> System.out.println(name);
            case "Hello" -> System.out.println(name);
            default -> throw new RuntimeException("Ошибочка, нет такой строки");
        }
    }

}
