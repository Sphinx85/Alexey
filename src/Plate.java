public class Plate {
    int amount;
    boolean isEmpty;

    public Plate(int amount) {
        this.amount = amount;
        this.isEmpty = false;
    }
    
    public boolean checkFood(int appetite) {
        if ((amount - appetite) >= 0){
            return true;
        } else return false;
    }

    public void increaseFood() {
        this.amount = amount+15;
        System.out.println("В миску добавили " + amount + " граммов корма");
    }

    public void decreaseFood(int appetite) {
        amount = amount - appetite;
    }
}
