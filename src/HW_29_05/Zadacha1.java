package HW_29_05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadacha1 {
  /*  Ввести с клавиатуры число N.
        2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
            3. Найти минимальное число среди элементов списка - метод getMinimum.
            *//*
    Минимальное из N чисел
*/
        public static void main(String[] args) throws Exception {
            List<Integer> integerList = getIntegerList();
            System.out.println(getMinimum(integerList));
        }

        public static int getMinimum(List<Integer> array) {
            int mn = 99999999;
            for(int i=0; i<array.size(); i++){
                if(mn>array.get(i)){
                    mn = array.get(i);
                }
            }
            return mn;
        }

        public static List<Integer> getIntegerList() throws IOException {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            List<Integer>list = new ArrayList<>();
            for(int i=0; i<n; i++){
                list.add(sc.nextInt());
            }
            return list;
        }
}