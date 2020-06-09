import java.util.HashMap;
import java.util.HashSet;

class First_Uniq_Char {
    public int firstUniqChar(String s) {
        char [] letters = s.toCharArray();
        HashMap<Character, Integer> uniqSet = new HashMap<>();

       
        

        for(int i=0; i < letters.length; i++){
            int count = uniqSet.getOrDefault(letters[i],0) + 1;
            uniqSet.put(letters[i], count);
        }

        for(int i=0; i < letters.length; i++){
            if(uniqSet.get(letters[i]) == 1){
                return i;
            }
        }


        return -1;
        
    }
}