import java.util.HashMap;
import java.util.Map;

public class P1613 {
    public static void main(String[] args) {
        String[] list = {"192.168.1.1","192.118.2.1","192.168.1.1","192.118.2.1","192.118.2.1"};
        System.out.println(highestFrequency(list));
    }

    public static String highestFrequency(String[] ipLines) {
        // Write your code here
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String ip : ipLines) {
            if (map.containsKey(ip)) {
                map.put(ip, map.get(ip) + 1);
            } else {
                map.put(ip, 1);
            }
        }
        int max = 0;
        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                result = entry.getKey();
                max = entry.getValue();
            }
        }
        return result;
    }
}