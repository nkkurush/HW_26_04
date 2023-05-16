package HW_11_05;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        /*1

        Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/
        System.out.println("Task 1");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(sc.next());
        }
        list.remove(2);
        Collections.reverse(list);
        System.out.println(list);
        /*2

        1. Создай список из слов "мама", "мыла", "раму".
        2. После каждого слова вставь в список строку, содержащую слово "именно".
        3. Вывести результат на экран, каждый элемент списка с новой строки.
*/
        System.out.println("Task 2");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"мама","мыла","раму");
        for(int i=0; i<=2; i++) {
            list2.add(2*i+1,"именно");
        }
        System.out.println(list2);
  /*      3

        1. Создай список слов, заполни его самостоятельно.
        2. Метод fix должен:
        2.1. удалять из списка строк все слова, содержащие букву "р"
        2.2. удваивать все слова содержащие букву "л".
        2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
        2.4. с другими словами ничего не делать.

        public static void main(String[] args) {
            ArrayList<String> strings = new ArrayList<String>();
            strings.add("роза");
            strings.add("лоза");
            strings.add("лира");
            strings = fix(strings);

            for (String string : strings) {
                System.out.println(string);
            }
        }

        public static ArrayList<String> fix(ArrayList<String> strings) {
            //напишите тут ваш код
            return null;
        }
*/
        System.out.println("Task 3");
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
  /*      4

        1. Введи с клавиатуры 10 слов в список строк.

        2. Метод doubleValues должен удваивать слова по принципу:
        "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"

        3. Выведи результат на экран, каждое значение с новой строки.
*/
        System.out.println("Task 4");
        ArrayList<String> list3 = new ArrayList<>();
        for(int i=0; i<10; i++){
            list3.add(sc.next());
        }
        list3 = doubleValues(list3);
        for(String ls: list3){
            System.out.println(ls);
        }

  /*      5

        1. Введи с клавиатуры 10 слов в список строк.
        2. Определить, является ли список упорядоченным по возрастанию длины строки.
        3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.*/
        System.out.println("Task 5");
        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<Integer>list4_4 = new ArrayList<>();
        ArrayList<Integer>list4_5 = new ArrayList<>();
        for(int i=0; i<9; i++){
            list4.add(sc.next());
            list4_4.add(list4.get(i).length());
        }
        list4_5.addAll(list4_4);
        Collections.sort(list4_4);
        if(list4_5==list4_4){
            System.out.println("Список в соротированном порядке");
        }
        else{
            System.out.println("Список не отсортирован");
            for(int i=0; i<list4_5.size()-1; i++){
                if(list4_5.get(i)>list4_5.get(i+1)){
                    System.out.println(list4.get(i+1));
                    break;
                }
            }
        }
    }
    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i=0; i<strings.size(); i++){
            if(strings.get(i).contains("р") && !strings.get(i).contains("л")){
                strings.remove(i);
            }
            if(!strings.get(i).contains("р") && strings.get(i).contains("л")){
                String s=strings.get(i) + strings.get(i);
                strings.remove(i);
                strings.add(i,s);
            }
        }
        return strings;
    }
    public static ArrayList<String> doubleValues(ArrayList<String> strings){
        strings.add(0,strings.get(0));
        for(int i=0; i<=9; i++){
            strings.add(2*i+1,strings.get(2*i+1));
        }
        strings.remove(0);
        return strings;
    }
}
