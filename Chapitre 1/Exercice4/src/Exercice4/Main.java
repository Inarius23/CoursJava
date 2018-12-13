package Exercice4;

public class Main {
    public static void main(String [] args){//args[0] alphabet && args[1] chaine à tester
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String testString = new String();
        testString = "abdac";
        String testString2 = new String();
        testString2 = "bd";

        System.out.println("la chaine testString : ");
        isWellFormed(alphabet.toLowerCase(),testString.toLowerCase());
        System.out.println("la chaine testString2 : ");
        isWellFormed(alphabet.toLowerCase(),testString2.toLowerCase());

        System.out.println("les chaines testString et testString2 sont des anagrammes : " + isAnagram(testString,testString2));

        searchAndDelete(testString, testString2);
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

    public static void rotateLeft(String str){

    }

    public static void rotateRight(String str){

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

    public static void searchAndDelete(String firstStr, String strToDelete){
        if(firstStr.contains(strToDelete)){
            System.out.println("ma nouvelle chaine : " + firstStr.replace(strToDelete, ""));
        }else {
            System.out.println("la chaine : \"" + firstStr + "\" n'a pas changé");
        }
    }
}
