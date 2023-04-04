package Collections;

import java.util.StringJoiner;

public class MyArrayList<E> implements OurList<E> {
    private static final int INIT_SIZE = 8;

    private Object[] data;
    private int index;

    public MyArrayList() {
        data = new Object[INIT_SIZE];
    }

    public void add(E value) {
        if (index >= data.length) {
            resize();
        }
        data[index] = value;
        index++;
    }

    private void resize() {
        int newSize = data.length * 2;
        Object[] newData = new Object[newSize];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    public int size() {
        return index;
    }

    public E get(int i) {
        return (E) data[i];
    }

    public void clear() {
        data = null;
        index = 0;
    }

    public void remove(int i) {
        int newSize = data.length - 1;
        Object[] newData = new Object[newSize];
        System.arraycopy(data, 0, newData, 0, index - 1);
        System.arraycopy(data, i + 1, newData, i, data.length - i - 1);
        data = newData;
        index--;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < index; i++) {
            result.add(data[i].toString());
        }
        return "[" + result + "]";
    }
}
