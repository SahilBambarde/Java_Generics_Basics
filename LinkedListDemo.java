import java.util.Map;

public class LinkedListDemo {
    public static void main(String...atgs){
        DataNode<Integer> node2 = new DataNode<Integer>(20,null);
        DataNode<Integer> node1 = new DataNode<Integer>(35,node2);

        //DataNode(Integer,Datanode(Integer))

        System.out.println(node1.toString());
        //DataNode{data=35, next=DataNode{data=20, next=null}}

        DataNode<Double> node22 = new DataNode<>(20.0,null);
        DataNode<Double> node11 = new DataNode<>(35.8,node22);
        DataNode<Number> node111 = new DataNode<>(Double.valueOf(35.8),null);
        //node111.setNext(node2);




    }
}
