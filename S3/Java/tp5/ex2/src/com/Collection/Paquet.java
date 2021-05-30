package com.Collection;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public  class Paquet<T> implements Iterable<T>{

//    Object[] elements = (T[]) new Object[50];

   T[] elements = (T[]) new Object[50];
    int  sizeofPaq;
    public Paquet(int i, int i1){}

    public Paquet(T[] elements) {
        this.elements = Arrays.copyOf(elements,elements.length);
        this.elements = elements;
    }
    public void add(T e){
        this.elements[sizeofPaq++]=e;

    }

    @Override
    public String toString() {
        return "Paquet{" + "elements= " + Arrays.toString(elements) + '}';
    }

    @Override
    public Iterator<T> iterator() {


        return new Iterator<T>() {
            int cur=-1;
            @Override
            public boolean hasNext() {
                return ++cur<sizeofPaq;
            }

            @Override
            public T next() {
                return elements[cur];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("remove");
            }


        };
    }
}
