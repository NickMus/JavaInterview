package lesson3.PingPong;

public class PingPong {

    public synchronized void ping() {
        while (!Thread.interrupted()) {
            try {
                System.out.println("ping");
                this.notifyAll();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public synchronized void pong() {
        while (!Thread.interrupted()) {
            try {
                System.out.println("pong");
                this.notifyAll();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        PingPong pingPong = new PingPong();

        new Thread(() -> pingPong.ping()).start();
        new Thread(() -> pingPong.pong()).start();
    }
}
