import java.util.HashMap;
import java.util.List;

public class RawTypeDemo {
    public static void main(String[] args){
//        Box<Integer> genBox = new Box<>(List.of(1,2,3));
//
//        for(Integer i: genBox.getA()) {
//            System.out.println(i);
//        }

        Box rawBox = new Box(List.of(1,2,"basics"));

        HashMap<Integer, String> map = new HashMap<>();



    }
}
