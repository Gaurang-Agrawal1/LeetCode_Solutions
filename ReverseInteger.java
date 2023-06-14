
Question-
  

  
  
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1
  
  
  
  
Solution-
  

  
class Solution {
    public int reverse(int x) {
        int n1=x;
        long n2=0;
        while(n1!=0){
            int ld=n1%10;
            n2=10*n2+ld;
            if(n2>Integer.MAX_VALUE)
            return 0;
            if(n2<Integer.MIN_VALUE)
            return 0;
            n1/=10;
        }
        return (int)n2;
    }
}
