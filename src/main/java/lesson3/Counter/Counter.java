package lesson3.Counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    Lock lock = new ReentrantLock();
    int count = 0;

    public void increment() {
        lock.lock();
            try {
                for (int i = count; i < 100 ; i++) {
                    count++;
                    System.out.println(count);
                }
            }finally {
                count = 0;
                lock.unlock();
            }
        }


    public static void main(String[] args) {
        Counter counter = new Counter();
        new Thread(() -> counter.increment()).start();
        new Thread(() -> counter.increment()).start();

    }
}
