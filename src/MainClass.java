public class MainClass {
    public static void main(String[] args) {

        Task2 phoneBook = new Task2();

        phoneBook.add("Иванов", "8999123321");
        phoneBook.add("Иванов", "8912155326");
        phoneBook.add("Петров", "8917155552");
        phoneBook.add("Петров", "8913455672");
        phoneBook.add("Иванов", "899999999");
        phoneBook.add("Сидоров", "899111111");
        phoneBook.add("Петров", "89923231999");
        phoneBook.add("Козлов", "8888123113");
        phoneBook.add("Сидоров", "8324325234");

        System.out.println("Иванов(ы): " + phoneBook.get("Иванов"));
        System.out.println("Сидоров(ы): " + phoneBook.get("Сидоров"));
        System.out.println("Петров(ы): " + phoneBook.get("Петров"));
        System.out.println("Козлов(ы) :" + phoneBook.get("Козлов"));

    }
}
