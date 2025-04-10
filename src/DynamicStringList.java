public class DynamicStringList implements StringList{
    private String[] elements; // private int[] data, int version
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public DynamicStringList() {
        this.elements = new String[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Method #1
    public String get(int index) // ex. StringList<> myNewList = new StringList<>; --> myNewList.add("hi") --> myNewList.get(0) --> "hi"
    {
        String returnedString = elements[index];

        if (index > 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Out of bounds.");
        }
        
        return returnedString;
    }

    // Method #2
    public void set(int index, String value)
    {
        elements[index] = value;

        if (index > 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Out of bounds.");
        }
    }

    // Method #3
    public void add(String value)
    {
        size++;
        int newLength = elements.length + 1;

        elements[newLength] = value;
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
