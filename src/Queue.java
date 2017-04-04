import java.lang.reflect.Array;

/**
 * Created by HP on 4/2/2017.
 */
public class Queue <T> {
    public T[] array;
    public int tail;
    public Queue(Class<?> classname)
    {
        array=(T[]) Array.newInstance(classname, 10);
        tail=-1;
    }

    public static void main(String[] args)
    {
        Queue<Integer> q = new Queue<Integer>(Integer.class);
        Queue<Character> a =  new Queue<Character>(Character.class);
        a.enq('g');
        a.enq('l');
        a.enq('u');
        a.enq('c');
        a.enq('k');
        
        a.display();
        System.out.println();
        a.deq();
        a.deq();
        a.display();
        System.out.println();
        q.clear();
        q.display();
        
        System.out.println("\n");
        
        q.enq(2);
        q.enq(6);
        q.enq(4);
        q.enq(8);
        q.enq(3);
        q.display();
        System.out.println();
        q.deq();
        q.deq();
        q.display();
        System.out.println();
        q.clear();
        q.display();
    }
    

    public void enq(T item)
    {
        tail++;
        array[tail]=item;
    }

    public void deq()
    {
        for(int i=0;i<=tail;i++)
        {
            array[i]=array[i+1];
        }
        tail--;
    }

    public void display()
    {
        for(int i=0;i<=tail;i++)
        {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    public void clear()
    {
        tail=-1;
    }
}
