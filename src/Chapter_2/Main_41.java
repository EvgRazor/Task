package Chapter_2;

public class Main_41 {

    public static void main(String[] args) {

        // Выбрасываем сами исключение, если какой то пораметримеет null
        Main_41_Car car = new Main_41_Car("Honda", null);
        System.out.println(car.toString());



    }

}
