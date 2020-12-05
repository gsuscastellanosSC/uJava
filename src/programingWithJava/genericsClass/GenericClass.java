package programingWithJava.genericsClass;

/**
 *
 * @author sc
 */
public class GenericClass<T> {

    private T object;

    public GenericClass(T object) {
        this.object = object;
    }

    public void getType() {
        System.out.println("T is the type: " + object.getClass().getSimpleName());
    }
}
