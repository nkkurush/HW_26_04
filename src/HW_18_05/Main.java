package HW_18_05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*1
        1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
        2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
        3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
        4. Вывести содержимое Map на экран.
        */
        System.out.println("Task 1");
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Pavlov", "Pavel");
        map.put("Izotova", "Anastasia");
        map.put("Shuralev", "Dmitriy");
        map.put("Baberdin", "Pavel");
        map.put("Izotova", "Mariya");
        map.put("Aliev", "Ali");
        map.put("Valiev", "Vali");
        map.put("Aliev", "Vali");
        map.put("Valiev", "Ali");
        System.out.println(map);
    /*2

        Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
                Используй коллекции.
*/
        System.out.println("Task 2");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("January", 1);
        map2.put("February", 2);
        map2.put("March", 3);
        map2.put("April", 4);
        map2.put("May", 5);
        map2.put("June", 6);
        map2.put("July", 7);
        map2.put("August", 8);
        map2.put("September", 9);
        map2.put("October", 10);
        map2.put("November", 11);
        map2.put("December", 12);
        if (map2.containsKey(str)) {
            System.out.println(str + " is the " + map2.get(str) + " month");
        }
        /*3

        Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
        Новая задача: Программа должна работать не с номерами домов, а с городами:

        Пример ввода:
        Москва
                Ивановы
        Киев
                Петровы
        Лондон
                Абрамовичи

        Лондон

        Пример вывода:
        Абрамовичи

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            Map<String, String> map = new HashMap<>();
            while (true) {
                String city = reader.readLine();
                if (city.isEmpty()) {
                    break;
                }
                String family = reader.readLine();

                map.put(city, family);
            }

            String city = reader.readLine();

            if (map.containsKey(city)) {
                String familyName = map.get(city);
                System.out.println(familyName);
            }
        }

*/
        System.out.println("Task 3");
        System.out.println("А что тут решать? зачем дано задача если есть решение");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map3 = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            map3.put(city, family);
        }

        String city = reader.readLine();

        if (map3.containsKey(city)) {
            String familyName = map3.get(city);
            System.out.println(familyName);
        }
        reader.close();
  /*      4

        Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
        арбуз - ягода,
                банан - трава,
                вишня - ягода,
                груша - фрукт,
                дыня - овощ,
                ежевика - куст,
                жень-шень - корень,
                земляника - ягода,
                ирис - цветок,
                картофель - клубень.
                        Вывести содержимое коллекции на экран, каждый элемент с новой строки.

        Пример вывода (тут показана только одна строка):
        картофель - клубень
*/
        System.out.println("Task 4");
        Map<String,String> map4 = new HashMap<>();
        map4.put("арбуз","ягода");
        map4.put("банан","трава");
        map4.put("вишня","ягода");
        map4.put("груша","фрукт");
        map4.put("дыня","овощ");
        map4.put("ежевика","куст");
        map4.put("жень-шень","корень");
        map4.put("земляника","ягода");
        map4.put("ирис","цветок");
        map4.put("картофель","клубень");
        for(Map.Entry<String, String> entry: map4.entrySet()) {
            System.out.println(entry.getKey()+" - "+ entry.getValue());
        }
  /*      5

        Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
                Вывести содержимое коллекции на экран, каждый элемент с новой строки.

        Пример вывода (тут показана только одна строка):
        Sim - 5

        public static void main(String[] args) {
            Map<String, Object> map = new HashMap<>();
            map.put("Sim", 5);
            map.put("Tom", 5.5);
            map.put("Arbus", false);
            map.put("Baby", null);
            map.put("Cat", "Cat");
            map.put("Eat", new Long(56));
            map.put("Food", new Character('3'));
            map.put("Gevey", '6');
            map.put("Hugs", 111111111111L);
            map.put("Comp", (double) 123);

            //напишите тут ваш код

        }*/
        System.out.println("Task5");
        Map<String, Object> map5 = new HashMap<>();
        map5.put("Sim", 5);
        map5.put("Tom", 5.5);
        map5.put("Arbus", false);
        map5.put("Baby", null);
        map5.put("Cat", "Cat");
        //map5.put("Eat", new Long(56));
        //map5.put("Food", new Character('3')); //  Эти две строки в моем компилятори дают ошибки может быть в вашей айди будут работать.
        map5.put("Gevey", '6');
        map5.put("Hugs", 111111111111L);
        map5.put("Comp", (double) 123);
        for(Map.Entry<String,Object> entry: map5.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
