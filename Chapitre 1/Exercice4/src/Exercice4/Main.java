package Exercice4; //jamais de chiffre dans les packages!!!!!!!!!!!!!!!!!!!!

public class Main {
    public static void main(String [] args){//args[0] alphabet && args[1] chaine à tester
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String testString = new String();
        testString = "abdac";
        String testString2 = new String();
        testString2 = "bd";
        String newString1 = new String();

        System.out.println("The string testString : " + testString);
        isWellFormed(alphabet.toLowerCase(),testString.toLowerCase());
        System.out.println("The String testString2 : " + testString2);
        isWellFormed(alphabet.toLowerCase(),testString2.toLowerCase());

        System.out.println("The String testString and testString2 are anagrams : " + isAnagram(testString,testString2));

        newString1 = searchAndDelete(testString, testString2);

        System.out.println("New String : " + newString1);
    }

    public static void isWellFormed (String alphabet, String str){
        int count=0;
        int search;

        for(int i=0;i<alphabet.length();i++){
            search = str.indexOf(alphabet.charAt(i)) ;
            while (search >=  0) {
                search = str.indexOf(alphabet.charAt(i), search +  1) ;
                count++;
            }
        }
        if(count < str.length()){
            System.out.println("error!! Certains caractères de la chaine ne font pas partie de l'alphabet");
        }else{
            System.out.println("La chaine de caractère est bien formée");
        }
    }

    public static void rotateLeft(int n, String str){

    }

    public static void rotateRight(int n, String str){

    }

    public static boolean isAnagram(String firstStr, String secondStr){
        int search;
        int count;
        int count2 ;

        for(int i=0;i<firstStr.length();i++){
            count = 0;
            count2 = 0;

            search = firstStr.indexOf(firstStr.charAt(i)) ;
            while (search >=  0) {
                search = firstStr.indexOf(firstStr.charAt(i), search +  1) ;
                count++;
            }

            search = secondStr.indexOf(firstStr.charAt(i)) ;
            while (search >=  0) {
                search = secondStr.indexOf(firstStr.charAt(i), search +  1) ;
                count2++;
            }

            if(count2 != count){
                return false;
            }
        }

        return true;
    }

    public static String searchAndDelete(String firstStr, String strToDelete){
        if(firstStr.contains(strToDelete)){
            return firstStr.replace(strToDelete, "");
        }else {
            return firstStr;
        }
    }
}
