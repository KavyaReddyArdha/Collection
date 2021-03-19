import java.util.Enumeration;
import java.util.Hashtable;


public class HashTablePrgm {
    public static void main(String[] args) {

        Enumeration names;
        String value;
        Hashtable<String, String> ht= new Hashtable<String, String>();
        ht.put("value 1","Prabhas");
        ht.put("value 2","Vijay");
        ht.put("value 3","Sam");
        ht.put("value 4","Anushka");
        ht.put("value 5","Chay");
        names= ht.keys();
        while(names.hasMoreElements())
        {
            value = (String) names.nextElement();
            System.out.println("value: " +value+ " & Name: " + ht.get(value));
        }
    }
}
