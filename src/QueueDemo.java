import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String args[]){
        Queue<String> q=new LinkedList<String>();
        q.add("Dhoni");
        q.add("Virat");
        q.add("Sachin");
        q.add("Bumrah");
        q.add("Hardik");
        q.add("Rohit sharma");
        System.out.println("Cricketers in Queue:"+q);
        System.out.println("Cricketers in Queue:"+q.remove());
        System.out.println("Cricketers in Queue:"+q.poll());
        System.out.println("Head: " +q.element());
        System.out.println("Cricketers in Queue:"+q.peek());
        System.out.println("Cricketers in Queue:"+q);
    }
}
