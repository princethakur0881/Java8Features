package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question1 {
    static void main() {
        //loops gives error for concurrent modifications
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
//        for(String s : list) {
//            list.remove(s);
//        }
        Iterator<String> listIterator = list.iterator();
        while(listIterator.hasNext()){
            String s = listIterator.next();
            if(s.equals("one")){
                listIterator.remove();
            }
        }
        System.out.println(list);
    }
}
