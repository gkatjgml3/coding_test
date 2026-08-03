class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] count = new int[7];

        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;

        int p = 0;
        int q = 0;
        int r = 0;
        int sameCount = 0;

        for (int i = 1; i <= 6; i++) {
            if (count[i] == 4) {
                return 1111 * i;
            }

            if (count[i] == 3) {
                p = i;
            }

            if (count[i] == 2) {
                if (p == 0) {
                    p = i;
                } else {
                    q = i;
                }
                sameCount++;
            }
        }

        if (p != 0 && count[p] == 3) {
            for (int i = 1; i <= 6; i++) {
                if (count[i] == 1) {
                    q = i;
                }
            }

            return (10 * p + q) * (10 * p + q);
        }

        if (sameCount == 2) {
            return (p + q) * Math.abs(p - q);
        }

        for (int i = 1; i <= 6; i++) {
            if (count[i] == 1) {
                if (q == 0) {
                    q = i;
                } else {
                    r = i;
                }
            }
        }

        if (sameCount == 1) {
            return q * r;
        }

        int min = 7;

        for (int i = 1; i <= 6; i++) {
            if (count[i] == 1 && i < min) {
                min = i;
            }
        }

        return min;
    }
}