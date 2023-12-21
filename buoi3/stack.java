class Stack {
    private int maxSize;
    private int [] stackArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = 0;
    }

    public void push(int j) {
        stackArray[top++] = j;
    }

    public int pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == 0);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

class bai3 {
    public static void main(String[] args) {
        Stack theStack = new Stack(5);
        theStack.push(2);
        System.out.println(theStack.isEmpty());
        System.out.println(theStack.isEmpty());
    }
}