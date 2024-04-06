import java.util.*;

public class arraylistdemo1 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>();
        al.add(200);
        al.add("Ravi");
        al.add(true);
        al.add(5.55);
        al.add('Y');
        System.out.println(al);

        // Size of the array list

        System.out.println("Size of the array list: " + al.size());

        // Remove an element from the array list

        al.remove(1);

        System.out.println("After removing an element: " + al);

        al.get(2);

        al.set(3, "DEVELOPMENT");

        System.out.println(al.isEmpty());
        // System.out.println(al.isFull());  // There is no isFull method in ArrayList

        /* // 1.) for loop

        System.out.println("Readingf elements using for loop: ");

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        } */
        
        /* // 2.) for..each loop

        System.out.println("Reading elements using for..each loop: ");

        for (Object e : al) {
            System.out.println(e);            
        } */

        /* // 3.) Iterator

        System.out.println("Reading elements using Iterator: ");

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            // itr.wait(2000);
            System.out.println(itr.next());
        } */
        

    }
}