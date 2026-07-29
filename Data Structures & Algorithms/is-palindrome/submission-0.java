class Solution {
    public boolean isPalindrome(String s) {
        char [] arrayy = s.toCharArray();
        int j=arrayy.length-1;
        int i=0;
        while(i<=j){
            if(!Character.isLetterOrDigit(arrayy[i])){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(arrayy[j])){
                j--;
                continue;
            }
            if(Character.toLowerCase(arrayy[i])!=Character.toLowerCase(arrayy[j]))  return false;

            i++;
            j--;
        }
        return true;
    }
}
