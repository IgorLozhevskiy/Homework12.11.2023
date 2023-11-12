import java.util.*;

public class InterviewTasks {
    /**
     * Anagram of a string is another string containing all the symbols
     * from the string, but in different order (see the test cases)
     * @param string
     * @param anagram
     * @return true if the second parameter presents an anagram
     *  of the string from the first parameter, otherwise false
     */
    public static boolean isAnagram(String string, String anagram) {
//		проверка: равна ли длина строки длине анаграммы?
        if (string.length() != anagram.length()) {
            System.out.println("The length of the string is not equal to the length of the anagram");
            return false;
        }
//		Ковертируем строку и анаграмму в два массива чаров:
        char[] str = string.toCharArray();
        char[] anagr = anagram.toCharArray();

//		Сортируем оба массива:
        Arrays.sort(str);
        Arrays.sort(anagr);

//		сравниваем оба массива между собой и возвращаем результат:
        boolean result = Arrays.equals(str, anagr);
        return result;
    }

}
