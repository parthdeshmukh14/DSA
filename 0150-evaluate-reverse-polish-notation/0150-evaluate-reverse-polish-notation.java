class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            String str=tokens[i];
            if(str.equals("+")){
                int last=stack.pop();
                int seclast=stack.pop();
                stack.push(seclast+last);
                
            }
            else if(str.equals("*")){
                int last=stack.pop();
                int seclast=stack.pop();
                stack.push(seclast*last);
                
            }
            else if(str.equals("-")){
                int last=stack.pop();
                int seclast=stack.pop();
                stack.push(seclast-last);
               
            }
            else if(str.equals("/")){
                int last=stack.pop();
                int seclast=stack.pop();
                stack.push(seclast/last);
                
            }
            else{
                stack.push(Integer.parseInt(str));
            }

        }
        return stack.peek();
    }
}