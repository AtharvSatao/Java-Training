package DAY7.Strings;

public class Vowels {
    public static void main(String[] args) {
        String name = "Atharv Satao";
        
        for (int i = 0; i < name.length(); i++) {

            char ch = Character.toLowerCase(name.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                System.out.println(ch);
            }
        }


    }
}
