package domain;

/**
 * Клас що являє собою завдання
 * @author Vlad
 */
public class Exercise {
    
    /**
     * Визначає чи є рядок паліндромом
     * @param text вхідний текст
     * @return логічне значення
     */
    public static boolean Calculate(String text) {
        
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
    
}
