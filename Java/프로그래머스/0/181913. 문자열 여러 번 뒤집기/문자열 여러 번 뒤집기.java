class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] str = my_string.toCharArray();

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            while (start < end) {
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;

                start++;
                end--;
            }
        }

        return new String(str);
    }
}