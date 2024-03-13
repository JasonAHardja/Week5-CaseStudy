import java.util.*;

public class PalindromeMultiWords<E> implements StackInt<E> {
    private List<E> theData;

    public void Main() {
        theData = new ArrayList<>();
    }

    @Override
    public E push(E obj) {
        String str = (String)obj;
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
        mystackarray.push("AbCd");
        mystackarray.push("EfGh");
        mystackarray.push("IjKl");
        mystackarray.pop();
        mystackarray.push("MnOp");
        mystackarray.push("QrSt");
        mystackarray.pop();

        System.out.println("(" + mystackarray.toString() + ")");
    }
}

