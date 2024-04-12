public class Demo {
    public static void main(String[] args){
        Data<String> d1 = new Data<>("This is d1");

        System.out.println(d1.toString());
        //Data{data='This is d1'}

        Data<Integer> d2 = new Data<>(10);

//        int data = (int) d1.getData();
        //Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to
        // class java.lang.Integer
        // (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        //	at Demo.main(Demo.java:10)

        //java: incompatible types: java.lang.String cannot be converted to int

        int data = (int) d2.getData();

        IData<String> d3 = new Data<>("We have implemented a generic interface");

        System.out.println(d3.toString());

        //generic type:
        //generic class or generic Interface

        //subclassing

        Data<String> d4 = new Data<>("data 4");
        BaseData<String> b1 = d4;



    }
}
