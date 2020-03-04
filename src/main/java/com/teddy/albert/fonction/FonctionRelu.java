package E.L.I.L.Y.A.Fonction;

public class FonctionRelu extends FonctionBase{

    public double function_Activate(double x){
        if(x<0){
            return (0);
        }else {
            return x;
        }
    }
    public double function_Derivative(double x){
        if(x<0){
            return (0);
        }else if(x >= 0) {
            return 1;
        }
        return x;
    }
}
