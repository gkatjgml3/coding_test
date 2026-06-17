class Solution {
    public int solution(int a, int b) {

        int ab = Integer.parseInt("" + a + b);
     
        int back = 2 * a * b;
        
        if (ab >= back) {
            return ab;
        } else {
            return back;
        }
        
    }
}