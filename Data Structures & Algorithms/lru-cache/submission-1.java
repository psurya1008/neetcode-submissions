public class Node{
    private int key;
    private int value;
    Node prev;
    Node next;

    public Node(int Key,int val){
        this.key=Key;
        this.value=val;
        this.prev=null;
        this.next=null;
    }
}

class LRUCache {
    private int cap;
    private Node left;
    private Node right;
    private HashMap<Integer,Node> cache;
    public LRUCache(int capacity) {
        this.cap=capacity;
        this.left=new Node(0,0);
        this.cache=new HashMap<>();
        this.right=new Node(0,0);
        this.left.next=this.right;
        this.right.prev=this.left;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node=cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
 remove(cache.get(key));        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);
        if(cache.size()>cap){
            Node lru=this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
            
    }

    public void insert(Node node){
       Node prev=this.right.prev;
       prev.next=node;
       node.prev=prev;
    node.next = this.right;
       this.right.prev=node;
    }

    public void remove(Node node){
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;
    }
}
