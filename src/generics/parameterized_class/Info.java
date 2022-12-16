package generics.parameterized_class;

public class Info <T> {
     /*
     Параметризируемый класс, каждый раз, когда мы
     будем создавать объект класса Т, класс, указанный
     в generic будет подставляться заместо T
     public class Info <T1,T2,...,Tn> {
     */
    private T value;

    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "class=" + value.getClass() +"; "+
                "value=" + value +
                '}';
    }
}
