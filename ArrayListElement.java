package zadacha_2_6_str274;

public class ArrayListElement <E> {

    E value;

    public ArrayListElement (E value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  value.toString();
    }
}
