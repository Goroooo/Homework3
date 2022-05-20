public class Home151_166 {
    public static void main(String[] args) {

        //Task 151
        int[] arr = {15, -27, 68, 6, 20, -30};
        int n = 300;
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (n % a == 0) {
                x = x + a;
            }
        }
        System.out.println(x);

        //Task 152
        int[] array = {15, -27, 68, 6, 20, -30};
        n = 300;
        x = 1;
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (n % a == 0) {
                x = x * a;
            }
        }
        System.out.println(x);

        //Task 153
        int[] ar = {15, -27, 68, 200, 298, -30, 45, 149};
        n = 300;
        x = 0;
        for (int i = 0; i < ar.length; i++) {
            int a = ar[i];
            if (n % a == 2) {
                x = x + a;
            }
        }
        System.out.println(x);

        //Task 154
        int[] ara = {15, -27, 68, 6, 20, -30, 297};
        n = 300;
        x = 1;
        for (int i = 0; i < ara.length; i++) {
            int a = ara[i];
            if (n % a == 3) {
                x = x * a;
            }
        }
        System.out.println(x);

        //Task 155
        int[] aram = {15, -27, 68, 200, 298, -30, 45, 150};
        x = 0;
        for (int i = 0; i < aram.length; i++) {
            int a = aram[i];
            if (a / 100 == 0 && a % 3 == 0) {
                x = x + a;
            }
        }
        System.out.println(x);

        //Task 156
        int[] ary = {15, -27, 68, 200, 298, -30, 45, 150};
        x = 1;
        for (int i = 0; i < ary.length; i++) {
            int a = ary[i];
            if (a / 100 == 0 && a % 3 == 0 && a % 5 == 0) {
                x = x * a;
            }
        }
        System.out.println(x);

        //Task 157
        int[] newAr = {15, -27, 68, 174, 298, 762, 45, 150, 1001};
        x = 0;
        for (int i = 0; i < newAr.length; i++) {
            int a = newAr[i];
            if (a > 99 && a < 1000 && a % 5 != 0) {
                x = x + a;
            }
        }
        System.out.println(x);

        //Task 158
        int[] newAra = {251, -27, 68, 175, 298, 762, 45, 150, 1001};
        x = 1;
        for (int i = 0; i < newAra.length; i++) {
            int a = newAra[i];
            if (a > 99 && a < 1000 && a % 3 != 0 && a % 2 != 0) {
                x = x * a;
            }
        }
        System.out.println(x);

        //Task 159
        int[] newArr = {251, 388, 68, 175, 298, 762, 45, 458, 1001};
        x = 1;
        for (int i = 0; i < newArr.length; i++) {
            int a = newArr[i];
            if (a > 99 && a < 1000 && a % 3 == 1 && a % 4 == 2) {
                x = x * a;
            }
        }
        System.out.println(x);

        //Task 160
        int[] newArray = {251, -27, 68, 175, 298, 762, 45, 150, 1001};
        x = 1;
        for (int i = 0; i < newArray.length; i++) {
            int a = newArray[i];
            if (a > 99 && a < 1000 && a % 3 != 0 && a % 2 != 0) {
                x = x * a;
            }
        }
        System.out.println(x);
    }
}