import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String a[])
    {
        ListIterator<String> li = null;
        List<String> names = new ArrayList<String>();
        names.add("AlluArjun");
        names.add("RamCharan");
        names.add("PawanKalyan");
        names.add("Chiru");
        names.add("Varun");
        li=names.listIterator();
        System.out.println("Traversing the names in forward direction:");
        while(li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("\nTraversing the names in backward direction:");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }

}
