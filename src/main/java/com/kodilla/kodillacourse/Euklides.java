public class Euklides {
    static int nwd(int a, int b) {
        while (a != b)
            if (a > b)
                a -= b;
            else
                b -= a;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(nwd(256, 1024));
        System.out.println(nwd(230, 135));
        System.out.println(nwd(45, 81));
    }
}