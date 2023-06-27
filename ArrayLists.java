import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add el
        list.add(0);
        list.add(2);
        list.add(3);

        //get el
        
        int el = list.get(2);
        System.out.println(el);

        // add el in between

        list.add(1, 1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //rm element

        list.remove(3);
        System.out.println(list);

        //get the size of list
        int size = list.size();
        System.out.println(size);

        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i));
        }

        //sort array list
        Collections.sort(list);
        System.out.println(list);

    }
    
}
