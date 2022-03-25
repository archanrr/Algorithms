/*
25/02/2022 : 171. Excel Sheet Column Number
Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.
*/
class ExcelSheetColumnIdx {
    public int titleToNumber(String columnTitle) {
        int len=columnTitle.length();
        int pos=0;
        
        for (int i=0;i<len;++i)
            pos+=(columnTitle.charAt(len-1-i)-65+1)*Math.pow(26,i);
        
        return pos;
    }
}
