package E.L.I.L.Y.A.Fonction;

public class FonctionSigmoid extends FonctionBase{

    public double function_Activate(double x){
        return (1/(1+((int)Math.exp((-x)))));
    }
}

