//few String methods and manupulation
class Main{
    public static void main(String[] args){
        String word1="KarunasrI";
        String word2="AnuragU";
        System.out.println("Length of the string is:- "+word2.length());
        System.out.println("character at 3rd index:- "+word2.charAt(3));
        System.out.println("converting all letters to uppercase:- "+word1.toUpperCase());
        System.out.println("converting all lettrs to lower case:- "+word2.toLowerCase());
        System.out.println("comparing 2 strings:- "+word1.equals(word2));
        System.out.println("comparing,irrespective of upper n lower case:- "+word1.equalsIgnoreCase(word2));
        System.out.println("comparing 2 strings lexicographycally:- "+word1.compareTo(word2));
        String converted=word2.toUpperCase();
        System.out.println(converted);
        System.out.println("index of A in converted string:- "+converted.indexOf('A'));
        System.out.println("index of A fromm last:- "+converted.lastIndexOf('A'));
        System.out.println("checking if the string is empty or not:- "+word1.isEmpty());
        System.out.println("checking the string only contains a blank or not:- "+word1.isBlank());
        System.out.println("trimming any spaACES AND PRINTING IT:- "+word2.trim());
    }
}
