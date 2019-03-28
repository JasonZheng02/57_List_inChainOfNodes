/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
                          
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(1));
        
        System.out.println(list.set(0,8));
        System.out.println(list.set(1,9));
        System.out.println(list.set(list.size()-1,4));
        System.out.println(list.set(2,2));
        System.out.println(list);
        
        list.add(list.size(),1);
        System.out.println(list);
        
        list.remove(4);
        System.out.println(list);
    }
}
