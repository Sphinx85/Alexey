public class Cat {
    String name;
    int appetite;
    boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety = true;
    }
}
