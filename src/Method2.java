public class Method2 {

    // Вопрос - как можно сделать так, чтобы Sync метод работал только 1 раз?
    // Вопрос - как сделать дз по-другому? Написав несколько отдельных методов и синхронизировав их между собой

    private Object lock1 = new Object();
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        Method2 m2 = new Method2();
        new Thread(() -> m2.Task2()).start();
        new Thread(() -> m2.Task2()).start();
    }
    public void Task2() {
        float[] arr = new float[size];
        float[] arr2 = new float[h];
        float[] arr3 = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1; // заполняем массив единицами
        }
        long before1 = System.currentTimeMillis();
        System.out.println("Время старта замера: " + before1);
        System.arraycopy(arr, 0, arr2, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        synchronized (lock1) {
            System.out.println("Sync block started");
            System.arraycopy(arr2, 0, arr3, 0, h);
            System.arraycopy(arr2, 0, arr3, h, h);
            long after1 = System.currentTimeMillis();
            System.out.println("Время завершения замера: " + after1);
            System.out.println("Программа посчитала за: " + (after1 - before1));
        }

    }

}
