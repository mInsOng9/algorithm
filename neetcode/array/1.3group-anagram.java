import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String,List<String>> table=new Hashtable<>();

        for(String str:strs){
            char[] array=str.toCharArray();
            Arrays.sort(array);
            if(!table.containsKey(String.valueOf(array)))
                table.put(String.valueOf(array),new ArrayList<String>());
            table.get(String.valueOf(array)).add(str);
        }
        return new ArrayList<>(table.values());
    }
}
