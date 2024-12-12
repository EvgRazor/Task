package Chapter_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_121 {

    // Замена элементов в списк

    public static void main(String[] args) {

        List<Main_120_User> userList = new ArrayList<>();
        userList.add(new Main_120_User("18", "Tim"));
        userList.add(new Main_120_User("21", "Tom"));
        userList.add(new Main_120_User("19", "Sam"));
        userList.add(new Main_120_User("18", "Jim"));

        System.out.println(Arrays.toString(userList.toArray()));

        // меняем age с 18 на 99
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getAge().equals("18")) {
                userList.set(i, new Main_120_User("99", userList.get(i).getName()));
            }
        }

        System.out.println("После замены");
        System.out.println(Arrays.toString(userList.toArray()));



    }

}
