public class HomeTask extends  Exception {
//task1 - это первое задание. Кажется, выполнил
    public static void task1(String[][] arr) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int columns = arr[i].length;
                if (arr.length != 4 || columns != 4) {
                    throw new ArrayIndexOutOfBoundsException(); 
                }
            }
        }
    }

    public static void task2(String[][] arr) throws IllegalArgumentException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 int x = Integer.parseInt(arr[i][j]);
                 sum = sum + x; // как просуммировать все столбцы массива?
             }
             System.out.println(sum);
        }
    }
}
