import java.util.*;

public class arraylistdemo2 {

    public static void main(String[] args) {
        
        ArrayList<Character> al = new ArrayList<>();

        al.add('a');
        al.add('h');
        al.add('b');
        al.add('k');
        al.add('c');

        ArrayList<Object> al2 = new ArrayList<Object>();

        al2.addAll(al);

        // System.out.println(al2);

        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);


    }
}
