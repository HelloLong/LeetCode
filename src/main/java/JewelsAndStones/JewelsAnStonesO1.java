package JewelsAndStones;

public class JewelsAnStonesO1 {
    public int numJewelsInStones(String J, String S) {
        return S.replaceAll("[^" + J + "]", "").length();
    }
}
