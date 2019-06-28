package JewelsAndStones;

import org.junit.Assert;

import static org.junit.Assert.*;

public class JewelsAndStones1Test {
    @org.junit.Test
    public void numJewelsInStones() throws Exception {
        int count = new JewelsAndStones1().numJewelsInStones("ebd", "bbb");
        Assert.assertEquals(count, 3);

        //"aA" "aAAbbbb"
        count = new JewelsAndStones1().numJewelsInStones("aA", "aAAbbbb");
        Assert.assertEquals(count, 3);
    }



}