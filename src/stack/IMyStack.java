package stack;

public interface IMyStack<T> {
    void push(T element);
    void peek();
    void pop();
    boolean isEmpty();
}
