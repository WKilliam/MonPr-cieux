package com.teddy.albert.fonction;

public class FonctionHyperbolique extends FonctionBase {

    public double function_Activate(double x){
        return Math.tanh(x);
    }
    public double function_Derivative(double x){
        return 1-(Math.tanh(x)*Math.tanh(x));
    }

}
