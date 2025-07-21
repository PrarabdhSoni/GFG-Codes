import java.util.ArrayList;
import java.util.HashSet;

public class ArrayDuplicates {

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int element : arr){
            if(seen.contains(element)){
                result.add(element);
            }else{
                seen.add(element);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        System.out.println(findDuplicates(arr));
    }
}
