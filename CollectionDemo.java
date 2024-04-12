import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args){
        ArrayList<String> list =new ArrayList<>();

        list.add("john");

        for(String o : list){
            System.out.println(o);
        }

        //Data{data=This is d1}
        //Data{data=We have implemented a generic interface}

        Bin<String, Integer> bin = new Bin<>();

        bin.setDryTrash("fsvvfdv");
        bin.setWetTrash(456);

        System.out.println("Dry Trash:"+ bin.getDryTrash() + " Wet Trash: "+bin.getWetTrash());



    }
}
