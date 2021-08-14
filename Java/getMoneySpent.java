import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println(FindItemCount());
    }
    public static int FindItemCount(){
        Scanner sc=new Scanner(System.in);  
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int keyboard[] = new int[n];
        int drives[] = new int[m];
        
        int max_keyboard=0;
        int max_drives=0;
        
        int min_keyboard=9999999;
        int min_drives=9999999;
        
        for(int i=0;i<n;i++){
            keyboard[i] = sc.nextInt();
            if(max_keyboard < keyboard[i]) max_keyboard = keyboard[i];
            if(min_keyboard > keyboard[i]) min_keyboard = keyboard[i];
        }
        for(int j=0;j<m;j++){
            drives[j] = sc.nextInt();
            if(max_drives < drives[j]) max_drives = drives[j];
            if(min_drives > drives[j]) min_drives = drives[j];
        }
              if((min_drives+min_keyboard)>b) return -1;
              if((min_drives>b || min_keyboard>b)) return -1;
            int max_buffer=-1;
            int max_product=-1;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    max_buffer = keyboard[i]+drives[j];
                    if(max_buffer <= b) {
                        if(max_product < max_buffer)      max_product = max_buffer;
                    
                    }
                }
            }
        
        return max_product;
    }
    
}
