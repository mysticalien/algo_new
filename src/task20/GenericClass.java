package task20;
import java.io.Serializable;

public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T variableT;
    private V variableV;
    private K variableK;

    public GenericClass(T t, V v, K k) {
        this.variableT = t;
        this.variableV = v;
        this.variableK = k;
    }

    public T getVariableT() {
        return variableT;
    }

    public V getVariableV() {
        return variableV;
    }

    public K getVariableK() {
        return variableK;
    }

    public void displayClassNames() {
        System.out.println("Type of variableT: " + variableT.getClass().getSimpleName());
        System.out.println("Type of variableV: " + variableV.getClass().getSimpleName());
        System.out.println("Type of variableK: " + variableK.getClass().getSimpleName());
    }
}
