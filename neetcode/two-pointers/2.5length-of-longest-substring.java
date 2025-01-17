import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())return 0;
        Hashtable<Character,Integer> table=new Hashtable<>();
        int len=0;
        int pointer=0;
        
        int i=0;
        for(char c:s.toCharArray()){
            if(table.containsKey(c)&&table.get(c)>=pointer) 
                pointer=table.get(c)+1;
            table.put(c,i);
            len=Math.max(len,i-pointer+1);
            i++;
        }

        return len;
    }
}
