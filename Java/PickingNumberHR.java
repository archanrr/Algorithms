import java.util.*;
public class PickingNumberHR{

     public static void main(String []args){
        System.out.println("Hello World");
         List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);
        System.out.println(pickingNumbers(list));
     }
    public static int pickingNumbers(List<Integer> a) {
    Collections.sort(a);
    int max_subarray = 0;
    List<Integer> list = new ArrayList<Integer>();
    for (int i=0;i<a.size();i++){
        for(int j=i+1;j<a.size();j++){
            int abs_mod = a.get(j)-a.get(i);
            if(abs_mod > 1) break;
            max_subarray++;
        }
        list.add(max_subarray);
        max_subarray=0;
    }
    Collections.sort(list);
    return list.get(a.size()-1);
    }
}