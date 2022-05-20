public class Homework3 {
    public static void main(String[] args) {


        //Task 51
        int x = 426;
        int a = 0, b = 0, c = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;

        boolean t = b + c == a;
        System.out.println(t);

        //Task 52
        x = 224;
        a = 0;
        b = 0;
        c = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        boolean tt = b == a || b == c || a == c;
        System.out.println(tt);

        //Task 53
        int k = 20;
        int r = 0;
        x = 240;
        a = 0;
        b = 0;
        c = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        if (x > k) {
            r = x / (a + b + c);
        } else {
            r = a / x;
        }
        System.out.println(r);

        //Task 54
        x = 286;
        a = 0;
        b = 0;
        c = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        }

        //Task 55
        x = 915;
        a = 0;
        b = 0;
        c = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else if (c < a && c < b) {
            System.out.println(c);
        }

        //Task 56
        int w = 0;
        x = 886;
        a = 0;
        b = 0;
        c = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        if (a > b) {
            w = (a + b + c) / x;
            System.out.println(w);
        } else {
            System.out.println(x);
        }

        //Task57
        x = 982;
        int g = 0;
        a = 0;
        b = 0;
        c = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        if (x > 300) {
            g = b / a;
        } else {
            g = c / a;
        }
        System.out.println(g);

        //Task 58
        x = 763;
        int f = 0;
        a = 0;
        b = 0;
        c = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        if (b + c < 5) {
            f = a;
        } else {
            f = b;
        }
        System.out.println(f);

        //Task 59
        x = 869;
        a = 0;
        b = 0;
        c = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (c < a) {
            System.out.println(c + " " + a + " " + b);
        } else if (b > c) {
            System.out.println(a + " " + c + " " + b);
        } else {
            System.out.println(a + " " + b + " " + c);
        }

        //Task 60
        x = 869;
        a = 0;
        b = 0;
        c = 0;

        a = x % 10;
        b = x / 10 % 10;
        c = x / 100 % 10;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (c > a) {
            System.out.println(c + " " + a + " " + b);
        } else if (b < c) {
            System.out.println(a + " " + c + " " + b);
        } else {
            System.out.println(a + " " + b + " " + c);
        }

    }
}

