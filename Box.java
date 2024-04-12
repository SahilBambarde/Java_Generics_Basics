import java.util.List;

public class Box {
    private List a;

    public <T> Box(List<T> a){
        this.a=a;
    }
    public List getA(){
        return a;
    }

    public void setA(List a){
        this.a=a;
    }
}
