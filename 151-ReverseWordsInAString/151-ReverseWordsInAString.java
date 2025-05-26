// Last updated: 5/27/2025, 12:46:50 AM
class Solution {
    public String reverseWords(String s) {
        
         StringBuilder sb = new StringBuilder();
        
      
        for(int i = 0; i<s.length() ; i++)
        {
            if(s.charAt(i)==' ')
                continue;
            
            int start = i;
            
            while(i<s.length() && s.charAt(i) != ' ')
                i++;
            
            if(sb.length()==0)
                sb.insert(0,s.substring(start,i));
            else
                sb.insert(0,' ').insert(0,s.substring(start,i));
            
        }
        
        return sb.toString();
        
     
        /* Method 1
        
        StringBuilder sb = new StringBuilder();
        
      String[] str = s.replaceAll("\\s+"," ").trim().split(" ");
        
        for(int i=str.length-1;i>=0;i--)
        {
            sb.append(str[i]);
            sb.append(" ");
        }
        
        return sb.toString().trim();  
        
        */
        
        
    }
}