package HW_15_05;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
        Удалить из множества все числа больше 10.

        Требования:
•    Программа не должна выводить текст на экран.
•    Программа не должна считывать значения с клавиатуры.
•    Класс Solution должен содержать только три метода.
•    Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
•    Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.*/
public class Main {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<20; i++){
            set.add(i+1);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        for(int i:set){
            if(i>10){
                set.remove(i);
            }
        }
        return set;
    }
    public static void main(String[] args) {
       // removeAllNumbersGreaterThan10(createSet());
    }
}
