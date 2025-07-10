import java.util.Arrays;

public class SortingArray {

    public Object[] sortingArray(Object[] array){
        if(array.length == 0)
            throw new NullPointerException("Array is empty");
        for(Object obj: array)
            if(!(obj instanceof Integer))
                throw new ClassCastException("Only integers are allowed");
        if(array.length == 1)
            return array;
        Arrays.sort(array);
        return array;
    }
}
