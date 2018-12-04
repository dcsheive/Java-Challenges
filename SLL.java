public class SLL{
    public class Node{
        private int value;
        private Node next;
        public Node(int val){
            this.value = val;
        }
    }
    private Node head;
    public SLL(){}
    public void add(int val){
        Node n = new Node(val);
        if (this.head ==null){
            this.head = n;
        } else {
            Node runner = this.head;
            while(runner.next!=null){
                runner = runner.next;
            }
            runner.next = n;
        }
    }
    public void display(){
        Node runner = this.head;
        while(runner !=null){
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
    
}