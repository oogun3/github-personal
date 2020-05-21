import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high-level, object-oriented platform independent language");
        }
        languages.put("python", "An interpreted object-oriented high-level, object-oriented programming language with dynamic semantics");
        languages.put("Algol", "An algorithmic language ");
        languages.put("BASIC", "Beginners all purpose symbolic instruction Code");
        languages.put("Lisp", "Therein lies Madness");

        System.out.println(languages.get("Java"));
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the Map");
        } else {
            languages.put("Java", "We are putting this again to override the initial input");
        }

//    languages.remove("Lisp");
        if (languages.remove("Algol", "An algorithmic language ")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if (languages.replace("Lisp", "This will not work", "An imperative functional programming language")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scala", "This will not be added"));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
