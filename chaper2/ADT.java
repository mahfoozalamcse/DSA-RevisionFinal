package chaper2;

public class ADT {

    class StackArray{
        private int[] arr;
        private int top = -1;

        // Constructor to initialize the array
        public StackArray(int size) {
            arr = new int[size];  // Create array with given size
        }

        public void push(int data){
            if(top == arr.length-1){
                System.out.println("Stack is full");
                return;
            }

            arr[++top] = data;     
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int data = arr[top--];
            return data;
        }

        public int peek(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }

            return arr[top];
        }

        public boolean isEmpty(){
            return top == -1;
        }
    }

    // implementation of stack using linked list
     class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
    }
    class StackLinkedList{
        private Node top = null;
        public void push(int data){
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            int data = top.data;
            top = top.next;
            return data;
        }

        public int peek(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return top.data;
        }

        public boolean isEmpty(){
            return top == null;
        }

    }
    public static void main(String[] args) {
        StackArray stack = new ADT().new StackArray(5);  // Initialize with size 5
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());


        // Stack using linked list
        StackLinkedList stackLL = new ADT().new StackLinkedList();
        stackLL.push(100);
        stackLL.push(200);
        stackLL.push(300);
        System.out.println(stackLL.peek());
        System.out.println(stackLL.pop());
        System.out.println(stackLL.peek());
    }
}
