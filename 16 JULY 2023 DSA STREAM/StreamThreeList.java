import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamThreeList {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,4,5,8,9);
        List<Integer> list2 = Arrays.asList(11,14,15,18,19);
        List<Integer> list3 = Arrays.asList(21,24,25,28,29);


        List<List<Integer>> list = Arrays.asList(list1,list2,list3);
        List<Integer> newList = list.stream().flatMap(li->li.stream()).collect(Collectors.toList());
        //System.out.println(newList);

        //Limit
        List<Integer> newList1 = list.stream().flatMap(li->li.stream()).limit(4).collect(Collectors.toList());
        System.out.println(newList1);

        //peek function -debug an application
        newList.stream().peek(System.out::println).collect(Collectors.toList());

        //Reduce
       int i= list1.stream().reduce(Integer::sum).get();
        System.out.println("REDUCE:" + i);


    }

}
