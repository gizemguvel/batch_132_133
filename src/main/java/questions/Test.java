package questions;

public abstract class Test extends Ab01 {

    int b = 10;
    Test() {
        b = super.b; }
    void getNumber(int x, int y) {
        int i = x * y + b;
        System.out.print(i); }
    public static void main(String[] args) {
        }
}

