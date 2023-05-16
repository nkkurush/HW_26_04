package HW_26_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*1

        1. Создай список строк.
        2. Добавь в него 5 различных строк.
        3. Выведи его размер на экран.
        4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
        ArrayList<String> list = new ArrayList<>();
        list.add("fwerf werwer");
        list.add("wegrwergwergwer g erg ewr gwe r");
        list.add("wrgwergwergwergewr gerg  wer gwe r");
        list.add("wrgwrgw srvwervg erg werg");
        list.add("werg werg wer g werg");
        System.out.println("Task 1");
        System.out.println(list.size());
        for(String ls:list){
            System.out.println(ls);
        }

  /*      2
        1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую длинную строку в списке.
        4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/
        System.out.println("Task 2 "+" Task 3");
        System.out.println("Решил не переписать код нужно только немного измений");
        ArrayList<String> list2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int mx=0,mn=99999999;
        for(int i=0; i<5; i++){
            list2.add(sc.nextLine());
            if(mx<list2.get(i).length()){
                mx = list2.get(i).length();
            }
            if(mn>list2.get(i).length()){
                mn = list2.get(i).length();
            }
        }
        for(int i=0; i<5; i++){
            if(mx==list2.get(i).length()){
                System.out.println("Самая длинная строка равно " + list2.get(i));
            }
            if(mn==list2.get(i).length()){
                System.out.println("Самая короткая строка ровно " + list2.get(i));
            }
        }


  /*      3
        1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую короткую строку в списке.
        4. Выведи найденную строку на экран.
        5. Если таких строк несколько, выведи каждую с новой строки.
*/

  /*      4

        1. Создай список строк в методе main.
        2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
        3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
        System.out.println("Task 4");
        Deque<String> ls3 = new ArrayDeque<>();
        //List<String> ls = new ArrayList<>();
        int n=10;
        while(n!=0){
            n--;
            ls3.addFirst(sc.nextLine());
        }
        for(String l: ls3){
            System.out.println(l);
        }
       /* 5
        1. Создай список строк.
        2. Добавь в него 5 строк с клавиатуры.
        3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
        4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
*/
        System.out.println("Task 5");
        LinkedList<String> ls4 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            ls4.add(sc.nextLine());
        }
        int k=13,j=0;
        while (k!=0) {
            k--;
            j++;
            String s = ls4.getLast();
            ls4.removeLast();
            ls4.addFirst(s);
            System.out.println("Список " + j);
            for(String ls: ls4){
                System.out.println(ls);
            }
        }
  /*      6
        1. Создай список строк.
        2. Добавь в него 10 строчек с клавиатуры.
        3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
                Если таких строк несколько, то должны быть учтены самые первые из них.
        4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/
        System.out.println("Task 6");
        ArrayList<String> list5 = new ArrayList<>();
        int mx2=0,mn2=99999999;
        for(int i=0; i<10; i++){
            list5.add(sc.nextLine());
            if(mx2<list5.get(i).length()){
                mx2 = list5.get(i).length();
            }
            if(mn2>list5.get(i).length()){
                mn2 = list5.get(i).length();
            }
        }
        boolean t=true,f=true;
        int l=0,r=0;
        for(int i=0; i<10; i++){
            if(mx2==list5.get(i).length() && t==true){
                l=i;
                t=false;
            }
            if(mn2==list5.get(i).length() && f==true){
                r=i;
                f=false;
            }
        }
        if(l<r){
            System.out.println(list5.get(l));
        }
        else{
            System.out.println(list5.get(r));
        }
  /*      7

        1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
        Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
                Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
                Порядок объявления списков очень важен.
        1.1 Создай метод printList
        2. Метод printList должен выводить на экран все элементы списка с новой строки.
        3. Используя метод printList выведи эти три списка на экран.
                Сначала тот, который для x%3, потом тот, который для x%2, потом последний.*/
        System.out.println("Task 7");
        ArrayList<Integer> list6 = new ArrayList<>();
        ArrayList<Integer> list6_2 = new ArrayList<>();
        ArrayList<Integer> list6_3 = new ArrayList<>();
        ArrayList<Integer> list_ostatok = new ArrayList<>();
        boolean g=true;
        for (int i = 0; i < 20; i++) {
            list6.add(sc.nextInt());
            if(list6.get(i)%2==0){
                list6_2.add(list6.get(i));
                g=false;
            }
            if(list6.get(i)%3==0){
                list6_3.add(list6.get(i));
            }
            else if(g==true){
                list_ostatok.add(list6.get(i));
            }
            g=true;
        }
        //System.out.println(list6_2);
        //System.out.println(list6_3);
        printlist(list6_3);
        printlist(list6_2);
        printlist(list_ostatok);
    }
    public static void printlist(ArrayList<Integer> list){
        System.out.println(list);
    }
}
