import java.util.ArrayList;

public class CoinChanger {
    private static final int QUARTER = 25;
    private static final int DIME = 10;
    private static final int NICKEL = 5;
    private static final int PENNY = 1;

    private static final int[] COINS = {QUARTER, DIME, NICKEL, PENNY};

    public static ArrayList makeChange(int amount) {
        ArrayList<Integer> change = new ArrayList<Integer>();

        for (int coin : COINS) {

            while (amount >= coin) {
                amount -= coin;
                change.add(coin);
            }
        }

        return change;
    }

}