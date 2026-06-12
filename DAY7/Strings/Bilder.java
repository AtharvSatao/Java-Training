package DAY7.Strings;

public class Bilder {
    public static void main(String[] args) {
        String str="1,2,3,4,5";

        for(int i=1; i<10; i++){
            str= str + 1;
        }
        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        sb.append("ABCDEF");

        System.out.println(sb.capacity());
        for (int i=1; i<10; i++){
            sb.append(i);

        }
        System.out.println(sb);

        sb.delete(2, 4);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.substring(0,3));
    }
}
