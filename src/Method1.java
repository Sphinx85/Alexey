public class Method1 {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        Method1 m1 = new Method1();
        new Thread(() -> m1.Task1()).start();

    }

    public void Task1() {
        float[] arr = new float[size];
        float[] arr2 = new float[h];
        float[] arr3 = new float[h];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1; // заполняем массив единицами
        }
        System.arraycopy(arr, 0, arr2, 0, h);
        System.arraycopy(arr, h, arr3, 0, h);
        long before1 = System.currentTimeMillis();
        System.out.println("Время старта замера: " + before1);

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (float) (arr3[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long after1 = System.currentTimeMillis();
        System.out.println("Время завершения замера: " + after1);
        System.out.println("Программа посчитала за: " + (after1 - before1));

        float arr4[] = new float[size];
        System.arraycopy(arr2, 0, arr4, 0, h);
        System.arraycopy(arr3, 0, arr4, h, h);

    }
}

