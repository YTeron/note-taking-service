public class ForMap<E> {
    E item;

    public void setItem(E item) {
        this.item = item;
    }

    public E getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "предмет " + getItem();
    }
}
