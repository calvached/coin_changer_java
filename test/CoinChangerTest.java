import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CoinChangerTest {
    @Test
    public void returnsOnePennyIfGiven1() {
        ArrayList change = CoinChanger.makeChange(1);
        List<Integer> expectedCoins = Arrays.asList(1);

        assertEquals(expectedCoins, change);
    }

    @Test
    public void returnsThreePenniesIfGiven3() {
        ArrayList change = CoinChanger.makeChange(3);
        List<Integer> expectedCoins = Arrays.asList(1, 1, 1);

        assertEquals(expectedCoins, change);
    }

    @Test
    public void returnsANickelAndTwoPenniesIfGiven7() {
        ArrayList change = CoinChanger.makeChange(7);
        List<Integer> expectedCoins = Arrays.asList(5, 1, 1);

        assertEquals(expectedCoins, change);
    }

    @Test
    public void returnsTwoDimesIfGiven20() {
        ArrayList change = CoinChanger.makeChange(20);
        List<Integer> expectedCoins = Arrays.asList(10, 10);

        assertEquals(expectedCoins, change);
    }

    @Test
    public void returnsThreeQuartersIfGiven75() {
        ArrayList change = CoinChanger.makeChange(75);
        List<Integer> expectedCoins = Arrays.asList(25, 25, 25);

        assertEquals(expectedCoins, change);
    }

    @Test
    public void returnsCorrectChangeForAnyAmount() {
        ArrayList change = CoinChanger.makeChange(68);
        List<Integer> expectedCoins = Arrays.asList(25, 25, 10, 5, 1, 1, 1);

        assertEquals(expectedCoins, change);
    }
}