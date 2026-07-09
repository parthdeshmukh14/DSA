class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        for(int i=0;i<s.length;i++){
            while(left<=right){
                char temp=s[left];
                s[left]=s[right];
                s[right]=temp;
                left++;
                right--;
            }
        }
    }
}