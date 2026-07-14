class Solution {
    public int lengthOfLongestSubstring(String s) {
        //brute solution
        // int maxcnt=0;
        // for(int i=0;i<s.length();i++){
        //     HashSet<Character> set=new HashSet<>();
        //     for(int j=i;j<s.length();j++){
        //         if(set.contains(s.charAt(j))){
        //             break;
        //         }
        //         set.add(s.charAt(j));
        //         maxcnt=Math.max(maxcnt,set.size());
        //     }
        // }
        // return maxcnt;
        HashSet<Character> set=new HashSet<>();
        int maxlen=0;
        int left=0;
        int right=0;
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxlen=Math.max(maxlen,right-left+1);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}