class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int orginal=x;
        while(x>0){
           int digit=x%10;
            rev=(rev*10)+digit;
            x=x/10;
        }
        if(orginal==rev){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
        return orginal==rev;
    }
}