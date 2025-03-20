public class UniBHList<T> {
    // Hold the reference to the first node of this List.
    private Node<T> firstNode;
    private int totalElements;
    private Node<T> lastNode;


    public void insertAtBeginning(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(firstNode);
        firstNode = newNode;
        totalElements++;
    }

    public Node<T> removeAtBeginning() {
        Node<T> aux = firstNode;
        firstNode = firstNode.getNext();
        totalElements--;
        return aux;
    }
    
    public void insertAfter(T target, T value) {
        Node<T> current = firstNode;

        while (current != null && !current.getValue().equals(target)) {
            current = current.getNext();
        }

        if (current != null) {
            Node<T> newNode = new Node<>(value);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            totalElements++;
        }
    }

    @Override
    public String toString() {
        if(this.totalElements == 0) {
            return "[ ]";
        }

        Node<T> currentNode = firstNode;
        StringBuilder builder = new StringBuilder("[");

        while (currentNode != null) {
            builder.append(currentNode.getValue());
            if (currentNode.getNext() != null) {
                builder.append(", ");
            }
            currentNode = currentNode.getNext();
        }

        builder.append("]");

        return  builder.toString();
    }

    // Design the other list methods.
//    Insert at the end, in order, remove at the end,
//    remove elements by value, search an element.
}