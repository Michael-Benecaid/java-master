package introduction;

public class Main {
    public static void main(String[] args){
        String string = "I am a String, Yes I am";
        System.out.println(string);
        String result = string.replace("I", "you");
        System.out.println(result);

        String alphanum = "addvdaeadsgeEDFESFG";
        System.out.println(alphanum.replaceAll(".", "Y"));
    }
}
