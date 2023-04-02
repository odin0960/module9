package Collections;

interface OurCollection<E> {
    void clear();

    int size();
}

interface OurList<E> extends OurCollection {
    void add(E e);

    void remove(int index);

    E get(int index);
}

interface OurQueue<E> extends OurCollection {
    E peek();
}