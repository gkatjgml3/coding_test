class Solution {
    public int solution(String my_string, String is_suffix) {
        int start = my_string.length() - is_suffix.length();

        if (start < 0) {
            return 0;
        }

        return my_string.substring(start).equals(is_suffix) ? 1 : 0;
    }
}