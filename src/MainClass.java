public class MainClass {
    public static void main(String[] args) {

        String [][] arr = new String[][]{
                {"1", "2", "3", "43"},
                {"1", "22", "3", "4"},
                {"1", "215", "3", "4"},
                {"1", "2", "3", "o", "e"}
        };

        HomeTask.task1(arr);
        System.out.println("__________________________");
        HomeTask.task1(arr);

        try {
            HomeTask.task1(arr);
            HomeTask.task2(arr);
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }
    }

}

//1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4, при подаче массива другого
// размера необходимо бросить исключение MyArraySizeException.
//
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException (IllegalArgumentException) – с детализацией, в какой именно ячейке
// лежат неверные данные.
// (весь код с преобразованиями обернуть в try - catch, подсказка)
//
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и
// MyArrayDataException и вывести результат расчета.



