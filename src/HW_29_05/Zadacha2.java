package HW_29_05;

import java.util.HashSet;
import java.util.Set;

public class Zadacha2 {
    public static class Cat{

    }
    public static class Dog{}
    public static void main(String[] args) {
  /*      2
        Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
        2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
        3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
        4. Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
        5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
        6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
                Каждое животное с новой строки.
*/
        //Множество всех животных
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }
    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> set = new HashSet<Object>();
        set.addAll(cats);
        set.addAll(dogs);
        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object s: pets) {
            System.out.println(s);
        }
    }

    //напишите тут ваш код
}

