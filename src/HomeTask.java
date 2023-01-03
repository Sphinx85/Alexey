public class HomeTask extends  Exception {

    public static void task1(String[][] arr) throws ArrayIndexOutOfBoundsException {
        int rows = arr.length;
        int columns = arr[0].length;
        if (rows != 4 || columns != 4) {
            throw new ArrayIndexOutOfBoundsException(); // здесь он НЕ пробрасывает исключение и идёт дальше. Почему?
        } else System.out.println("Исключений нет"); // эту строку он выдает, хотя не должен, т.к. исключение есть. Почему?
    }

    public static void task2(String[][] arr) throws IllegalArgumentException {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    int x = Integer.parseInt(arr[i][j]);// как их просуммировать?
                    System.out.println(x);
                }
            }
    }
}
