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
        int result = 0;
        Node currentNode = headReference;
        while (currentNode != null){
            currentNode = currentNode.getReferenceToNextNode();
            result++;
        }
        return result;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
        String result = size() + " elements [";
        Node currentNode = headReference;
        for (int counter = 0;counter < size(); counter++){
            result += currentNode.getCargoReference() + ",";
            currentNode = currentNode.getReferenceToNextNode();
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
}