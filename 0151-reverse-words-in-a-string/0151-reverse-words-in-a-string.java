class Solution {
    public String reverseWords(String s) {
        String[] word=s.split("\\s+");
        int n=word.length;
        StringBuilder result=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            result.append(word[i]);
            result.append(" ");
        }
        return result.toString().trim();
    }
}