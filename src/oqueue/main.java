
package oqueue;

/**
 *
 * @author asim
 */
public class main 
{
    public static void main(String[] args) 
    {
        OQueue obj=new OQueue(10);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.enqueue(60);
        obj.enqueue(70);
        obj.enqueue(80);
        obj.enqueue(90);
        obj.enqueue(100);
        
        obj.dequeue();
        obj.dequeue();
        obj.enqueue(22);
        obj.enqueue(15);
        
       obj.displayOQueue();
        
        
        
    }
}
