class Solution {
    public String removeDuplicates(String s) {
        int i = 0;
        int j = 1;

        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                s = s.substring(0,i) + s.substring(j+1);
                if(i != 0){
                    i = i-1;
                    j = j-1;
                } 
            }else{
                i = j;
                j++;
            }
        }
        return s;
    }
}
