package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    @Test
    void testAddElement()  {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("Rustam Saidam");
        list.add("Freddy Mercury");
        list.add("Till Lindemann");
        assertEquals(3, list.size());
        assertEquals("Rustam Saidam", list.get(0));
        assertEquals("Freddy Mercury", list.get(1)); // когда несколько ассертов их надо пихать в assertA;;
        assertEquals("Till Lindemann", list.get(2));


    }

    @Test
    void testAddToIndex() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add(0,"Rustam Saidam");
        list.add(1,"Freddy Mercury");
        list.add(2,"Till Lindemann");
        assertEquals(3, list.size());
        assertEquals("Rustam Saidam", list.get(0));
        assertEquals("Freddy Mercury", list.get(1));
        assertEquals("Till Lindemann", list.get(2));

    }

    @Test
    void testRemove() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("Rustam Saidam");
        list.add("Harry Potter");
        list.add("Dart Vader");
        list.remove(2);
        assertEquals(2, list.size());
        assertEquals("Harry Potter", list.get(1));
        assertEquals("Rustam Saidam", list.get(0));
    }

    @Test
    void testClear() {
        CustomArrayList<Integer> list = new CustomArrayList<>(); //Дописать лучше тестить на одном дженерике и инициализировать его в поле теста чтобы мбыло меньше дубликатов
        list.clear();
        Assertions.assertEquals(0, list.size());
    }

    @Test
    void get() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("Rustam Saidam");
        list.add("Harry Potter");
        list.add("Dart Vader");
        assertEquals("Harry Potter", list.get(1));
    }

    @Test
    void size() { // прочитай про конвенции нейминга тестов
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("Rustam Saidam");
        list.add("Harry Potter");
        list.add("Dart Vader");
        assertEquals(3,list.size());

    }

}