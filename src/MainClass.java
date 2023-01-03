public class MainClass {
    // ошибка - satietyTime (сытность) всегда уходит в минус и не восстанавливается. Почему?

        static int Time = 0; // вопрос - почему Time только static? иначе выдаёт ошибку

        public static void main(String[] args) {
            Cat[] cat = new Cat[3];
            cat[0] = new Cat("Max", 15, 3);
            cat[1] = new Cat("Barsik", 10, 1);
            cat[2] = new Cat("Boris", 5, 2);

            Plate plate = new Plate(100);

            System.out.println("У нас есть 3 кота: " + cat[0].name + ", " + cat[1].name + ", " + cat[2].name +
                    "\n Они все хотят жрать. У каждого свой аппетит и длительность насыщения");

            do {
                for (Cat o : cat) {
                    if (o.isSatiety() == false || o.satietyTime <= 0) {

                        if (!plate.checkFood(o.getAppetite())) { // почему вместо ! нельзя написать == false? выдаёт ошибку
                            plate.increaseFood();
                        }
                        o.eat(plate);
                        System.out.println("Кот " + o.getName() + " съел " + o.getAppetite() + " граммов корма и " +
                                "проголодается через " + (o.getSatietyTime()) + " часа(ов)");
                    }
                    o.satietyTime--;
                }
                System.out.println("\nС момента начала кормежки прошел(ло) " + Time + " час(а). В миске осталось "
                        + plate.getAmount() + " граммов корма.\n");
                Time++;

            } while (Time <= 4);
        }


}
