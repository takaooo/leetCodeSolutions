package solutions;
public class ZigZagConversation {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows > s.length()) return s;
        int height = (numRows - 1) * 2;
        int index = 0;
        char[] result = new char[s.length()];
        for(int i = 0; i < numRows ; i++){
            result[index++] = s.charAt(i);
            int n2 = 2*i;
            int n1 = height - n2;
            for(int j = i; j < s.length();){
                if(n1 != 0) {
                    j += n1;
                    if(j < s.length()) result[index++] = s.charAt(j);
                }
                if(n2 != 0) {
                    j += n2;
                    if(j < s.length()) result[index++] = s.charAt(j);
                }
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        ZigZagConversation solution = new ZigZagConversation();
//        System.out.println(solution.convert("paypalishiring", 1));
        System.out.println(solution.convert("pa", 3));
    }
}
