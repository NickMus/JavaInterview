package lesson3.List;

import java.util.Iterator;

public class List<T> implements Iterable<T> {

    ListItem<T> head;
    ListItem<T> tail;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            ListItem<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }


    private static class ListItem<T> {
        T data;
        ListItem<T> next;
    }


    public boolean isEmpty() {
        return head == null;
    }

    public void add(T data) {
        ListItem<T> listItem = new ListItem<>();
        listItem.data = data;
        if (isEmpty()) {
            head = listItem;
        } else {
            tail.next = listItem;
        }
        tail = listItem;
    }

    public void reverse() {
        if (!isEmpty() && head.next != null) {
            tail = head;
            ListItem<T> current = head.next;
            head.next = null;
            while (current != null) {
                ListItem<T> next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        }
    }

    public static void main(String[] args) {
        List<Person> list = new List();
        list.add(new Person("bob", "20"));
        list.add(new Person("mike", "20"));

        for (Person p : list) {
            System.out.println(p);
        }
        System.out.println("=============================");
        list.reverse();
        for(Person p1 : list) {
            System.out.println(p1);
        }
        }
    }

