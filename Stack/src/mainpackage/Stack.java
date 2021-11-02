package mainpackage;

public class Stack {
    private ListItem top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(String data){
        ListItem item = new ListItem();
        item.setNext(this.top);
        item.setData(data);
        this.top = item;
        this.size++;
    }

    public ListItem pop(){
        if(this.top == null)
            return null;
        ListItem poppedItem = this.top;
        this.top = top.getNext();
        this.size--;
        return poppedItem;
    }

    public void printItems(){
        if(this.top == null){
            System.out.println("Pino on tyhjä");
            return;
        }
        ListItem item = this.top;
        while(item != null) {
            System.out.println(item);
            item = item.getNext();
        }
    }

    public int size(){
        return this.size;
    }
}
