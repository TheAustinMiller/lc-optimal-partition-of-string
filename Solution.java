import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
    }

    public static int partitionString(String s) {
        if (s.length() == 1) {
            return 1;
        }
        if (s.length() == 2) {
            if(s.charAt(0) == s.charAt(1)) {
                return 1;
            } else {
                return 2;
            }
        }
        StringBuilder message = new StringBuilder();
        ArrayList<String> partition = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (message.toString().indexOf(s.charAt(i)) == -1) {
                message.append(s.charAt(i));
            } else {
                partition.add(message.toString());
                message = new StringBuilder();
                i--;
            }
        }
        if (message.length() > 0) {
            partition.add(message.toString());
        }
        return partition.size();
    }

}
