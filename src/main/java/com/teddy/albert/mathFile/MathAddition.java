package com.teddy.albert.mathFile;

import java.util.ArrayList;

public class MathAddition {

    private ArrayList<ArrayList<ArrayList<Double>>>listeAAAD;
    private ArrayList<ArrayList<Double>> listeAAD;
    private ArrayList<Double> listeAD;
    private double valeurLADAD;


   public ArrayList<ArrayList<ArrayList<Double>>> Addition_final(ArrayList<ArrayList<ArrayList<Double>>>liste){

       this.listeAD = new ArrayList<>();
       this.listeAAD = new ArrayList<>();
       this.listeAAAD= new ArrayList<>();
       this.valeurLADAD=0;

       for (int i = 0; i <liste.size() ; i++) {


           ArrayList<ArrayList<Double>> listeA_A_D = liste.get(i);


           for (int j = 0; j <listeA_A_D.size() ; j++) {

               this.listeAD = Addition_shere_1(listeA_A_D);

           }

           this.listeAAD.add(this.listeAD);
       }
       this.listeAAAD.add(this.listeAAD);
       return this.listeAAAD;
   }


   private ArrayList<Double> Addition_shere_1(ArrayList<ArrayList<Double>>liste){

       this.valeurLADAD =0;
       this.listeAD = new ArrayList<>();

       for (int i = 0; i <liste.size() ; i++) {

           this.valeurLADAD = this.valeurLADAD + liste.get(i).get(0) ;

       }
       this.listeAD.add(this.valeurLADAD);
       return this.listeAD;
   }

    /**
     * =================================================================================================================
     * @return
     */


}