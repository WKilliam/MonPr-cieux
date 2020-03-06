package com.teddy.albert.backProg;

import java.util.ArrayList;

public class FonctionRetropropagation {

    /**
     * Erreur
     */

    private ArrayList<ArrayList<ArrayList<Double>>> liseteErreurTotalNiveau0=new ArrayList<>();
    private ArrayList<ArrayList<Double>> liseteErreurTotalNiveau1=new ArrayList<>();
    private ArrayList<Double> liseteErreurTotalNiveau2;
    private Double erreurTotalNiveau3;

    /**
     * Math
     */

    private ArrayList<ArrayList<ArrayList<Double>>> liseteMathTotalNiveau0=new ArrayList<>();
    private ArrayList<ArrayList<Double>> liseteMathTotalNiveau1=new ArrayList<>();
    private ArrayList<Double> liseteMathTotalNiveau2;
    private Double erreurMathNiveau3;

    /**
     * Math1
     */

    private ArrayList<ArrayList<ArrayList<Double>>> liseteMath1TotalNiveau0=new ArrayList<>();
    private ArrayList<ArrayList<Double>> liseteMath1TotalNiveau1=new ArrayList<>();
    private ArrayList<Double> liseteMath1TotalNiveau2;
    private Double erreurMath1Niveau3;

    /**
     * Math2
     */

    private ArrayList<ArrayList<ArrayList<Double>>> liseteMath2TotalNiveau0=new ArrayList<>();
    private ArrayList<ArrayList<Double>> liseteMath2TotalNiveau1=new ArrayList<>();
    private ArrayList<Double> liseteMath2TotalNiveau2;
    private Double erreurMath2Niveau3;

    /**
     * Poid
     */

    private ArrayList<ArrayList<ArrayList<Double>>> lisetePoidTotalNiveau0=new ArrayList<>();
    private ArrayList<ArrayList<Double>> lisetePoidTotalNiveau1=new ArrayList<>();
    private ArrayList<Double> lisetePoidTotalNiveau2;
    private Double erreurPoidNiveau3;

    public void backPropOutput(ArrayList<ArrayList<ArrayList<Double>>> valeurFonctionOutput,
                               ArrayList<ArrayList<ArrayList<Double>>> valeurBeforeFonction,
                               ArrayList<ArrayList<ArrayList<Double>>> fonctionBeforeFonctionOutput,
                               ArrayList<ArrayList<ArrayList<Double>>> valeurVoulu,
                               ArrayList<ArrayList<ArrayList<Double>>> biaisOutput,
                               ArrayList<ArrayList<ArrayList<Double>>> poidBeforeFonctonction,
                               double tauxApprentissage
                               ){


        ArrayList<ArrayList<ArrayList<Double>>> eElement_1 = fonctionErreur(valeurVoulu, valeurFonctionOutput);
        ArrayList<ArrayList<ArrayList<Double>>> eElement_2 = fonctionMath1(fonctionBeforeFonctionOutput, poidBeforeFonctonction);
        ArrayList<ArrayList<ArrayList<Double>>> eElement_3 = fonctionMath(valeurFonctionOutput, valeurBeforeFonction);

        ArrayList<ArrayList<ArrayList<Double>>> eElement_4 = fonctionMath2(eElement_1, eElement_2, eElement_3);



    }

    /**
     *                  W               -           taux_Apprentissage          *       Math2
     *              (Element_1)                     (Element_2)                         (Element_3)
     *      Math2
     */

    private ArrayList<ArrayList<ArrayList<Double>>> fonctionPoid(ArrayList<ArrayList<ArrayList<Double>>> valeurVoulu,ArrayList<ArrayList<ArrayList<Double>>> valeurSortie,double valeurT){

        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.lisetePoidTotalNiveau1 = fonctionPoidNiveau1(valeurVoulu.get(i), valeurSortie.get(i),valeurT);
        }
        this.lisetePoidTotalNiveau0.add(this.lisetePoidTotalNiveau1);

