// Last updated: 5/27/2025, 12:45:58 AM
class Solution {
    public boolean checkIfExist(int[] arr) {
        
       HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) {
	    if(set.contains(ele*2) || (ele%2 == 0 && set.contains(ele/2)))
		return true;
	set.add(ele);
}

return false;
    }
}