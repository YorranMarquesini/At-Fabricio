public class UniBHList<T> {
    // Hold the reference to the first node of this List.
    private Node<T> firstNode;
    public int totalElements;
    private Node<T> lastNode;
    
    public void insertAtBeginning(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(firstNode);
        firstNode = newNode;
        totalElements++;
    }

    public Node<T> removeAtBeginning(T target) {
        if (firstNode == null) {
            return null;
        }

        if (firstNode.getValue().equals(target)) {
            Node<T> removedNode = firstNode;
            firstNode = firstNode.getNext();
            totalElements--;
            return removedNode;
        }

        Node<T> current = firstNode;
        Node<T> previous = null;

        while (current != null && !current.getValue().equals(target)) {
            previous = current;
            current = current.getNext();
        }

        if (current == null) {
            System.out.println("Elemento não encontrado na lista.");
            return null;
        }
        previous.setNext(current.getNext());
        totalElements--;
        return current;
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
    
    public void Search(T target) {
        Node<T> current = firstNode;
        boolean found = false;

        System.out.print("Lista: ");
        while (current != null) {
            if (current.getValue().equals(target)) {
                System.out.print("\033[1m" + current.getValue() + "\033[0m ");
                found = true;
            } else {
                System.out.print(current.getValue() + " ");
            }
            current = current.getNext();
        }

        System.out.println();

        if (!found) {
            System.out.println("O número " + target + " não está na lista.");
        } else {
            System.out.println("Número encontrado!");
        }
    }
    
    public boolean modifyElement(T oldValue, T newValue) {
        Node<T> current = firstNode;

        while (current != null) {
            if (current.getValue().equals(oldValue)) {
                current.setValue(newValue);
                return true;
            }
            current = current.getNext();
        }

        return false;
    }
    
    @Override
    public String toString() {
        if(this.totalElements == 0) {
            return "Nada Meu chapa";
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