import java.util.*;

public class PalindromeEven<E> implements StackInt<E> {
    private List<E> theData;

    public void Main() {
        theData = new ArrayList<>();
    }

    @Override
    public E push(E obj) {
        String str = (String)obj;
        if (str.length() % 2 != 0) {
            str += str.charAt(0);
        }
        for (int i = 0; i < str.length(); i++) {
            theData.add((E)Character.valueOf(str.charAt(i)));
        }
        return obj;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return theData.get(theData.size() - 1);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return theData.remove(theData.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return theData.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (E item : theData) {
            sb.append(item);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main<String> mystackarray = new Main<>();
        mystackarray.push("aBcDeF");
        mystackarray.push("gHiJkL");
        mystackarray.push("mNoPqR");
        mystackarray.pop();
        mystackarray.push("sTuVwX");
        mystackarray.push("yZaBc");
        mystackarray.pop();

        System.out.println("(" + mystackarray.toString() + ")");
    }
}

