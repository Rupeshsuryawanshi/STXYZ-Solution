import java.util.Deque; 
import java.util.HashSet; 
import java.util.LinkedList; 
import java.util.Iterator; 
class Task1LRU {  
    static Deque<Integer> q; 
     static HashSet<Integer> m;  
    static int data; 
  
    Task1LRU(int n) 
    { 
        q = new LinkedList<>(); 
        m = new HashSet<>(); 
        data = n; 
    } 
  
    public void refer(int x) 
    { 
        if (!m.contains(x)) { 
            if (q.size() == data) { 
                int last = q.removeLast(); 
                m.remove(last); 
            } 
        } 
        else { 
            int index = 0, i = 0; 
            Iterator<Integer> it = q.iterator(); 
            while (it.hasNext()) { 
                if (it.next() == x) { 
                    index = i; 
                    break; 
                } 
                i++; 
            } 
            q.remove(index); 
        } 
        q.push(x); 
        m.add(x); 
    } 
  
     public void display() 
    { 
        Iterator<Integer> it = q.iterator(); 
        while (it.hasNext()) { 
            System.out.print(it.next() + " "); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        Task1LRU t = new Task1LRU(6); 
        t.refer(100); 
        t.refer(200); 
        t.refer(300); 
        t.refer(400); 
        t.refer(500); 
        t.refer(600); 
        t.display(); 
    } 
} 