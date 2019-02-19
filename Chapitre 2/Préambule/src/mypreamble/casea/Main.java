package mypreamble.casea;

public class Main {
   public static void main(String[] args){
       Service compta = new Service("Comptabilité");
       Employe billy = new Employe("Billy", 01, "Stagiaire", compta);
       Employe jean = new Employe("Jean", 01, "Chef Comptabilité", compta);
       Employe arnaud = new Employe("Arnaud", 01, "Alternant", compta);
       Employe alexis = new Employe("Alexis", 01, "Comptable", compta);
       Service com = new Service("Communication");

       System.out.println("service alexis : " + alexis.getService().getName());
       System.out.println(compta.getListEmployee().get(3).getName());
       alexis.removeFromService();
       System.out.println("service alexis : " + alexis.getService());
       alexis.setService(com);
       System.out.println("service alexis : " + alexis.getService().getName());

   }


}
