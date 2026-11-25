package exceptionHandling.creatingexception.exam.Collection.Set;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example3 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(23);
        set.add(44);
        set.add(19);
        set.add(69);
        set.add(44);
        set.add(null);
        System.out.println(set);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(23);
        set2.add(44);
        set2.add(19);
        set2.add(69);
        set2.add(44);
        set2.add(null);
        System.out.println(set2);

    }


}
