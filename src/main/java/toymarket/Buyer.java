package toymarket;

public class Buyer {
    private float money;

    public Buyer(float money) {
        this.money = money;
    }

    public float getMoney() {
        return money;
    }

    public void decteaseMoney(float money) {
        this.money = this.money - money;
    }
}
