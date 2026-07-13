class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int n = s.length();

        for (int c = 0; c < n; c++) {
            char i = s.charAt(c);

            if (i == 'I') {
                if (c + 1 < n && (s.charAt(c + 1) == 'V' || s.charAt(c + 1) == 'X'))
                    sum -= 1;
                else
                    sum += 1;
            }
            else if (i == 'V') {
                sum += 5;
            }
            else if (i == 'X') {
                if (c + 1 < n && (s.charAt(c + 1) == 'L' || s.charAt(c + 1) == 'C'))
                    sum -= 10;
                else
                    sum += 10;
            }
            else if (i == 'L') {
                sum += 50;
            }
            else if (i == 'C') {
                if (c + 1 < n && (s.charAt(c + 1) == 'D' || s.charAt(c + 1) == 'M'))
                    sum -= 100;
                else
                    sum += 100;
            }
            else if (i == 'D') {
                sum += 500;
            }
            else { 
                sum += 1000;
            }
        }
        return sum;
    }
}
