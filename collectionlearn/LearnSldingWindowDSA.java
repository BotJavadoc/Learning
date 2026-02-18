package collectionlearn;

import java.util.HashMap;
import java.util.Map;

public class LearnSldingWindowDSA {
    public static void main(String args[]) {

       String s = "abcddabac";
        Map<Character, Integer> freq = new HashMap<>();

        int l = 0;
        int maxLen = 0;

        for(int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);

            while(freq.containsKey(ch)) {
                freq.remove(s.charAt(l));
                l++;
            }

            freq.put(ch, 1);

            maxLen = Math.max(maxLen, r - l + 1);
        }

        System.out.println("Max length is " + maxLen);
    }

}
