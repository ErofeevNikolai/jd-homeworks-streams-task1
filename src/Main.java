import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();
        for (Integer currentElement : intList) {
            if (currentElement > 0 & currentElement % 2 == 0) {
                result.add(currentElement);
            }
        }
        sort(result);
        for (Integer results : result){
            System.out.println(results);
        };
    }

    private static void sort(List<Integer> array){
        int sizeArray = array.size();
        Integer dummy;
        for (int i = 0; i < sizeArray-1; i++) {
            for (int j = 0; j < sizeArray-1-i ; j++) {
                if (array.get(j) > array.get(j+1)){
                    dummy = array.get(j+1);
                    array.remove(j+1);
                    array.add(j+1, array.get(j));
                    array.remove(j);
                    array.add(j, dummy);
                }
            }
        }
    }

}