import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNoEg {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6,7,8,9,10};
//        List<Integer> arrlist = new ArrayList<>();
//        for (int i:arr)
//        {
//            arrlist.add(i);
//        }
        //System.out.println(arrlist);

//        for(int i =1;i<=arrlist.size();i++)
//        {
//            System.out.println(i);
//        }
//        List<Integer> even  = new ArrayList<>();
//       for (int i: arrlist) {
//        if(i%2==0)
//        {
//          even.add(i);
//        }
//
//        }
//        System.out.println(even);


        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> list1 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
      //  System.out.println(list1);
        System.out.println(list.stream().filter(i -> i % 2 == 0).count());


    }
}
