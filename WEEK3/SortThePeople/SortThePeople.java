import java.util.*;
class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
        Integer[] arr=new Integer[heights.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=heights[i];
        }
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(arr,(a,b)->b-a);
        String[] result=new String[names.length];
        for(int i=0;i<heights.length;i++){
            result[i]=map.get(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        SortThePeople obj = new SortThePeople();
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {160, 180, 170};
        String[] sortedNames = obj.sortPeople(names, heights);
        System.out.println(Arrays.toString(sortedNames));
    }
}