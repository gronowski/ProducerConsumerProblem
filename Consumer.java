/**
 * Created with IntelliJ IDEA.
 * User: Terence
 * Date: 13.11.13
 * Time: 10:09
 * To change this template use File | Settings | File Templates.
 */
class Consumer extends Thread {
    private CubbyHole cubbyhole;
    private int number;
    public Consumer(CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }
    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubbyhole.get();
            System.out.println("Consumer #"
                    + this.number
                    + " got: " + value);
        }
    }
}
