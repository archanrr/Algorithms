/*
118. Pascal's Triangle

Given an integer numRows, return the first numRows of Pascal's triangle.
*/
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pt = new ArrayList<>();
        List<Integer> pr = new ArrayList<>();
        List<Integer> c;
        
        for(int i=0;i<numRows;i++) {
            if(i==0) {
                c = List.of(1);
            }
            else if(i==1) {
                c = List.of(1,1);
            }
            else {
                c = new ArrayList<>();
                c.add(1);
                for(int j=1;j<i;j++) {
                    c.add(pr.get(j)+pr.get(j-1));
                }
                c.add(1);
            }
            pr=c;
            pt.add(c);
        }
        return pt;
    }
}
