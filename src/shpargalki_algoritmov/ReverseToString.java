package shpargalki_algoritmov;

public class ReverseToString {

    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        String s1 = builder.reverse().toString();
        return s1;
    }
// Такой вариант тоже работает!
    /*StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();*/


    // И еще метот разворота строки! с циклом For!
    /*
    String s = "Hello World!";

    StringBuilder builder = new StringBuilder();
    for ( int i = s.length() - 1; i >= 0; i --) {  ///// Либо ////
    builder.append(s.charAt(i)); ////// builder.append(s).reverse();
}
    System.out.println(builder.toString());

И еще один метод !!! самый бодрый!
/////StringBuilder builder = new StringBuilder(string);
//        for ( int i = string.length() - 1; i >= 0; i-- ) {
//            string = builder.reverse().toString();
//        }
//
//        return string;

    */



}
