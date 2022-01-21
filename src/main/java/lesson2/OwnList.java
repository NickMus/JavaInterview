package lesson2;


import java.util.Arrays;

public class OwnList<T> {
    private static final int SIZE = 8;
    private int pointer = 0;

    public int getPointer() {
        return pointer;
    }

    Object[] myList = new Object[SIZE];

    public void add(T type) {
        groveSize();
        myList[pointer++] = type;

    }

    public void add(T type, int element) {
        groveSize();
        Object[] array = new Object[myList.length];
        System.arraycopy(myList, 0, array, 0, myList.length);
        myList[element] = type;
        pointer++;
        for (int i = element; i < pointer; i++) {
            myList[i + 1] = array[i];
        }
    }

    public int size() {
        return pointer;
    }

    public void groveSize() {
        size();
        if (size() == (SIZE - 1)) {
            Object[] myNewList = new Object[SIZE * 2];
            System.arraycopy(myList, 0, myNewList, 0, myList.length);
            myList = myNewList;
        }
    }

    public void remove(int element) {
        for (int i = element; i < pointer; i++) {
            myList[i] = myList[i + 1];
            myList[pointer] = null;
        }
        pointer--;
        if (pointer <= 7) {
            Object[] array = new Object[SIZE];
            System.arraycopy(myList, 0, array, 0, pointer);
            myList = array;
        }
    }

    public Object get(int element) {
        Object returnValue = null;
        for (int i = element; i < pointer; i++) {
            returnValue = myList[element];
        }
        return returnValue;
    }

    public Object previous(int element) {
        Object returnValue = null;
        if (element<= pointer && element != 0) {
        for (int i = 0; i < element; i++) {
            returnValue = myList[element - 1];
        }
        } else {
            System.out.println("Hasn't previous element");
        }
        return returnValue;
    }

    public Object next(int element) {
        Object returnValue = null;
        if (element <= pointer) {
            for (int i = element; i < pointer; i++) {
                returnValue = myList[element + 1];
            }
        }else {
            System.out.println("Hasn't next element");
        }
        return returnValue != null;
    }


    @Override
    public String toString() {
        return "OwnList{" +
                "myList=" + Arrays.toString(myList) +
                '}';
    }
}
