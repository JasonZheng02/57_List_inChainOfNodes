/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */

    /**
      @return the number of elements in this list
     */
    public int size() {
        int size = 0;
        Node node = headReference;
        while (node != null){
            node = node.getReferenceToNextNode();
            size++;
        }
        return size;
    }
    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
        String result = size() + " elements [";
        for (Node node = headReference; node != null; node = node.getReferenceToNextNode()){
            result += node.getCargoReference() + ",";
        }
        return result + "]";
    }
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean addAsHead( Object val) {
        headReference = new Node(val,headReference);
        return true;
    }
    
    public Node iteration(int index){
        Node node;
        int counter;
        for (counter = 0, node = headReference; 
             counter < index;
             counter++, node = node.getReferenceToNextNode()){
             }
        return node;
    }
    
    public Object get(int index){ 
        return iteration(index).getCargoReference();
    }
    
    public Object set(int index, Object newValue){
        Object oldCargo;
        oldCargo = iteration(index).getCargoReference();
        iteration(index).setCargoReference(newValue);
        return oldCargo;
    }
    
    public boolean add(int index, Object val) {
        if (index == 0) {
            addAsHead(val);
        } 
        else {
            iteration(index - 1).setReferenceToNextNode( new Node(val,iteration(index)));
        }
        return true;
    }
    
    public boolean remove(int index){
        if (index == 0) {
            headReference = headReference.getReferenceToNextNode();
        }
        else {
            iteration(index - 1).setReferenceToNextNode(iteration(index + 1));
        }
        return true;
    }
}




