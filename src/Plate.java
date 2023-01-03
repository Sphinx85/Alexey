public class Plate {
    int amount;
    boolean isEmpty;

    public Plate(int amount) {
        this.amount = amount;
        this.isEmpty = false;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public boolean checkFood(int appetite) {
        if ((amount - appetite) >= 0){
            return true;
        } else return false;
    }

    public void increaseFood() {
        this.amount = amount+100;
        System.out.println("В миску добавили 100 грамм корма");
    }

    public void decreaseFood(int appetite) {
        amount = amount - appetite;
    }
}
