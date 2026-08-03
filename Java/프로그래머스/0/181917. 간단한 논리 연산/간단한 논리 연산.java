class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean first = x1 || x2;
        boolean second = x3 || x4;

        return first && second;
    }
}