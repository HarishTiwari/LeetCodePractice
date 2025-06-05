// Last updated: 6/5/2025, 11:26:18 PM
class LRUCache {

    class Node {

        int key;
        int value;
        Node prev;
        Node next;

        Node(int key , int value){
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private Map<Integer , Node> map;
    private Node head;
    private Node tail;
    

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0,0);
        tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {

        if(map.containsKey(key)){
            Node temp = map.get(key);
            remove(temp);
            insertAtFront(temp);
            return temp.value;
        }

        return -1; 
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)){
            Node temp = map.get(key);
            remove(temp);
        }

        if(map.size() == this.capacity){
            remove(tail.prev);
        }

        insertAtFront(new Node(key,value));
        
    }

    private void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertAtFront(Node node){
        map.put(node.key,node);
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */