public class Home211_220 {
    public static void main(String[] args) {

        //Task 211
        int[] arr = {15, 48, 164, 285, -306, 980, -100};
        int y = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (x > 0) {
                count++;
                y = y + x;
            }
        }
        System.out.println(y / count);

        //Task 215
        int[] array = {10, 5, 54, 845, 1002, 568};
        int z = 0;
        for (int i = 0; i < array.length; i += 2) {
            int x = array[i];
            z = z + x;
        }
        System.out.println(z);

        //Task 216
        int[] arra = {10, 5, 54, 845, 1002, 568};
        int s = 1;
        for (int i = 0; i < arra.length; i += 2) {
            int x = arra[i];
            s = s * x;
        }
        System.out.println(s);

        //Task 217
        int[] ar = {24, 3, 10, 54, 80, 10, 104, 2};
        int m = 1;
        for (int i = 0; i < ar.length; i++) {
            int x = ar[i];
            if (i % 2 == 1) {
                m = m * (x * x);
            }
        }
        System.out.println(m);

//        //Task 219
//        ասում ա բազմապատիկ ինդեքս ունեցող տարրերի քանակը, բայց առաջին ինդեքսը 0 ա, որի վրա չի բաժանվում;
//        int[] newArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int n = 0;
//        int k = 20;
//        for (int i = 0; i < newArr.length; i++) {
//            if (k % i == 0) {
//                n++;
//            }
//        }
//        System.out.println(n);

        //Task 220
        int[] newArr = {10, 20, 30, 40, -10, -20, -30};
        int countt = 0;
        int counttt = 0;
        for (int i = 0; i < newArr.length; i++) {
            int x = newArr[i];
            if (x > 0) {
                countt++;
            } else if (x < 0) {
                counttt++;
            }
        }
        System.out.println("Drakan = " + countt);
        System.out.println("Bacasakan = " + counttt);

    }
}
