package org.example;

public interface ArrayInterface<E> extends Iterable<E> {

    /** Добавляет элемент в конец массива */
    boolean add(E e);

    /** Добавляет элемент по индексу */

    void add(int index, E e);

    /** Удаляет элемент по индексу */
    void remove(int index);

    /** Очищает всю коллекцию */
    void clear();

    /** Получает элемент по индексу */
    E get(int index);

    /** Получает размер коллекции */
    int size();

}
