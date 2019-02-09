
/**
 * Created by leon on 1/29/18.
 */
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean valueIsThere = false;
        for (String str: array) {
            if (str == value) {
                valueIsThere = true;
            }
        }
        return valueIsThere;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] backwards = new String[array.length];
        for (int i = 0; i <array.length; i++) {
            backwards[(array.length - 1) - i] = array[i];
        }
        return backwards;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean palindromic = Arrays.equals(reverse(array), array);
        return palindromic;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean isPangram = false;
        String comboWords = "";
        for (int i = 0; i < array.length; i++){
            comboWords += array[i];
        }        
        comboWords = comboWords.replaceAll(" ", "");
        comboWords = comboWords.toLowerCase();
        char[] allLetters = comboWords.toCharArray();
        Set<Character> alphabet = new HashSet<>();
        for (char x: allLetters){
            alphabet.add(x);
        }
        if (alphabet.size() == 26) {
            isPangram = true;
        }
        return isPangram;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i <array.length; i++) {
            if (array[i].equals(value)){
                count ++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> str = new ArrayList<String>();
        for (int i = 0; i < array.length; i ++) {
            if (array[i].equals(valueToRemove) == false){
            str.add(array[i]);
            }
        }
        int newLength = str.size();
        String [] newArray = str.toArray(new String[newLength]);
        return newArray;
    }

    /**
     * @param array array of strings
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> noDups = new ArrayList<String>();
        noDups.add(array[0]);
        for (int i = 1; i < array.length; i ++) {
            if (array[i].equals(array[i-1]) == false) {
                noDups.add(array[i]);
            }
        }
        int newLength = noDups.size();
        String [] newArray = noDups.toArray(new String[newLength]);
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
    List<String> arrList = new ArrayList<String>();
    String str = array[0];
    for (int i = 1; i < array.length; i ++) {
        if (array[i].equals(array[i-1])) {
            str += array[i];
        } else {
            arrList.add(str);
            str = array[i];
        }
    }
    arrList.add(str);
    String [] packDups = arrList.toArray(new String[arrList.size()]);
    return packDups;   
    }

}
