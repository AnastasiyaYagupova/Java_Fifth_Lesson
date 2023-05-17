import java.util.HashMap;
import java.util.Map;

/*
1) Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом),
вносить все слова не нужно
Пример:
Россия идет вперед всей планеты. Планета — это не Россия.
Запрос: Россия
Ответ: Россия - 2
toLoverCase().
(Усложнение - игнорировать пунктуацию)*
 */
public class Ex001 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.replace(".", "");
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }
        Object value = map.get("Россия");
        System.out.println("Россия - " + value);

    }
}
