package solutions;

public class ReverseInteger {
    public int reverse(int x) {
        boolean negative = x < 0;
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        if(negative){
            sb.deleteCharAt(0);
        }
        Long l = Long.valueOf(sb.reverse().toString());
        if(l > Integer.MAX_VALUE){
            return 0;
        }
        return negative ? - l.intValue() : l.intValue();
    }
}

