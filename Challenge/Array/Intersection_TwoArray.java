import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Intersection_TwoArray {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> set = new HashMap<>();

        for (int num : nums1) {
            if (set.containsKey(num)) {
                int i = set.get(num);
                set.put(num, i + 1);

            } else {
                set.put(num, 1);
            }
        }
   
        int size = 0;

        ArrayList<Integer> list = new ArrayList<>();


        for(int num : nums2){
            if(set.containsKey(num) && set.get(num) > 0 ){
                
                set.put(num,set.get(num) - 1);
                list.add(num);
            }
        }


        int[] result = new int[list.size()];
        int i = 0;
        
        for (int num : list) {
            result[i++] = num;
        }
       
        return result;
    }
}