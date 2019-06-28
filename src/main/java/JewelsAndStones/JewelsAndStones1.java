package JewelsAndStones;

import java.util.ArrayList;
import java.util.List;

public class JewelsAndStones1 {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        if(J == null || S == null) return count;
        List<Character> cacheList = new ArrayList();
        for(int i = 0; i < S.length(); i++) {
            if(cacheList.contains( S.charAt(i))) {
                count++;
            } else {
                for (int j = 0; j < J.length(); j++) {
                    if (J.charAt(j) == S.charAt(i)) {
                        cacheList.add(J.charAt(j));
                        count++;
                        break;
                    }
                }
            }
        }

        return count;
    }
}



