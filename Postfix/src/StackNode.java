// Roan Silver      Created: September 21st 2023        Last Edits: October 24th, 2023
// Collaborators:
public class StackNode<T, E> {

    // Instance Data !!!

    private StackNode childNode;
    private T value;

    // CONSTRUCTORS :D

    // Default "Empty" Constructor
    public StackNode(){
        childNode = null;
        value = null;
    }

    // 1 Input Constructor
    public StackNode(T valueInput){
        this.value = valueInput;
        childNode = null;
    }

    // 2 Input Constructor
    public StackNode(T valueInput, StackNode childNodeInput){
        this.value = valueInput;
        this.childNode = childNodeInput;
    }

    // ACCESSORS :)

    public StackNode getChildNode(){
        return childNode;
    }

    public T getValue(){
        return value;
    }

    // MUTATORS :/

    public void setChildNode(StackNode newChildNode){
        childNode = newChildNode;
    }

    public void setValue(T newValue){
        value = newValue;
    }

    // Method Overrides >:(

    public String toString(){
        return "Node: " + value;
    }

    public boolean equals(StackNode passingNode){
        if (this.getValue().equals(passingNode.getValue())){
            return true;
        } return false;
    }
}
