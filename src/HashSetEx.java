import java.util.HashMap;
import java.util.HashSet;

public class HashSetEx {

    public static void main(String args[]) {
        HashSet<Integer> h= new  HashSet<Integer>();
        h.add(120);
        h.add(1050);
        h.add(5500);
        h.add(4872);
        h.add(1475);
        System.out.println("Size is : "+ h.size());
        h.add(9999);
        System.out.println("Numbers are: " + h);
        h.remove(4872);
        System.out.println("Numbers are: " + h);

        HashMap<Integer, String>h1=new HashMap<Integer,String>();
        h1.put(1,"Kavya");
        h1.put(35,"Soma");
        h1.put(40,"Ardha");
        h1.put(17,"sree");
        System.out.println("\n Student id and names : " +h1);
        String s=h1.get(40);
        System.out.println("Student of id 40 is: "+s);
    }
}

