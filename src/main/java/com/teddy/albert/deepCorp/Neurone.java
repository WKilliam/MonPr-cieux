package E.L.I.L.Y.A.DeepCorp;

import E.L.I.L.Y.A.Fonction.FonctionBase;

public class Neurone {

    //type:     //type de la  variable :     //nom de la variable :
    private FonctionBase fonctionUtiliser;
    private double FonctionActivation;
    private double FonctionDerive;


    public Neurone(FonctionBase fonctionUtiliser,
                   double entrerValeur) {

        this.fonctionUtiliser = fonctionUtiliser;
        this.FonctionActivation = this.fonctionUtiliser.function_Activate(entrerValeur);
        this.FonctionDerive=this.fonctionUtiliser.function_Derivative(entrerValeur);

    }

    public double getFonctionActivation() {
        return FonctionActivation;
    }

    public double getFonctionDerive() {
        return FonctionDerive;
    }
}
