public class Test {
    public static void main(String[] args){
    String output = "";
        String input = "тестовая строка сохранить кол-во пробелов";
        String[] words = input.split(" ");

        for(String word:words){
            String first = word.substring(0,1).toUpperCase();
            String last = word.substring(1, word.length());
            output = output + first + last;
            if(!words[words.length - 1].equals(word)) output += " ";
        }
        System.out.println(output);
    }
}
