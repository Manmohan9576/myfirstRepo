package Array;



public class Binary_Search {
    public void say(){
    System.err.println("heloo");
    }
    public static int Binary(int[] arr ,int key){
        int start = 0 ,end = arr.length - 1  ;
        while (start <= end) {
            int mid = (start + end) / 2;

            //Comparison
            if (arr[mid] == key) { // found
                return mid;
            }
            if (arr[mid] < key) {// right
                start = mid + 1;
            } else {  // left
                end = mid - 1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {

        int[] arr = {1 ,2 ,3, 4, 5, 6, 7, 8, 9};
        int key = 3;
        System.out.println("your key found at index: "+Binary(arr , key));



    }
}
