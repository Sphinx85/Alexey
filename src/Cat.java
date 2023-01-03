public class Cat {
    String name;
    int appetite;
    int satietyTime;
    boolean satiety;


    public Cat(String name, int appetite, int satietyTime) {
        this.name = name;
        this.appetite = appetite;
        this.satietyTime = satietyTime;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }


    public int getSatietyTime() {
        return satietyTime;
    }

    public void setSatietyTime(int satietyTime) {
        this.satietyTime = satietyTime;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety = true;
    }
}
