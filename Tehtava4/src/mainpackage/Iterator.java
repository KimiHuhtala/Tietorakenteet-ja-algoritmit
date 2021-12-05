package mainpackage;

/**
 * @author Kimi Huhtala
 */

public class Iterator implements IIterator{

    private Stack stack;
    private int currentIndex;

    public Iterator (Stack stack) {
        this.stack = stack;
        currentIndex = stack.size();
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 1;
    }

    @Override
    public String next() {
        String[] tempStack = stack.getStack();
        return tempStack[--currentIndex];
    }
}
