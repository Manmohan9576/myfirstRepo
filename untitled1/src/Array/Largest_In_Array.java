package Array;

public class Largest_In_Array {
    public static int Largest(int Number[]){
        int max_value = Integer.MIN_VALUE; // -infinity
        int min_value = Integer.MAX_VALUE;

        for (int i = 0; i < Number.length; i++) {
            if (max_value < Number[i]){
                max_value = Number[i] ;

            }
            }
        return max_value;
    }



    public static void main(String[] args) {
        int Number[] = {9,4,2,5,3,5,2,8,0,2,6} ;
        System.out.println("Largest Number in array :"+Largest(Number));




    }

}