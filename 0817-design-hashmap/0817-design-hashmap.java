import java.util.*;
class Entry{
    public int key;
    public int value;
    public Entry(int key,int value)
    {
        this.key=key;
        this.value=value;
    }
}
class MyHashMap {

    LinkedList<Entry>[] map;
    public static int size=769;
    public MyHashMap() {
        map =new LinkedList[size];
    }
    
    public void put(int key, int value) {
        int bucket=key%size;
        if(map[bucket]==null)
        {
            map[bucket]=new LinkedList<Entry>();
        }
        else{
            for(Entry entry:map[bucket])
            {
                if(entry.key==key)
                {
                    entry.value=value;
                    return;
                }
            }
        }
        map[bucket].add(new Entry(key,value));

    }
    
    public int get(int key) {
        int bucket=key%size;
        LinkedList<Entry> entries=map[bucket];
        if(entries==null) return -1;
        for(Entry e:entries)
         {
            if(e.key==key)
            {
                return e.value;
            }
         }
         return -1;
    }
    
    public void remove(int key) {
        int bucket=key%size;
        LinkedList<Entry> entries=map[bucket];
        if(entries==null) return;
        for(Entry e:entries)
        {
            if(e.key==key)
            {
                map[bucket].remove(e);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */