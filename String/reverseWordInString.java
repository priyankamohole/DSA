class Solution {
    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String rev="";
        for(int i=str.length-1;i>=0;i--){
            
            rev = rev + str[i];
            if(i!=0){
                rev += " ";
            }
        }
        return rev;
    }
    public static void main(String args[]){
        String a = "  hello world  ";
        System.out.print(reverseWords(a));
        
    }
}