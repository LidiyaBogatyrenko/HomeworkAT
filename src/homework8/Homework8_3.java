package homework8;

import java.util.LinkedHashMap;
import java.util.Map;

public class Homework8_3 {
    /*
    Задача 3:
На вход поступает массив строк,
верните Map<String, Boolean>, где каждая отдельная строка является ключом, и ее значение равно true, если эта строка встречается в массиве 2 или более раз.
Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
     */

    public static Map<String, Boolean> wordMultiple(String[] letters) {
        Map<String, Boolean> result = new LinkedHashMap<>();

        for (String l : letters) {
            if (result.containsKey(l)) {
                result.put(l, true);
            } else {
                result.put(l, false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] letters = {"a", "b", "a", "c", "b", "d", "e"};
        System.out.println(wordMultiple(letters));
    }
}