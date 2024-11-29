public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7(3);
        task7(6);
        task7(7);
        task8(99);

        System.out.println("Я не поняв як робити 4 завдання");
        System.out.println("Я не поняв як робити 4 завдання");
        System.out.println("Я не поняв як робити 4 завдання");
    }

    public static void task1() {
        int[] msv = {5, 3, 4, 34, 54, 3, 23, 4, 6, 5};
        System.out.println(findMax(msv));
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void task2() {
        int[] mas = {5, -3, -2, 16, 55, 0};
        int res = mas[0] + mas[3] + mas[4];
        System.out.println(res);
    }

    public static void task3() {
        int[] arr = {1, -3, 4, -2};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }

    public static void task4() {
        int[] array = {5, 3, 4, 34, 54, 3, 23, 4, 6, 5};
        int number = 34;
        int index = findIndex(array, number);

        if (index != -1) {
            System.out.println("Індекс першого входження числа " + number + ": " + index);
        } else {
            System.out.println("Число " + number + " відсутнє у масиві.");
        }
    }

    // Метод для пошуку індексу першого входження числа
    public static int findIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static void task5() {
        int[] jje = {5, 34, 45, 2, 4, 6, 8};
        int suma = 0;
        for (int i = 0; i < jje.length; i++) {
            suma += jje[i];
        }
        System.out.println(suma / jje.length);
    }

    public static void task6() {
        int[] jje = {5, 34, 45, 2, 4, 6, 8};
        int min = findMin(jje);
        int max = findMax(jje);
        System.out.println(max - min);
    }

    private static void task7(int n) {
        int o = 0;
        if (n <= 1) {
            System.out.println("Складне");
            return;
        }

        for (int c = 2; c < n; c++) {
            if (n % c == 0) {
                o = 1;
                break;
            }
        }

        if (o == 0) {
            System.out.println("Просте");
        } else {
            System.out.println("Складне");
        }
    }

    public static void task8(int N) {
        for (int i = N; i >= 1; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}