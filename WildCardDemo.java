import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
    public static void displayData(List<? super Integer> l){
        for(Object t: l){
            System.out.println(t);
        }

        l.add(1);
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        List<Number> list1 = new ArrayList<>();
        List<?> l1 = new ArrayList<>();
        List<? extends Number> l2 = new ArrayList<Number>();
        List<? extends Number> l3 = new ArrayList<Integer>();
        List<? super Number> l4 = new ArrayList<Number>();
//        l2.add(45);
        //l1.add(12);
        Number n = 12;
//        l2.add(n);
        l4.add(n);
        Integer i =67;
        l4.add(i);
        list.add(34);
        list.add(57);
        list1.add(98);
        list1.add(67);
        displayData(list);
        displayData(list1);
        //34
        //57
        //98
        //67


    }
}
