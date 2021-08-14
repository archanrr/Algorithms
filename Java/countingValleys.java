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
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
    int height_at_seaLevel = 0;
    int valley_at_sealevel = 0;
    int no_of_valleys = 0;
    for(int i=0;i<steps;i++){
        if(path.charAt(i) == 'D') height_at_seaLevel--;
        if(path.charAt(i) == 'U') height_at_seaLevel++;
        if(height_at_seaLevel == 0 && valley_at_sealevel < 0) no_of_valleys++; 
        if(height_at_seaLevel < 0) valley_at_sealevel = -1;
        else valley_at_sealevel=1;
        
    }
    return no_of_valleys;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
