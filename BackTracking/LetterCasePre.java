import java.util.LinkedList;
import java.util.Queue;

public class LetterCasePre {
    
}

class Solution {
    public List<String> letterCasePermutation(String S) {
        if(s == null){
            return new LinkedList<>();
        }
        
        //Hold the words and Breadth-first search Approach
        Queue<String> words = new LinkedList<>();

        words.add(S);

            for (int i = 0; i < S.length(); i++) {
                if (Character.isDigit(S.charAt(i))) continue;            
                int size = queue.size();
                for (int j = 0; j < size; j++) {
                    String currentWord = queue.poll();
                    char[] character = cur.toCharArray();
                    
                    character[i] = Character.toUpperCase(character[i]);
                    words.add(String.valueOf(character));
                    
                    character[i] = Character.toLowerCase(character[i]);
                    words.add(String.valueOf(character));
                }
            }
            
            return new LinkedList<>(words);
        
        
    }
}