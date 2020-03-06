package com.teddy.albert.deepCorp;

import com.teddy.albert.fonction.FonctionBase;

public class Neurone {

    //type:     //type de la  variable :     //nom de la variable :
    private FonctionBase fonctionUtiliser;
    private double FonctionActivation;
    private double FonctionDerive;


    public Neurone(FonctionBase fonctionUtiliser,
                   double entrerValeur,int valeurFonction) {

        this.fonctionUtiliser = fonctionUtiliser;

        switch (valeurFonction){

            case 0:
                this.FonctionActivation = this.fonctionUtiliser.function_Activate(entrerValeur);
                break;
            case 1:
                this.FonctionDerive=this.fonctionUtiliser.function_Derivative(entrerValeur);
                break;
            default:
                System.out.println("vous avez entrer une mauvaise valeur entre la dérivé et la fonction");
                break;
        }

    }

    public double getFonctionActivation() {
        return FonctionActivation;
    }

    public double getFonctionDerive() {
        return FonctionDerive;
    }
}
