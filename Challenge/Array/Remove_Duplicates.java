import java.util.HashSet;
import java.util.LinkedList;

class Remove_Duplicates {
    public int removeDuplicates(int[] nums) {

        if(nums == null){
            return 0;
        }
        

        //SetUp hashSet to recongize duplicates
        
        HashSet<Integer> uniqueSet = new HashSet<>();

        int totalNum = 0;

        for(int i=0; i < nums.length; i++){
            if(uniqueSet.contains(nums[i])){
                continue;
            }else{
                uniqueSet.add(nums[i]);
                nums[totalNum] = nums[i];
                totalNum +=1;
            }
        }
        return totalNum;
        
    }
}