import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean matches(String word, String pattern) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> reverse = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (map.containsKey(p) && map.get(p) != w) {
                return false;
            }

            if (reverse.containsKey(w) && reverse.get(w) != p) {
                return false;
            }

            map.put(p, w);
            reverse.put(w, p);
        }

        return true;
    }
}