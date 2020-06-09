public class Single_Number {
    public int singleNumber(int[] nums) {
        /**
         * One Method Using HashMap and setting to true if duplicate as a Key and value.
         * "Num -> True | False"
         * 
         * HashMap <Integer,Boolean> hm = new HashMap<Integer,Boolean>(); for(Integer
         * num : nums){ if(hm.containsKey(num)){ hm.put(num,true); }else{
         * hm.put(num,false); } } for (Map.Entry<Integer, Boolean> pair: hm.entrySet())
         * { if(pair.getValue() == false) return pair.getKey(); }
         * 
         * return 0;
         */

        /**
         * Second Way using XOR
         * 
         * 
         * Performing XOR 0 XOR 0 = 0 0 XOR 1 = 1
         * 
         * a XOR a = 0 a XOR b = b a XOR a XOR b = (a XOR a) XOR b = 0 XOR b = b
         * 
         */

        int missingNumber = 0;
        for (int num : nums) {
            missingNumber ^= num;
        }
        return missingNumber;

    }
}