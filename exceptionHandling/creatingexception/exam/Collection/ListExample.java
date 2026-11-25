package exceptionHandling.creatingexception.exam.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ListExample {
    public static void main(String[] args) {
        int a[]={2,3,5,6};
        List list=new ArrayList<>();
        list.add(Integer.valueOf(12));
        list.add(35);
        list.add("35");
        list.add("hello");
        list.add(true);
        list.add(3.56);
        list.add('A');
      //  Integer

        // List.remove(Integer.valueOf(35));
       //  System.out.println(list);

      //  System.out.println(list);

        for (Object ob:list ) {
            System.out.println(ob);
         }

        List<Integer> list2=Arrays.asList(12,23,54,54,46,45,64,53,43,54);
        System.out.println(list2);
         Comparator<Integer> com=new Comparator<>() {
           public int compare(Integer a,Integer b){
                if(a%10<b%10){
                     return -1;
                }
                else if(a%10>b%10){
                    return 1;
                }
                 else{
                    return  0;
                 }
             }
         };

        

        Collections.sort(list2,(a2,b2)->a2%10>b2%10?-1:1);
        System.out.println("sorted with 2 digit"+list2);
        



    }

}

