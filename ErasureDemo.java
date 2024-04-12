import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ErasureDemo {
    public static void main(String[] args){
        //System.out.println(method1(10));
        //Exception in thread "main" java.lang.ClassCastException:
        // class java.lang.Integer cannot be cast to class java.lang.String
        // (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
        //

        ArrayList l1 =  new ArrayList<String>();
        //ArrayList l1 - new ArrayList();
        ArrayList l2 = new ArrayList<Integer>();
        ArrayList l3 = new ArrayList();
        l1.add(12);
        l1.add(true);
        l1.add("Hello");

        System.out.println(l1);
        //[12, true, Hello]


    }

    public static String method1(Integer x) {
        List<String> a = new LinkedList<>();
        List b = a;
        b.add(x);
        return a.iterator().next();
    }
}
