package Chapter_5;

import java.util.*;
import java.util.stream.Collectors;

public class Main_120 {

    //  Фильтрация коллекции по списку
    public static void main(String[] args) {

        List<Main_120_User> list = new ArrayList<>();

        list.add(new Main_120_User("18", "Jom"));
        list.add(new Main_120_User("22", "Tom"));
        list.add( new Main_120_User("25", "Tomas"));
        list.add(new Main_120_User("22", "Hun"));

        List<String> stringList = Arrays.asList("18", "22", "25", "45", "22", "19");

        // Пример решения
        Set<String> stringSet = new HashSet<>(stringList);

        List<Main_120_User> listList = list.stream().filter(main120User -> stringList.contains(main120User.getAge())).collect(Collectors.toList());

        System.out.println(listList);




    }

}
