import java.util.*;
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int n = map.size();
        char[] ch = new char[n];
        int[] freq = new int[n];
        int k = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            ch[k] = e.getKey();
            freq[k] = e.getValue();
            k++;
        }
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (freq[j] > freq[max]) {
                    max = j;
                }
            }
            int tempF = freq[i]; freq[i] = freq[max]; freq[max] = tempF;
            char tempC = ch[i]; ch[i] = ch[max]; ch[max] = tempC;
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < freq[i]; j++) {
                res.append(ch[i]);
            }
        }
        return res.toString();
    }
}
