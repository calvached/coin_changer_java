import java.util.ArrayList;

public class CoinChanger {
    private static final int QUARTER = 25;
    private static final int DIME = 10;
    private static final int NICKEL = 5;
    private static final int PENNY = 1;

    public static ArrayList makeChange(int amount, ArrayList coins) {

        if (amount >= QUARTER ) {
            amount = amount - QUARTER;
            coins.add(QUARTER);

            return makeChange(amount, coins);
        }
        else if (amount >= DIME ) {
            amount = amount - DIME;
            coins.add(DIME);

            return makeChange(amount, coins);
        }
        else if (amount >= NICKEL ) {
            amount = amount - NICKEL;
            coins.add(NICKEL);

            return makeChange(amount, coins);
        }
        else if (amount >= PENNY ) {
            amount = amount - PENNY;
            coins.add(PENNY);

            return makeChange(amount, coins);
        }
        else {
            return coins;
        }
    }
}