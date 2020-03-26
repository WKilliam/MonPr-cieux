package com.teddy.albert.backProg;

import java.util.ArrayList;

public class eErreurTotal {

    private ArrayList<ArrayList<ArrayList<Double>>> liseteErreurTotalNiveau0=new ArrayList<>();
    private ArrayList<ArrayList<Double>> liseteErreurTotalNiveau1=new ArrayList<>();
    private ArrayList<Double> liseteErreurTotalNiveau2;
    private Double erreurTotalNiveau3;

    public ArrayList<ArrayList<ArrayList<Double>>> erreurTotal (ArrayList<ArrayList<ArrayList<Double>>> liseteErreurTotal0,ArrayList<ArrayList<ArrayList<Double>>> liseteErreurTotal1){

        for (int i = 0; i <liseteErreurTotal0.get(0).size() ; i++) {

            double v;

            if(liseteErreurTotal0.get(0).size()==1){

                v = (1 / 2)* (liseteErreurTotal0.get(i).get(0).get(0)-liseteErreurTotal1.get(i).get(0).get(0));

            }else{

                v = (1 / 2)* (liseteErreurTotal0.get(i).get(0).get(0)-liseteErreurTotal1.get(i).get(0).get(0));

            }

        }
        return  liseteErreurTotalNiveau0;
    }

}
