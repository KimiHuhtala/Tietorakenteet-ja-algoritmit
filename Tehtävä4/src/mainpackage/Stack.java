package mainpackage;

/**
 * @author Kimi Huhtala
 */

public class Stack {

    private static final int MAX = 100;
    private String[] list;
    private int index;

    public Stack() {
        this.list = new String[MAX];
        this.index = 0;
    }

    public IIterator iterator() {
        return new Iterator(this);
    }

    public void push(String data){
        list[index] = data;
        this.index++;
    }

    public String pop(){
        if(index <= 0)
            return null;
        String poppedItem = list[--index];
        return poppedItem;
    }

    public String peek(){
        return list[index];
    }

    public void printItems(){
        if(list.length == 0){
            System.out.println("Pino on tyhjä");
            return;
        }

        int tempIndex = index;
        while(tempIndex > 0) {
            System.out.println(list[--tempIndex]);
        }
    }

    public String[] getStack(){
        return list;
    }

    public int size(){
        return this.index;
    }
}
