class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        
        int countOfEmployee = 0;
        
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
                countOfEmployee++;
            }
        }
        
        return countOfEmployee;
        
    }
}