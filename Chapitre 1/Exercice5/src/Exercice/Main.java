package Exercice;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {

        String[] words = { "aas", "ace", "alu", "are", "api", "ays", "bec",
                "bel", "bey", "ben", "boy", "deb", "des", "dom",
                "dot", "daw", "fax", "fan", "faq", "fob", "hem",
                "hop", "man", "mao", "mug","mus", "mie", "sur",
                "dey", "mur"
        };
        String firstWord = new String();
        firstWord="aas";
        ArrayList<String> list = new ArrayList<String>();
        findAllNeighbours(firstWord, list, 0, words);


        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }

    public static void findAllNeighbours(String firstWord, ArrayList<String> list, int size, String[] words){
        int move=0;
        if(isInTabOfString(firstWord,words)){
            list.add(firstWord);
            size++;
        }else{
            System.out.println("le mot n'existe pas dans la liste veuillez en entrer un autre");
            return;
        }


        while(move < size){

            for(int i=0; i<words.length; i++) { //on vérifie si le mot sélectionné a des voisins dans le tableau
                if(isNeighbourh(list.get(move),words[i])){
                    if(!isInListOfString(words[i],list)){ //pour ne pas avoir de doublon dans la liste
                        list.add(words[i]);
                        size++;
                    }
                }
            }
            move++;
        }
    }

    public static boolean isInTabOfString(String word, String[] tab){

        for (int i=0; i<tab.length; i++){
            if(tab[i].equals(word)){
                return true;
            }
        }
        return false;
    }

    public static boolean isInListOfString(String word, ArrayList<String> list){
        for (int i=0; i<list.size(); i++){
            if(list.get(i).equals(word)){
                return true;
            }
        }
        return false;
    }

    public static boolean isNeighbourh(String listWord, String tabWord){
        int errors=0;

        for(int i=0;i<3;i++){
            if(tabWord.charAt(i) != listWord.charAt(i)){
                errors++;
            }
        }

        if(errors > 1){
            return false;
        }

        return true;
    }
}
