import java.util.ArrayList;

public class Behaviour {
    public static void main(String[] args){
        ArrayList l = new ArrayList<>();
        l.add("Basics");
        l.add("Strong");
        l.add(10);

        method(l);
        System.out.println(l);
    }

    public static void method(ArrayList<String> l) {
//        l.add(10);
        l.add("se this");
//        l.add(true);
    }

    //[Basics, Strong, 10, se this]
}
