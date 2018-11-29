public class StackTest{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(4);
        System.out.println(s.max());
        s.push(34);
        s.push(12);
        System.out.println(s.max());
        s.pop();
        System.out.println(s.max());
    }
}