// Roan Silver      Created: October 24th 2023        Last Edits: October 24th, 2023
// Collaborators:
public class Stack<T, E> {

    // Instance Data

    private int size;
    private StackNode topItem;

    // Constructors

    public Stack(){
        size = 0;
    }

    // Methods

    // Method PUSH

    public void push(E element){

        StackNode newItem = new StackNode(element);

        if (size == 0){
            topItem = newItem;
        } else{
            StackNode subItem = topItem;
            topItem = newItem;
            topItem.setChildNode(subItem);
        } size++;
    }

    // Method POP

    public T pop(){
        T value = (T) topItem.getValue();
        topItem = topItem.getChildNode();
        size--;
        return value;
    }

    // Method PEEK

    public T peek(){
        return (T) topItem.getValue();
    }

    // Method isEmpty

    public boolean isEmpty(){
        if (size == 0){
            return true;
        } else{
            return false;
        }
    }

    // Method SIZE

    public int size(){
        return size;
    }
}
