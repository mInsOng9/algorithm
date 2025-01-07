import java.util.Hashtable;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        Hashtable<Character,Integer> table=new Hashtable<>();

        for(int i=0;i<s.length();i++){
            //count the frequency using value
            table.put(s.charAt(i),table.getOrDefault(s.charAt(i),0)-1);
        }
        for(char c : t.toCharArray()){
            if(!table.containsKey(c)||table.get(c)==0) 
                return false;
            //because character exists or its value is not 0, increment the value 
            table.put(c,table.get(c)+1);
        }
        return true;
    }
}
