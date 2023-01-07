public class Main { // ошибка - satietyTime (сытность) всегда уходит в минус и не восстанавливается. Почему?

    static int Time = 1; // вопрос - почему Time только static? иначе выдаёт ошибку

    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Max", 15);
        cat[1] = new Cat("Barsik", 10);
        cat[2] = new Cat("Boris", 5);

        Plate plate = new Plate(15); // как сделать так, чтобы массив котов ел каждый из своей миски? Map мы ещё не проходили в тот момент

        System.out.println("У нас есть 3 кота: " + cat[0].name + ", " + cat[1].name + ", " + cat[2].name +
                "\n Они все хотят жрать, у каждого есть свой аппетит");

            for (Cat o : cat) {
                if (o.satiety == false) {
                    if (!plate.checkFood(o.getAppetite())) { // почему вместо ! нельзя написать == false? выдаёт ошибку
                        plate.increaseFood();
                    }
                    o.eat(plate);
                    System.out.println("Кот " + o.getName() + " съел " + o.getAppetite() + " граммов корма и лежит " +
                            "сытый и довольный");
                }
            }
    }
}

