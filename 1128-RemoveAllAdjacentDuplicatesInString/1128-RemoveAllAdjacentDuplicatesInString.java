// Last updated: 5/27/2025, 12:46:03 AM
class Solution {
    public String removeDuplicates(String s) {

        if(s == "" || s == null) return s;
        
        Stack<Character> stk = new Stack<>();
        
        for(int i=0 ; i < s.length() ; i++){
            if(stk.isEmpty() || stk.peek() != s.charAt(i)){
                stk.push(s.charAt(i));
            }else{
                stk.pop();
            }
        }

        System.out.println(stk.size());
        char[] ans = new char[stk.size()];

        for(int i = ans.length-1 ; i >= 0 ; i--){
            ans[i] = stk.pop();
        }

        return String.valueOf(ans);
    }
}