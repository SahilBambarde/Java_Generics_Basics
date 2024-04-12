import java.util.Collections;

public class GenericMethod {
    public static <T> String concat(T data){
        return "Data is :" +data;
    }
    //this is a generic method

    public static void main(String[] args){
        System.out.println(concat("baiscs"));
        System.out.println(concat(1));
        //Data is :baiscs
        //Data is :1
    }
}