        return this.lisetePoidTotalNiveau0;
    }

    private ArrayList<ArrayList<Double>> fonctionPoidNiveau1(ArrayList<ArrayList<Double>> valeurVoulu,ArrayList<ArrayList<Double>> valeurSortie,double valeurT){


        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.lisetePoidTotalNiveau2 = fonctionPoidNiveau2(valeurVoulu.get(i), valeurSortie.get(i),valeurT);

            this.lisetePoidTotalNiveau1.add(this.lisetePoidTotalNiveau2);
        }
        return this.lisetePoidTotalNiveau1;

    }

    private ArrayList<Double> fonctionPoidNiveau2(ArrayList<Double> valeurVoulu,ArrayList<Double> valeurSortie,double valeur){

        this.lisetePoidTotalNiveau2=new ArrayList<>(1);

        for (int i = 0; i <valeurSortie.size() ; i++) {

            valeurVoulu.get(i)=valeurVoulu;

        }

        return this.lisetePoidTotalNiveau2;
    }




    /**
     *      dErreurtotal / dFonctionOut * dFonctionOut / dBeforeFonctionOutput * dErreurtotal / dW
     *              (Element_1)                 (Element_2)                         (Element_3)
     *               (Erreur)                    (Math1)                             (Math2)
     *      Math2
     */

    private ArrayList<ArrayList<ArrayList<Double>>> fonctionMath2(ArrayList<ArrayList<ArrayList<Double>>> valeurVoulu,ArrayList<ArrayList<ArrayList<Double>>> valeurSortie,ArrayList<ArrayList<ArrayList<Double>>> valeurT){

        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.liseteMath2TotalNiveau1 = fonctionMath2Niveau1(valeurVoulu.get(i), valeurSortie.get(i),valeurT.get(i));
        }
        this.liseteMath2TotalNiveau0.add(this.liseteMath2TotalNiveau1);

        return this.liseteMath2TotalNiveau0;
    }

    private ArrayList<ArrayList<Double>> fonctionMath2Niveau1(ArrayList<ArrayList<Double>> valeurVoulu,ArrayList<ArrayList<Double>> valeurSortie,ArrayList<ArrayList<Double>> valeurT){


        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.liseteMath2TotalNiveau2 = fonctionMath2Niveau2(valeurVoulu.get(i), valeurSortie.get(i),valeurT.get(i));

            this.liseteMath2TotalNiveau1.add(this.liseteMath2TotalNiveau2);
        }
        return this.liseteMath2TotalNiveau1;

    }

    private ArrayList<Double> fonctionMath2Niveau2(ArrayList<Double> valeurVoulu,ArrayList<Double> valeurSortie,ArrayList<Double> valeur){

        this.liseteMath2TotalNiveau2=new ArrayList<>(1);

        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.erreurMath2Niveau3 = valeurVoulu.get(i)*valeurSortie.get(i)*valeur.get(i);
            this.liseteMath2TotalNiveau2.add(this.erreurMath2Niveau3);

        }

        return this.liseteMath2TotalNiveau2;
    }



    /**
     *      dErreurtotal / dW
     *
     *      Math1
     */


    private ArrayList<ArrayList<ArrayList<Double>>> fonctionMath1(ArrayList<ArrayList<ArrayList<Double>>> valeurVoulu,ArrayList<ArrayList<ArrayList<Double>>> valeurSortie){

        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.liseteMath1TotalNiveau1 = fonctionMath1Niveau1(valeurVoulu.get(i), valeurSortie.get(i));
        }
        this.liseteMath1TotalNiveau0.add(this.liseteMath1TotalNiveau1);

        return this.liseteMath1TotalNiveau0;
    }

    private ArrayList<ArrayList<Double>> fonctionMath1Niveau1(ArrayList<ArrayList<Double>> valeurVoulu,ArrayList<ArrayList<Double>> valeurSortie){


        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.liseteMath1TotalNiveau2 = fonctionMath1Niveau2(valeurVoulu.get(i), valeurSortie.get(i));

            this.liseteMath1TotalNiveau1.add(this.liseteMath1TotalNiveau2);
        }
        return this.liseteMath1TotalNiveau1;

    }

    private ArrayList<Double> fonctionMath1Niveau2(ArrayList<Double> valeurVoulu,ArrayList<Double> valeurSortie){

        this.liseteMath1TotalNiveau2=new ArrayList<>(1);

        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.erreurMath1Niveau3 = 1*valeurVoulu.get(i)*valeurSortie.get(i)*(Math.exp(1-1));
            this.liseteMath1TotalNiveau2.add(this.erreurMath1Niveau3);

        }

        return this.liseteMath1TotalNiveau2;
    }



    /**
     *      dFonctionOut / dBeforeFonctionOutput
     *
     *      Math
     */


    private ArrayList<ArrayList<ArrayList<Double>>> fonctionMath(ArrayList<ArrayList<ArrayList<Double>>> valeurVoulu,ArrayList<ArrayList<ArrayList<Double>>> valeurSortie){

        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.liseteMathTotalNiveau1 = fonctionMathNiveau1(valeurVoulu.get(i), valeurSortie.get(i));
        }
        this.liseteMathTotalNiveau0.add(this.liseteMathTotalNiveau1);

        return this.liseteMathTotalNiveau0;
    }

    private ArrayList<ArrayList<Double>> fonctionMathNiveau1(ArrayList<ArrayList<Double>> valeurVoulu,ArrayList<ArrayList<Double>> valeurSortie){


        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.liseteMathTotalNiveau2 = fonctionMathNiveau2(valeurVoulu.get(i), valeurSortie.get(i));

            this.liseteMathTotalNiveau1.add(this.liseteMathTotalNiveau2);
        }
        return this.liseteMathTotalNiveau1;

    }

    private ArrayList<Double> fonctionMathNiveau2(ArrayList<Double> valeurVoulu,ArrayList<Double> valeurSortie){

        this.liseteMath1TotalNiveau2=new ArrayList<>(1);

        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.erreurMathNiveau3 = (valeurVoulu.get(i)*valeurSortie.get(i));
            this.liseteMathTotalNiveau2.add(this.erreurMathNiveau3);

        }

        return this.liseteMathTotalNiveau2;
    }


    /**
     *      dErreurtotal / dFonctionOut
     *
     *      Erreur
     */

    private ArrayList<ArrayList<ArrayList<Double>>> fonctionErreur(ArrayList<ArrayList<ArrayList<Double>>> valeurVoulu,ArrayList<ArrayList<ArrayList<Double>>> valeurSortie){

        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.liseteErreurTotalNiveau1 = fonctionErreurNiveau1(valeurVoulu.get(i), valeurSortie.get(i));
        }
        this.liseteErreurTotalNiveau0.add(this.liseteErreurTotalNiveau1);

        return this.liseteErreurTotalNiveau0;
    }

    private ArrayList<ArrayList<Double>> fonctionErreurNiveau1(ArrayList<ArrayList<Double>> valeurVoulu,ArrayList<ArrayList<Double>> valeurSortie){


        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.liseteErreurTotalNiveau2 = fonctionErreurNiveau2(valeurVoulu.get(i), valeurSortie.get(i));

            this.liseteErreurTotalNiveau1.add(this.liseteErreurTotalNiveau2);
        }
        return this.liseteErreurTotalNiveau1;

    }

    private ArrayList<Double> fonctionErreurNiveau2(ArrayList<Double> valeurVoulu,ArrayList<Double> valeurSortie){

        this.liseteErreurTotalNiveau2=new ArrayList<>(1);

        for (int i = 0; i <valeurSortie.size() ; i++) {

            this.erreurTotalNiveau3 = -(valeurVoulu.get(i)-valeurSortie.get(i));
            this.liseteErreurTotalNiveau2.add(this.erreurTotalNiveau3);

        }

        return this.liseteMath1TotalNiveau2;
    }


}