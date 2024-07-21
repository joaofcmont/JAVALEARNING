public class Main {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        boolean areEqual = str1.equals(str2); // true, porque o método equals compara o conteúdo das strings
        //falso porque nao apontam para objetos diferentes
        boolean areEqual1= str1 == str2;


        System.out.println(areEqual);
        System.out.println(areEqual1);
    }

}