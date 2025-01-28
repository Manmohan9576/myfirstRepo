package Array;
import java.util.*;

public class Linear_Search {


      public static int Search(int Student[] , int key){
        for (int i = 0; i < Student.length; i++) {
            if(Student[i] == key){
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {

        int[] Student = {1 , 3, 4, 5, 6 , 7, 8, 9};
        int key = 7;
        int index = Search(Student , key);
        if (index == -1){
            System.out.println("Not valid");
        }else {
            System.out.println("Your key found at index: "+index);
        }



    }

}
