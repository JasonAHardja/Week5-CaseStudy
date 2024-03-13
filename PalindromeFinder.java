import java.util.*;

public class PalindromeFinder<E> implements StackInt<E> {
    private Deque<Character> fillStack(String inputString) {
        Deque<Character> charStack = new ArrayDeque<>();
        for (int i = 0; i < inputString.length(); i++) {
            charStack.push(inputString.charAt(i));
        }
        return charStack;
    }

    private boolean isPalindrome(String inputString) {
        Deque<Character> charStack = fillStack(inputString);
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }
        String reverse = result.toString();
        return inputString.equals(reverse);
    }

    @Override
    public E push(E obj) {
        throw new UnsupportedOperationException("Push operation is not supported in PalindromeFinder.");
    }

    @Override
    public E peek() {
        throw new UnsupportedOperationException("Peek operation is not supported in PalindromeFinder.");
    }

    @Override
    public E pop() {
        throw new UnsupportedOperationException("Pop operation is not supported in PalindromeFinder.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("isEmpty operation is not supported in PalindromeFinder.");
    }

    public static void main(String[] args) {
        PalindromeFinder<Character> palindromeFinder = new PalindromeFinder<>();
        String test1 = "radar";
        String test2 = "hello";

        System.out.println(test1 + " is a palindrome: " + palindromeFinder.isPalindrome(test1));
        System.out.println(test2 + " is a palindrome: " + palindromeFinder.isPalindrome(test2));
    }
}


