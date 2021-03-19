import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]) {
        TreeSet<Integer> t= new  TreeSet<Integer>();
        t.add(110);
        t.add(850);
        t.add(1750);
        t.add(956);
        t.add(5615);
        System.out.println("Numbers are: " +t);
        t.add(2481);
        t.add(6305);
        System.out.println("Numbers are: " +t);

        TreeSet<String> ts= new  TreeSet<String>();
        ts.add("Books");
        ts.add("Pens");
        ts.add("Pencils");
        ts.add("Scales");
        ts.add("Sharpeners");
        System.out.println("\n Stationary has : " +ts);

        TreeMap<Integer, String>tm=new TreeMap<Integer, String>();
        tm.put(66,"Tom");
        tm.put(5,"Doremon");
        tm.put(87,"Nobitha");
        tm.put(5,"jerry");
        System.out.println("\n Cartoon has : " +tm);
        String s=tm.get(87);
        System.out.println("Cartoon character who has 87 is : "+s);
    }
}
