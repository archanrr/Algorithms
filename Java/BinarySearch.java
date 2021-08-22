import java.util.*;

class BinarySearch {
    public static void main(final String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>();
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Enter the array integers till end type eof");
        do {
            input.add(scanInput.nextInt());
        } while(scanInput.nextLine().charAt(0) != 'e');
        scanInput.close();
        System.out.println("Enter the number to be searched ");
        final int searchValue = scanInput.nextInt();
        final int pos = searchValueInArray(input, searchValue);
        if (pos != -1) {
            System.out.println("Number is found at position " + pos);
        } else {
            System.out.println("Number is not found");
        }
    }

    public static int searchValueInArray(List<Integer> info, int key) {
        int low = 0;
        int high = info.size() - 1;
        int mid = 0;
        while(low <= high) {
            mid = (low + high)/2;
            if (info.get(mid) < key) {
                low = mid + 1;
            } else if (info.get(mid) > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}