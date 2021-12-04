import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    int sock_pair=0;
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    for (int i=0;i<ar.size();i++) {
        int sock_color = ar.get(i);
        if(map.containsKey(sock_color)){
            int sock_count = map.get(sock_color) + 1;
            map.put(sock_color,sock_count);
        } else {
            map.put(sock_color,1);
        }
    }
    for (Map.Entry<Integer, Integer> pair : map.entrySet()){
        if (pair.getValue() >= 2 ) {
            sock_pair += (pair.getValue()/2);
        }
    }
    return sock_pair;
    }
}

class SocksColorPairing {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(40);
        list.add(40);
        list.add(40);
        
        System.out.println(Result.sockMerchant(9,list));
    }
}
