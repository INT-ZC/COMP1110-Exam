package comp1110.exam;

import java.util.Arrays;

/**
 * COMP1110 Final Exam, Question 4
 */
public class Q4ArrayList<T> {
    private static final int INITIAL_SIZE = 2;
    private static final double GROWTH_FACTOR = 1.5;

    T[] values = (T[]) new Object[INITIAL_SIZE];
    int elements = 0;

    /**
     * Add a value to the tail of the list.
     *
     * @param value The value to be added.
     */
    public void add(T value)
    {
        elements ++;
	    T[] tmp = Arrays.copyOf(values, elements);
	    tmp[elements-1] = value;
		values = tmp;
    }

    /**
     * Remove the value at the specified index from the list.
     *
     * @param index
     */
    public void remove(int index) {
        if (index < 0 || index >= elements)
            throw new IndexOutOfBoundsException();
        
        elements--;
        for(int i = index; i < elements; i++)
            values[i] = values[i+1];
    }

    /**
     * @param index
     * @return The value at the specified index.
     */
    public T get(int index) {
        if (index >= elements || index < 0)
            throw new IndexOutOfBoundsException();
        return values[index];
    }

    /**
     * @return the current size of the list.
     */
    public int size() {
        return elements;
    }

    /**
     * Reverse the order of the elements of the list.
     */
    public void reverse() {
        for (int i = 0; i < elements / 2; i++)
        {
            T tmp = values[i];
            values[i] = values[(elements - 1)-i];
            values[(elements - 1)-i] = tmp;
        }
    }

    /**
     * @return A string representation of the list.
     */
    public String toString() {
        String rtn = "";
        for (int i = 0; i < elements; i++) {
            rtn += ((i != 0) ? " " : "") + values[i];
        }
        return rtn;
    }
}
