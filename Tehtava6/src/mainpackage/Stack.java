package mainpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * @author Kimi Huhtala
 */

public class Stack {
    private LinkedList<String> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(String data){
        list.push(data);
    }

    public String pop(){
        try{
            return list.pop();
        }catch (NoSuchElementException e){
            return null;
        }
    }

    public void printItems(){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    public int size(){
        return list.size();
    }
}
