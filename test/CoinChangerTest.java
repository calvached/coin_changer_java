import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CoinChangerTest {
    @Test
    public void returnsOnePennyIfGiven1() {
        ArrayList<Integer> coins = new ArrayList<Integer>();
        ArrayList change = CoinChanger.makeChange(1, coins);
        List<Integer> expectedCoins = Arrays.asList(1);

        assertEquals(expectedCoins, change);
    }

    @Test
    public void returnsThreePenniesIfGiven3() {
        ArrayList<Integer> coins = new ArrayList<Integer>();
        ArrayList change = CoinChanger.makeChange(3, coins);
        List<Integer> expectedCoins = Arrays.asList(1, 1, 1);

        assertEquals(expectedCoins, change);
    }

    @Test
    public void returnsANickelAndTwoPenniesIfGiven7() {
        ArrayList<Integer> coins = new ArrayList<Integer>();
        ArrayList change = CoinChanger.makeChange(7, coins);
        List<Integer> expectedCoins = Arrays.asList(5, 1, 1);

        assertEquals(expectedCoins, change);
    }

    @Test
    public void returnsTwoDimesIfGiven20() {
        ArrayList<Integer> coins = new ArrayList<Integer>();
        ArrayList change = CoinChanger.makeChange(20, coins);
        List<Integer> expectedCoins = Arrays.asList(10, 10);

        assertEquals(expectedCoins, change);
    }

    @Test
    public void returnsThreeQuartersIfGiven75() {
        ArrayList<Integer> coins = new ArrayList<Integer>();
        ArrayList change = CoinChanger.makeChange(75, coins);
        List<Integer> expectedCoins = Arrays.asList(25, 25, 25);

        assertEquals(expectedCoins, change);
    }

    @Test
    public void returnsCorrectChangeForAnyAmount() {
        ArrayList<Integer> coins = new ArrayList<Integer>();
        ArrayList change = CoinChanger.makeChange(68, coins);
        List<Integer> expectedCoins = Arrays.asList(25, 25, 10, 5, 1, 1, 1);

        assertEquals(expectedCoins, change);
    }
}