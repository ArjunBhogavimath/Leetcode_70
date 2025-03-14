class LRUCache {
    int capacity;
    Node head;
    Node tail;
    Map<Integer, Node> map = new HashMap<>();
    

    public LRUCache(int capacity) {
       this.capacity = capacity; 
       //need to initialize head and tail with dummy node
       head = new Node(-1,-1);
       tail = new Node(-1,-1);
       head.next = tail;
       tail.prev = head;
    }
    
    public int get(int key) {
        //i need to check if it exists (check in map)
        if(!map.containsKey(key)) return -1; //this key doesn't exist
        //if exists
        //I'll just store that node
        Node node = map.get(key);
        //as we have accessed it recently
        // we need to delete it in list
        deleteNode(node);
        //after deleting we need to add it again after the head;
        insertAfterHead(node);

        //we need to return the node value which we got from map
        return node.val;
    }
    
    public void put(int key, int value) {
        //check if the key is already present in the map
        if(map.containsKey(key)){
            //i need to store the node details
            Node node = map.get(key);

            node.val = value; // Update value
            //now as it is accessed recently i need to delete and add it at the beginning
            deleteNode(node);
            //after deleting now i need to add after the head
            insertAfterHead(node);
        }
        else{


            //if we reached the capacity
            //we need to remove the least used element
            //that should be present before the tail
            if(map.size() == capacity){
                //as we have dummy node tail at end
                //we can directly use tail.prev to get the value

                //we need this node as we have to delete in map as well
                Node node = tail.prev;
                map.remove(node.key);
                deleteNode(node);
            }
            //now i have created new node with the given value
            Node newNode = new Node(key,value);
            //stored the temp head here
            insertAfterHead(newNode);

            map.put(key,newNode);
            // Node temp = head.next;
            // head.next = newNode;
            // newNode.next = temp;
            // newNode.prev = head;
            // temp.prev  = newNode;
        }
    }
    private void deleteNode(Node node){
        //as we have doubly linked list
        //we can easily delete the node
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertAfterHead(Node node){
        //we need to insert after head which is dummy
         Node temp = head.next;
            head.next = node;
            node.next = temp;
            node.prev = head;
            temp.prev  = node;
    }
    // public static void  deleteNodeBeforeTail(){
    //     //get the node which we want to delete
    //     Node temp = tail.prev; 
    //     //now store that node's prev
    //     Node prev = temp.prev;
    //     //the next element we already have that is tail

    //     prev.next = tail;
    //     tail.prev = prev;
    // }
}
class Node{
    int key,val;
    Node next, prev;

    Node(int key, int val){
        //we should store both key and value
        this.key = key;
        this.val = val;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */