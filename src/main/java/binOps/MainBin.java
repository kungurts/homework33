package binOps;

public class MainBin {
    public static void main(String[] args) {
        String a = "10011";
        String b = "111";
        BinOps bin = new BinOps();

        System.out.println(bin.sum(a, b));
        System.out.println(bin.mult(a, b));
    }
}
