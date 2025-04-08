public class MyStringList implements StringList {
    private String[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyStringList() {
        this.elements = new String[DEFAULT_CAPACITY];
        this.size = 0;
    }

   
    @Override
    public String remove(int index) {
        String removed = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return removed;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return elements.length;
    }
}
