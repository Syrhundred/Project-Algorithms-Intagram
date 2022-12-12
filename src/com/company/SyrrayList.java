package com.company;

import java.util.Arrays;

public class SyrrayList<T> {
    private T[] list;
    private int size;
    private final int default_capacity = 10;

    public SyrrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity <= 0");
        } else {
            list = (T[]) new Object[capacity];
        }
    }

    public SyrrayList() {
        list = (T[]) new Object[default_capacity];
    }

    public void add(T item) {
        // толған, толмағанына тексеру , толып жатса ауыстырамыз capacity * 2

        list[size++] = item;
    }

    public void removeInd(int index) {
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
        size--;
    }

    public int size(){
        return size;
    }

    public void removeElem(T item) {
        int position = index(item);

        if (position < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            removeInd(position);
        }
    }

    public boolean contains(T item) {
        if (item == null)
            return false;
        for (int i = 0; i < size; i++) {
            if (item.equals(list[i])) {
                return true;
            }
        }
        return false;
    }

    private int index(T item) {
        if (item == null)
            return -1;
        for (int i = 0; i < size; i++) {
            if (item.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    public T get(int index) {
        //index-ты тексеру керек
        if (index > -1 && size != 0 && index < size)
            return list[index];
        else
            throw new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }
}
