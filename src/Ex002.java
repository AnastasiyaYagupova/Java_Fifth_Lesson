import java.util.*;

/*
2) Пусть дан список сотрудников:
Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
 */
public class Ex002 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        String listOfEmployees = "Иван Иванов "
                + "Светлана Петрова " + "Кристина Белова "
                + "Анна Мусина " + "Анна Крутова "
                + "Иван Юрин " + "Петр Лыков "
                + "Павел Чернов " + "Петр Чернышов "
                + "Мария Федорова " + "Марина Светлова "
                + "Мария Савина " + "Мария Рыкова "
                + "Марина Лугова " + "Анна Владимирова "
                + "Иван Мечников " + "Петр Петин "
                + "Иван Ежов ";

        String[] splitList = listOfEmployees.split(" ");
        for (int i = 0; i < splitList.length; i += 2) {
            if (map.containsKey(splitList[i])) {
                map.put(splitList[i], map.get(splitList[i]) + 1);
            } else {
                map.put(splitList[i], 1);
            }
        }
        TreeMap<Integer, List<String>> map2 = new TreeMap<>();
        for (String it : map.keySet()) {
            if (map2.containsKey(map.get(it))) {
                map2.get(map.get(it)).add(it);
            } else {
                List<String> list = new ArrayList<>();
                list.add(it);
                map2.put(map.get(it), list);
            }
        }
        System.out.println(map2.descendingMap());
    }
}
