class Wrapper<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void copyFrom(Wrapper<? extends T> other) {
        this.item = other.getItem();
    }
}