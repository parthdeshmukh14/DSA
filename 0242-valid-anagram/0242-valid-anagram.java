import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        String inp=s;
        String op=t;
        if(inp.length() != op.length()){
            return false;
        }
        HashMap<Character,Integer> res=new HashMap<>();
       
        for(int i=0;i<inp.length();i++){
            char ch=inp.charAt(i);
            res.put(ch,res.getOrDefault(ch,0)+1);
        }
        

        for(int i=0;i<op.length();i++){
            char ch=op.charAt(i);
            if(!res.containsKey(ch)){
                return false;
            }
            else{
              res.put(ch,res.get(ch)-1);  
            }
            if(res.get(ch)==0){
                res.remove(ch);
            }
        }
        return res.isEmpty();
    }
}