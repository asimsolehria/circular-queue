
package oqueue;

/**
 *
 * @author asim
 */
public class OQueue 
{
    int front,rear;
    int arr[];
    int size;

    public OQueue(int s) 
    {
        front=-1;
        rear=-1;
        size=s;
        arr=new int[size];
    }
    
    public boolean isEmpty()
    {
       return front==-1 && rear==-1; 
    }
    
    public boolean isFull()
    {
        return (rear+1)%size==front;
    }
    
    public void enqueue(int val)
    {
        if(!isFull())
        {
            if(front==-1)
            {
                front++;
                rear++;
                arr[rear]=val;
            }
            else
            {
                rear=(rear+1)%size;
                arr[rear]=val;
            }
        }
    }
    
    public int dequeue()
    {
        int temp=-1;
        if(!isEmpty())
        {
            if(front==rear)
            {
                temp=front;
                front=rear=-1;
            }
            else
            {
                temp=front;
                front=(front+1)%size;
            }
        }
        
        return arr[temp];
    }
            
    
    
    
    public void displayOQueue()
    {
        if(front<rear)
        {
            for (int i = front; i <=rear; i++)
                System.out.println(arr[i]);
            
        }
        else
        {
            for (int i = front; i <=size-1; i++)
                System.out.println(arr[i]);
            
            
            for (int i = 0; i <=rear; i++)
                System.out.println(arr[i]);
        }
    }
    
 
}
