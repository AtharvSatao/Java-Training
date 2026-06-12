package DAY7.Strings;

public class Demo {
    public static void main(String[] args) {
        String name = "Atharv";
        System.out.println(name);
        String CollageName = new String("MIT");
        System.out.println(CollageName);

        System.out.println(name.length());
        System.out.println(name.charAt(name.length()-1));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.contains("tha"));


        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("v"));

        String name2= "Satao";
        System.out.println(name2.substring(2,4));

        System.out.println( name2.replace("o","v"));

        String str = "Java, Python, C++";
        String arr[] = str.split(",");

        for(int i = 0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }

    }
}
