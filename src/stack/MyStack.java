package stack;

import java.util.Arrays;
import java.util.Objects;

public class MyStack<T> implements IMyStack<T> {
    private int size;
    private T[] myStack;
    private int top;

    @SuppressWarnings("unchecked")
    public MyStack(int size) {
        this.size = size;
        myStack = (T[]) new Object[size];
        this.top = -1;
    }

    @Override
    public void push(T element) {
        if (top+1 == myStack.length) {
            capacity();
        }
        myStack[++top] = element;
        System.out.println("Pushed item: " + element);

    }

    @Override
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        System.out.println("Top item " + myStack[top]);
    }

    @Override
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            T element = myStack[top];
            myStack[top--] = null;
            System.out.println("Item popped: " + element);
            size--;
            }

        }


    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Items: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(myStack[i] + " ");
            }
        }
        System.out.println();

    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "size=" + size +
                ", myStack=" + Arrays.toString(myStack) +
                ", top=" + top +
                '}';
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, top);
        result = 31 * result + Objects.hashCode(myStack);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStack<?> stack = (MyStack<?>) o;
        return size == stack.size && top == stack.top && Arrays.equals(myStack, stack.myStack);
    }

    @SuppressWarnings("unchecked")
    private void capacity() {
        int capacity = (size * 3) / 2 + 1;
        T[] stack = (T[]) new Object[capacity];
        for (int i = 0; i < top+1; i++) {
            stack[i] = myStack[i];
        }
        size = capacity;
        myStack = stack;
    }

    public int size() {
        return size;
    }
}








