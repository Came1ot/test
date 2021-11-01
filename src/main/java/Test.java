//1каждую первую букву в строке заглавной (любой длины, кол0-во пробелов как в исходной)

public class Test {
     public String main(String args){
        String output = "";
        String input = "тестовая строка сохранить кол-во пробелов";
        String[] words = input.split(" ");

        for(String word:words){
            String first = word.substring(0,1).toUpperCase();
            String last = word.substring(1, word.length());
            output = first + last;
        }
        System.out.println(output);
        return output;
    }
    String out = main("fdg");
}


