package E.L.I.L.Y.A.Fonction;

public class FonctionSigmoid extends FonctionBase{

    public double function_Activate(double x){
        return (1/(1+((int)Math.exp((-x)))));
    }

    public double function_Derivative(double x){
        return (1/(1+((int)Math.exp((-x)))))*(1-(1/(1+((int)Math.exp((-x))))));
    }
}

