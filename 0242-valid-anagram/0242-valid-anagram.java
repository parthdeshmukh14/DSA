import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        String inp=s;
        String op=t;
        if(inp.length() != op.length()){
            return false;
        }
        //better solution 
        // HashMap<Character,Integer> res=new HashMap<>();
       
        // for(int i=0;i<inp.length();i++){
        //     char ch=inp.charAt(i);
        //     res.put(ch,res.getOrDefault(ch,0)+1);
        // }
        

        // for(int i=0;i<op.length();i++){
        //     char ch=op.charAt(i);
        //     if(!res.containsKey(ch)){
        //         return false;
        //     }
        //     else{
        //       res.put(ch,res.get(ch)-1);  
        //     }
        //     if(res.get(ch)==0){
        //         res.remove(ch);
        //     }
        // }
        // return res.isEmpty();
        //optimal solution
        int[] freq=new int[26];
        for(int i=0;i<inp.length();i++){
            freq[inp.charAt(i)-'a']++;
        }
        for(int i=0;i<op.length();i++){
            freq[op.charAt(i)-'a']--;
        }
        for(int cnt:freq){
            if(cnt !=0){
                return false; 
            }
        }
        return true;
    }
}