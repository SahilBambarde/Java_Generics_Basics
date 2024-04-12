import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args){
        Object o = new Object();
        Integer i = Integer.valueOf(11);
        o=i;

        List<Number> list = new ArrayList<>();
        list.add(Integer.valueOf(11));
        list.add(Double.valueOf(10.5));
        //list.add("hello");

        //List<Box<Integer>> bList = new ArrayList<>();
//        bList.add(new Box(List.of(1,2,3)));
//        bList.add(new SquareBox<>(List.of(3,7,9,0)));

        //List<Number> l1 = new ArrayList<Integer>();
        //both type arg should be same


    }
}
