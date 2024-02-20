package basics;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> storage = new HashMap<>();
        if (strs.length==0) {
            return List.of();
        }
        for (String word:strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedAnagram = new String(chars);
            storage.putIfAbsent(sortedAnagram,new LinkedList<>());
            storage.get(sortedAnagram).add(word);
        }
        return new ArrayList<>(storage.values());

    }

}
