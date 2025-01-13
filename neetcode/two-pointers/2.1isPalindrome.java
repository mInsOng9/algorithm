class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] charArr=s.toCharArray();
        int point=charArr.length-1;
        for(int i=0;i<charArr.length/2;i++){
            if(charArr[i]!=charArr[point])return false;
            point--;
        }
        return true;
    }
}
