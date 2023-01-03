//Задачи на взаимодействие классов:
// 1. Класс кота из прошлого ДЗ расширить функционалом потребления пищи. У каждого кота есть аппетит, т.е.
// количество еды, которое он съедает за один раз;
// 2. Кот должен есть из миски. Создайте такую сущность, которая будет обладать объёмом и едой в ней, а также
// методами наполнения и получения информации о количестве еды;
// 3. Метод из первого пункта ДЗ должен взаимодействовать с миской, т.е., конкретный кот ест из конкретной миски,
// уменьшая объём еды в ней;
// 4. Предусмотрите проверку, при которой в миске не может получиться отрицательного количества еды
// (например, в миске 10 единиц еды, а кот пытается съесть 15);
// 5. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось поесть
// (хватило еды), сытость = true;
// Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт
// (это сделано для упрощения логики программы);
// 6. Создать массив котов и одну тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести
// информацию о сытости котов в консоль;
// 7. Когда еда в тарелке кончается, нужно оповещать об этом и наполнять её едой.


package IvanCode;

public class MainClass {
    public static void main(String[] args) {
        Human human1 = new Human("Володя", 150, 5000);
        Cat cat1 = new Cat("Barsik", 10,3000);
        Robot robot1 = new Robot("Jack", 10, 100000);
        Wall wall = new Wall(120);
        Treadmill treadmill = new Treadmill(10000);

        System.out.println(human1.getName() + " начинает проходить препятствия");
        wall.wallJump(human1.getJumpMeters());
        treadmill.treadmillRun(human1.getRunMeters());
        System.out.println(cat1.getName() + " начинает проходить препятствия");
        wall.wallJump(cat1.getJumpMeters());
        treadmill.treadmillRun(cat1.getRunMeters());
        System.out.println(robot1.getName() + " начинает проходить препятствия");
        wall.wallJump(robot1.getJumpMeters());
        treadmill.treadmillRun(robot1.getRunMeters());
        System.out.println("_____________________________");


        Participant[] participants = {
                new Human("Сергей",  150, 6000),
                new Human("Женя", 145, 10000),
                new Cat("Tom", 200, 20000),
                new Cat("Max", 70, 1000),
                new Robot("R2D2", 10, 5000),
                new Robot("Terminator", 1000, 1000000)
        };

        // Вопрос - как объединить препятствия в один массив не переписывая весь код?
        // На строках 76-80 я написал такой массив, но не получается всех участников через него бегать заставить

        Wall[] walls = new Wall[]{
                new Wall(150),
                new Wall(100)
        };

        Treadmill[] treadmills = new Treadmill[]{
                new Treadmill(15000),
                new Treadmill(5000)
        };

        for (Participant participant : participants) {
            for (Wall wall1 : walls){
                if (participant.isActive()) {
                    participant.tryJumpWall(wall1);
                }
            }
            for (Treadmill treadmill1 : treadmills){
                if (participant.isActive()) {
                    participant.tryRunTreadmill(treadmill1);
                }
            }
        }

     //   Barriers [] barriers = new Barriers[]{
     //       new Wall(100),
     //       new Treadmill(5000),
     //       new Wall(150),
     //       new Treadmill(15000)
     //   };

    }

}

    //ToDo:
    /**
     * 1 Создать класс кошки, который имплементируется от участника
     * 2 Добавить кошку к участникам
     * 3 создать интерфейс препядствий
     * 4 Переписать массив стен на массив препядствий и туда добавить беговую дорожжку которую ранее надо создать с имплементацией от препядсвтвий
     *
     */

