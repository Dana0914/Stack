package stack;


public class Main {
    public static void main(String[] args) {
        MyStack<Character> charStack = new MyStack<>(10);
        charStack.push('g');
        charStack.push('a');
        charStack.push('s');
        charStack.push('y');
        charStack.show();
        charStack.pop();
        charStack.show();
        System.out.println(charStack.size());
        System.out.println(charStack);

        MyStack<String> stringMyStack = new MyStack<>(10);
        stringMyStack.push("hi");
        stringMyStack.push("world");
        stringMyStack.push("as");
        stringMyStack.push("wall");
        stringMyStack.push("right");
        stringMyStack.push("blue");
        stringMyStack.push("red");
        stringMyStack.push("cat");
        stringMyStack.push("car");
        stringMyStack.push("dog");
        stringMyStack.push("moon");
        stringMyStack.pop();
        stringMyStack.pop();
        stringMyStack.pop();
        stringMyStack.pop();
        stringMyStack.pop();
        stringMyStack.pop();
        stringMyStack.pop();
        stringMyStack.pop();
        stringMyStack.pop();
        stringMyStack.pop();
        stringMyStack.pop();
        stringMyStack.show();
        System.out.println(stringMyStack.size());
        System.out.println(stringMyStack.isEmpty());
        System.out.println(stringMyStack);

        MyStack<Character> characterStack = new MyStack<>(10);
        characterStack.push('g');
        characterStack.push('a');
        characterStack.push('s');
        characterStack.push('y');
        characterStack.show();
        characterStack.pop();
        characterStack.show();
        System.out.println(characterStack.size());
        System.out.println(characterStack);


        System.out.println(characterStack.equals(charStack));
        System.out.println(characterStack.hashCode());
        System.out.println(charStack.hashCode());







    }
}
