public class Homework61_70 {
    public static void main(String[] args) {

        //Task 61
        int x = 4215;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        d = x / 1000 % 10;

        boolean t = a + b == c + d;
        System.out.println("t = " + t);

        //Task 62
        x = 5823;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        int p = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        d = x / 1000 % 10;
        if (x < 5000) {
            p = x / (a + c);
        } else {
            p = x / (b + d);
        }
        System.out.println("p = " + p);

        //Task 63
        x = 8301;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        int q = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        d = x / 1000 % 10;
        if (a == 1 || b == 1 || c == 1 || d == 1) {
            q = 1;
        } else {
            q = 0;
        }
        System.out.println("q = " + q);

        //Task 64
        x = 8914;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        int s = 456;
        int ss = 789;
        int y = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        d = x / 1000 % 10;
        if (a + b == 5) {
            y = s;
        } else {
            y = ss;
        }
        System.out.println("y = " + y);

        //Task 65
        x = 2443;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        int l = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        d = x / 1000 % 10;
        if (a * b == 12) {
            l = 12;
        } else {
            l = 0;
        }
        System.out.println("l = " + l);

        //Task 66
        x = 4024;
        a = 0;
        b = 0;
        c = 0;
        d = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        d = x / 1000 % 10;
        if (a == 4 && d == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        //Task 67
        x = 5823;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        int gg = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        d = x / 1000 % 10;
        if (x == (a + b + c + d) * (a + b + c + d)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        //Task 68
        x = 4825;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        int v = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        d = x / 1000 % 10;
        if (a > b) {
            v = a * c;
        } else {
            v = 1;
        }
        System.out.println("v = " + v);

        //Task 69
        x = 8640;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        int e = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        d = x / 1000 % 10;
        if (a + b + c + d > 20) {
            e = 1;
        } else {
            e = 0;
        }
        System.out.println("e = " + e);

        //Task 70
        x = 2398;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        int u = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        d = x / 1000 % 10;
        if (a * b * c * d > 200) {
            u = 1;
        } else {
            u = 0;
        }
        System.out.println("u = " + u);
    }
}

