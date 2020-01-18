package E.L.I.L.Y.A.DeepCorp;

import E.L.I.L.Y.A.Fonction.FonctionBase;

public class Neurone {

    //type:     //type de la  variable :     //nom de la variable :
    private FonctionBase fonctionUtiliser;
    private double FonctionActivation;


    public Neurone(FonctionBase fonctionUtiliser,
                   double entrerValeur) {

        this.fonctionUtiliser = fonctionUtiliser;
        this.FonctionActivation = this.fonctionUtiliser.function_Activate(entrerValeur);

    }

    public double getFonctionActivation() {
        return FonctionActivation;
    }

}
