public class Stack{
    
    public class Node {
        private int value;
        private Node next;
        private Node oldMax;
    }
    
    private Node top;
    private Node max;

    public Stack(){}

    public void push(int val){
        Node n = new Node();
        n.value = val;
        if (top == null){
            top = n; 
        } else {
            n.next = top;
            top = n;
        }
        if ( max == null || n.value > max.value){
            n.oldMax = max;
            max = n;
        }
    }
    public int pop() {
        if (top == null) throw new NullPointerException();
        Node n = top;
        top = n.next;
        if (n.oldMax != null){
            max = n.oldMax;
        }
        return n.value;
    }
    public int max() {
        if (max == null) throw new NullPointerException();
        return max.value;
    }

}