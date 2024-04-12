public class Data<T> extends BaseData<T> implements IData<T> {

    //T typed Parameter

    private T data;

    public Data(T data) {
        this.data = data;
    }
    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data =data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }
}

class BaseData<T> {}
