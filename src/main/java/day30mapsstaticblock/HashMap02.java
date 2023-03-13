package day30mapsstaticblock;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        String s = "Java, Java, I love Java.";
        System.out.println(getNumOfLetterOccurrence(s));//{a=6, e=1, v=4, I=1, J=3, l=1, o=1}

    }

    //Create a method to display number of occurrences of letters in a sentence
    public static HashMap<String, Integer> getNumOfLetterOccurrence(String s) {
        s = s.replaceAll("[^a-zA-Z]", "");

        HashMap<String, Integer> letterOcc = new HashMap<>();

        String[] letters = s.split("");

        for (String w : letters) {
            Integer numOfOcc = letterOcc.get(w);
            if (numOfOcc == null) {
                letterOcc.put(w, 1);
            } else {
                letterOcc.put(w, numOfOcc + 1);
            }
        }
        return letterOcc;


    }
}
