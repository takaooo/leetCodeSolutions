package solutions;import java.util.*;

class LengthOfLongestSubstring {
    int lengthOfLongestSubstring(String s) {
        Set<Character> container = new LinkedHashSet<>();
        int result = 0;
        loops:
        for(char c : s.toCharArray()){
            if(!container.add(c)){
              if(container.size() > result){
                  result = container.size();
              }
                Iterator<Character> it = container.iterator();
                while(true){
                    if(it.next() == c){
                        it.remove();
                        container.add(c);
                        continue loops;
                    }
                    it.remove();
                }
            }
        }
        return (result > container.size() ? result : container.size());
    }

    int sol2(String s){
        Map<Character,Integer> map = new HashMap<>();
        int result = 0;
        int size = 0;
        for(int i = 0; i < s.length()-1 ; i++){
            if(map.containsKey(s.charAt(i))){
                size = i - map.get(s.charAt(i));
                result = result > size ? result : size;
                map.remove(s.charAt(i));
            }
            map.put(s.charAt(i),i);
        }

        int i = s.charAt(s.length()-1);
        if(map.containsKey(i)){
            size = (i)- map.get(s.charAt(i));
        } else {
            size++;
        }
        result = result > size ? result : size;

        if(result == 0){
            return s.length();
        }
        return result;
    }
}
