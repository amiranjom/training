class Reverse_String {
    public void reverseString(char[] s) {
        int lastI = s.length;
        for(int i=0; i < s.length; i++){
            if(i == lastI){
                break;
            }
            int temp = s[i];
            int swap = s[lastI];
            s[i] = swap;
            s[lastI] = temp;
        }

        
        
    }
}