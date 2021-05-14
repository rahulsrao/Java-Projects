import java.util.Iterator;
import java.util.PriorityQueue;
class TestQuae{
public static void main(String args[]){
	PriorityQueue<String>queue=new PriorityQueue<String>();
	queue.add("A");
	queue.add("B");
	queue.add("C");
	queue.add("D");
	Iterator itr=queue.iterator();
	while(itr.hasNext())
	{  
		System.out.println(itr.next()); 
	}

	  
}
}