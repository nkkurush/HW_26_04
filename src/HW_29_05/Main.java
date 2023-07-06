package HW_29_05;
/*1



        Ввести с клавиатуры число N.
        2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
        3. Найти минимальное число среди элементов списка - метод getMinimum.
*//*
Минимальное из N чисел
*//*

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        return 0;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        return null;
    }
}



2



        Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
        2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
        3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
        4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
        5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
        6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
        Каждое животное с новой строки.



*//*
Множество всех животных
*//*

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        return null;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        return null;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
    }

    //напишите тут ваш код
}



3

        Инициализируй поле wheels используя данные из loadWheelNamesFromDB.
        Выкинь исключение в случае некорректных данных.

        Подсказка: если что-то не то с колесами, то это не машина!
        Сигнатуры не менять

*//*
Машину на СТО не повезем!
*//*

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            //init wheels here
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}*/
public class Main {
    public static void main(String[] args) {
        /*Season winter = Season.WINTER;
        switch (winter) {
            case AUTUMN -> System.out.println(winter.getNumberOfSeason());
            case WINTER -> System.out.println(winter.getNumberOfSeason());
            case SPRING -> System.out.println(winter.getNumberOfSeason());
            case SUMMER -> System.out.println(winter.getNumberOfSeason());
        }*/
    }
}
