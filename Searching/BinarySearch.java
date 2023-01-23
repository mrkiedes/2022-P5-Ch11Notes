public class BinarySearch {
    static int numList[] = {1, 1, 2,3,6,78,90,90,95, 100, 110, 130, 150};
    public static void main(String args[]){
        System.out.println("Searching for 78");
        System.out.println(binarySearch(78));
        System.out.println("Finished");
    }
    public static int binarySearch(int lookup){
        int low = 0;
        int high = numList.length;
        while(low < high){
            int middle = ((high - low) / 2) + low;
            if(numList[middle] > lookup){
                high = middle + 1;
            }
            if(numList[middle] < lookup){
                low = middle - 1;
            }
            if(numList[middle] == lookup) {
                return middle;
            }
        }
        return -1;
    }
}
