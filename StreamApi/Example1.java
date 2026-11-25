package StreamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class Example1 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);
        // List<Integer> evenNumber=new ArrayList<>();
        // for(int i=0;i<list.size();i++){
        //     if(list.get(i)%2==0){   
        //         // System.out.println(list.get(i));
        //         evenNumber.add(list.get(i));
        //     }
        // }
        // for (Integer integer : evenNumber) {
        //     System.out.println(integer);
            
        // }
        Stream<Integer> stream=list.stream();
        // anno
        Predicate<Integer> predicate=new Predicate<Integer>() {
            public boolean test(Integer n){
                if(n%2==0){
                    return true;
                }
                else{
                    return false;
                }
            }
        };

        // lamda
        Predicate<Integer> predicate2=(Integer n)->
        {
            if(n%2==0){
                return true;
            }
            return false;
        };

        // single line lamda
        Predicate<Integer> predicate3=(n)->n%2==0?true:false;
        List<Integer> list2=stream.filter(n->n%2==0?true:false).toList();
        System.out.println(list2);


        

        
    }

}
    


