package binOps;

public class BinOps {

    public String sum(String a, String b) {
        int x = Integer.parseInt(a,2);
        int y = Integer.parseInt(b, 2);
        System.out.println("yours a = " + x);
        System.out.println("yours b = " + y);
        int result = x + y;
        System.out.println("result = " + result);
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int x = Integer.parseInt(a,2);
        int y = Integer.parseInt(b, 2);
        System.out.println("yours a = " + x);
        System.out.println("yours b = " + y);
        int result = x * y;
        System.out.println("result = " + result);
        return Integer.toBinaryString(result);
    }
}
