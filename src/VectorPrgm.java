import java.util.Vector;

public class VectorPrgm {

    public static void main(String args[]) {
        Vector <String> v = new Vector<String>(2,3);
        v.add("Lab");
        v.add("German shepherd");
        v.add("Golden Retriever");
        v.add("Chow chow");
        v.add("French Bulldog");
        System.out.println("Size is : "+ v.size());
        System.out.println("Default Capacity increment is : "+ v.capacity());

        v.add("Shih Tzu");
        v.add("Husky");
        System.out.println("Size is : "+ v.size());
        System.out.println("Capacity after Increment is : "+ v.capacity());
     System.out.println("Dog breeds are : " +v);
    }
}