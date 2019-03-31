package introduction;

public class Main {
    public static void main(String[] args){
        String string = "I am a String, Yes I am";
        System.out.println(string);
        String result = string.replace("I", "you");
        System.out.println(result);

        String alphanum = "addvdaeadsgeEDFESFG";
        System.out.println(alphanum.replaceAll(".", "Y"));
        System.out.println("To do");
        System.out.println("GG");
    	
        String newalString= "asgbdsateeeeeF12sageasgGDFjkll1134";
        System.out.println(newalString.replaceAll("[^ej]", "X"));
        System.out.println(newalString.replaceAll("\\d", "X"));
        System.out.println(newalString.replaceAll("\\D", "X"));
        
        String sentenceString = "I have a pen";
        System.out.println(sentenceString.replaceAll("\\b", "X"));
    }
}
