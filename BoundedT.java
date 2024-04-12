import java.util.Arrays;
import java.util.List;

public class BoundedT {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(new Integer[] {2,5,8,9});
        //List<String> slist = Arrays.asList(new String[] {"hello","there","basics","string"});
        List<Double> dlist = Arrays.asList(new Double[] {2.5,5.7,8.5,9.8});
        DataSorter<Integer> sorter1 = new DataSorter<>(list);
        DataSorter<Double> sorter2 = new DataSorter<>(dlist);
        sorter1.getSortedData();
        sorter2.getSortedData();

        //2
        //5
        //8
        //9
        //basics
        //hello
        //string
        //there

        //like this, we can print any type of data

        //2
        //5
        //8
        //9
        //2.5
        //5.7
        //8.5
        //9.8

        // this time, we have create a class and extended its generic type to numbers

        //getSortedData(list);

        CBound b = new CBound();
        getSortedData(b);

    }

    public static <T extends IBound1 & IBound2> void getSortedData(T list){
//        list.sort(null);
//        for(T t: list){
//            System.out.println(t);
//        }


    }
}

interface IBound1{}

class CBound implements IBound1,IBound2{}

interface IBound2{}
