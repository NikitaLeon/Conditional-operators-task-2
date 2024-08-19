public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int replenishment = 1100;
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый бонус " + bonus);

    }
}