
package PriorityQueue;
import java.util.PriorityQueue;
import java.util.Comparator;

class Ticket{
String name;
int urgency;
int arrivalOrder;

Ticket(String name, int urgency, int arrivalOrder){
    this.name = name;
    this.urgency = urgency;
    this.arrivalOrder = arrivalOrder;
  }
}

    public class priorityQueue {
        public static void main(String[] args){
            PriorityQueue<Ticket> queue = new PriorityQueue<>(
            new Comparator<Ticket>(){               
                public int compare(Ticket t1, Ticket t2){
                   int result = Integer.compare(t1.urgency, t2.urgency);
                   
                   if(result == 0){
                    return Integer.compare(t1.arrivalOrder, t2.arrivalOrder);
                }
                   return result;
              }
                
            }
         ); 
             int counter = 0;
            queue.offer(new Ticket("Printer", 3,counter++));
            queue.offer(new Ticket("Network", 1,counter++));
            queue.offer(new Ticket("Login", 2,counter++));
            
            
            while (!queue.isEmpty()){
                Ticket t = queue.poll();
                System.out.println(t.name + "(" + t.urgency + ")");
            }
                   
   }
}
