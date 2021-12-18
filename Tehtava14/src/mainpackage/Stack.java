package mainpackage;

/**
 * @author Kimi Huhtala
 */

public class Stack {
    private ListItem top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void receiveData(String[] data){
        System.out.println("Datasi: ");
        for (String dataPiece : data)
            System.out.print(dataPiece + ", ");
        System.out.println("\n");
        double num1, num2;
        try{
            for (String dataPiece : data){
                switch (dataPiece){
                    case "/":
                        num2 = Double.parseDouble(pop().getData());
                        num1 = Double.parseDouble(pop().getData());
                        System.out.println("Lasketaan: " + num1 + " / " + num2);
                        push(String.valueOf(num1 / num2));
                        break;
                    case "*":
                        num2 = Double.parseDouble(pop().getData());
                        num1 = Double.parseDouble(pop().getData());
                        System.out.println("Lasketaan: " + num1 + " * " + num2);
                        push(String.valueOf(num1 * num2));
                        break;
                    case "+":
                        num2 = Double.parseDouble(pop().getData());
                        num1 = Double.parseDouble(pop().getData());
                        System.out.println("Lasketaan: " + num1 + " + " + num2);
                        push(String.valueOf(num1 + num2));
                        break;
                    case "-":
                        num2 = Double.parseDouble(pop().getData());
                        num1 = Double.parseDouble(pop().getData());
                        System.out.println("Lasketaan: " + num1 + " - " + num2);
                        push(String.valueOf(num1 - num2));
                        break;
                    default:
                        push(dataPiece);
                        break;
                }
            }
            System.out.println("Tulos:");
            printItems();
            pop();
        }catch (Exception e){
            System.out.println("Jokin meni pieleen.");
        }
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
            System.out.println("Pino on tyhjä.");
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
