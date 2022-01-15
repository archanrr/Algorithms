/*
15/1/2022

492. Construct the Rectangle

A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:

The area of the rectangular web page you designed must equal to the given target area.
The width W should not be larger than the length L, which means L >= W.
The difference between length L and width W should be as small as possible.
Return an array [L, W] where L and W are the length and width of the web page you designed in sequence.
*/
class ConstructRectangleFromArea {
    public int[] constructRectangle(int area) {
        int arr[]=new int[2];
        int ele1=0;
        for(int i=1;i*i<=area;i++)
        {
            if(area%i==0)
                ele1=i;
        }
        int ele2=area/ele1;
        arr[0]=ele2;
        arr[1]=ele1;
        return arr;
    }
}
