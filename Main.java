import java.util.*;

public class Main<E> implements StackInt<E> {
    private List<E> theData;

    public Main() {
        theData = new ArrayList<>();
    }

    @Override
    public E push(E obj) {
        theData.add(obj);
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
        return theData.toString();
    }

    public static void main(String[] args) {
        Main<String> mystackarray = new Main<>();
        mystackarray.push("A");
        mystackarray.push("B");
        mystackarray.push("C");
        mystackarray.pop();
        mystackarray.push("D");
        mystackarray.push("E");
        mystackarray.pop();

        System.out.println("(" + mystackarray.toString().replaceAll("[\\[\\]]", "") + ")");
    }
}



/*
----------------------------Palindrome--------------------------------------------------------
import java.util.*;

public class Main<E> implements StackInt<E> {
    private Deque<E> charStack; // Changed List<E> to Deque<E>

    public Main() {
        charStack = new ArrayDeque<>(); // Changed to ArrayDeque
    }

----------------------------------Normal------------------------------------------------------
import java.util.*;

public class Main<E> implements StackInt<E> {
    private List<E> theData;

    public Main() {
        theData = new ArrayList<>();
    }

-----------------------------------Palindrome--------------------------------------
    // New method to build the reverse string
    public String buildReverse(String inputString) {
        StringBuilder result = new StringBuilder();
        fillStack(inputString); // Call fillStack to build the stack
        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }
        return result.toString();
    }

    // New method to fill the stack
    private void fillStack(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            charStack.push((E) Character.valueOf(inputString.charAt(i))); // Autoboxing character and pushing onto stack
        }
    }

    // New method to check if a string is a palindrome
    public boolean isPalindrome(String inputString) {
        return inputString.equals(buildReverse(inputString));
    }

    public static void main(String[] args) {
        Main<Character> charStack = new Main<>(); // Changed type to Character

        String testString1 = "radar";
        String testString2 = "hello";

        System.out.println(testString1 + " is a palindrome: " + charStack.isPalindrome(testString1));
        System.out.println(testString2 + " is a palindrome: " + charStack.isPalindrome(testString2));
    }
}

----------------------------------Normal------------------------------------------------------

public static void main(String[] args) {
        Main<String> mystackarray = new Main<>();
        mystackarray.push("A");
        mystackarray.push("B");
        mystackarray.push("C");
        mystackarray.pop();
        mystackarray.push("D");
        mystackarray.push("E");
        mystackarray.pop();

        System.out.println("(" + mystackarray.toString().replaceAll("[\\[\\]]", "") + ")");
    }
}

--------------------------------------Override(Both Same)--------------------------------------------------

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
        return theData.toString();
    }

 */

