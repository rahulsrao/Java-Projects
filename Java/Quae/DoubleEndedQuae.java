public class DoubleEndedQuae 
{
    //Create the array
    int arr[] = new int[5];
    int front, rear; 
    
    DoubleEndedQuae()
    {
        //Initialize front and rear with -1
        front = -1;
        rear = -1;
    }

    boolean Full()
    {
      if((front == 0 && rear ==arr.length-1)  ||
          (front == rear + 1))
          return true;
      else
          return false;
    }

    boolean Empty() 
    {
      if(front == -1)
      {
        return true;
      }
      else
      {
        return false;
      }
    }


    void push_front(int key)
    {
        if(Full())
        {
            System.out.println("Queue is full");
        }
        else
        {
            //If queue is empty
            if(front == -1)
                    front = rear = 0;

            //If front points to the first position element 
            else if(front == 0)
                front =arr.length-1;

            else
                    --front;

            arr[front] = key;
            System.out.println("Insert at front " + key);
        }
    }
    
    void push_back(int key)
    {
        if(Full())
        {
            System.out.println("Queue is full");
        }
        else
        {
            //If queue is empty
               if(front == -1)
                      front = rear = 0;

               //If rear points to the last element
            else if(rear ==arr.length-1)
                rear = 0;

            else
                    ++rear;

            arr[rear] = key;
            System.out.println("Insert at rear " + key);
        }    
    }
    
    void Display()
    {
      int i;
      if(Empty())
      {
        System.out.println("Empty Queue");
      }
      else
      {
        // display the front of the queue
        System.out.println("\nFront index-> " + front);

        // display element of the queue
        System.out.println("Items -> ");
        for (i =0; i <= arr.length-1; i++)
        {
          System.out.println(arr[i] + "  ");
        }

        //display the rear of the queue
        System.out.println("\nRear index-> " + rear);
      }
    }
    
    public static void main(String[] args)
    {
    // create an object of Queue class
    DoubleEndedQuae q = new DoubleEndedQuae();
    q.Display();
    
    //insert elements to the queue
    for(int i = 1; i < 4; i ++) 
    {
      q.push_front(i+2);
    }
    // Now we have just 4 elements
    q.Display();
    
    for(int j = 1; j < 3; j++) 
    {
      q.push_back(j+3);
    }
    // Now we have just 4 elements
    q.Display();

    }
 
}



