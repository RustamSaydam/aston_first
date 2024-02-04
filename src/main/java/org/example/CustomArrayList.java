package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomArrayList<E> implements ArrayInterface<E> {

    // Поле для хранения элементов списка
    private E[] values;

    // Поле для хранения текущего размера списка
    private  int size = 0;


    /** Конструктор класса CustomArrayList.
     * Создает новый список с начальным размером 0. */
    public CustomArrayList() {
        values = (E[]) new Object[0];
    }


    /** Метод add добавляет элемент в указанную позицию списка..
     @param e элемент, который нужно добавить
     @return true, если элемент успешно добавлен, иначе false
     */

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }


    /** Метод add добавляет элемент в указанную позицию списка.
     /  @param index позиция, в которую нужно добавить элемент
     /  @param e элемент, который нужно добавить
     */

    @Override
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: "+index+", Size: " + size);
        }
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            System.arraycopy(values, index, values, index + 1, size - index);
            values[index] = e;
            size++;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }


    /** Метод remove удаляет элемент из списка по указанной позиции.
        @param index позиция, из которой нужно удалить элемент
     */

    @Override
    public void remove(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1,
                    values, index, amountElemAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }


    }


    /** Метод clear удаляет все элементы из коллекции
     и делает их null
     */
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            values[i] = null;
        }
        size = 0;
    }


    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}

