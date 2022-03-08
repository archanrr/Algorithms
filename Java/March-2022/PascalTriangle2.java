/*
8/3/2022 : 119. Pascal's Triangle II

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

*/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> answer=new ArrayList<Integer>();
      
        answer.add(1);
        for(int i=1;i<=rowIndex;i++){
          
               for(int j=i-1;j>=1;j--){
                  
                   int temp=answer.get(j-1)+answer.get(j);
                   answer.set(j,temp); //it will rewrite the values 

               }
             answer.add(1);
        }
        
       return answer;
    }
}
