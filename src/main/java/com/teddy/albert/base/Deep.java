package com.teddy.albert.base;
import com.teddy.albert.conceptionCorp.CorpNeural;
import com.teddy.albert.exception.LongueurException;
import com.teddy.albert.fonction.FonctionBase;
import java.util.ArrayList;

public class Deep {

    /**
     * TU BOSS SUR LE CORPCONCEPTION
     * RESTE LA RETROPROPAGATION A TAFFÉ
     * LA RETROPROPAGATION COUCHE CACHÉ 
     */


    public static void main(String[] args) throws Exception, LongueurException {

        ArrayList<Double> listeSimple = new ArrayList();
        listeSimple.add(2.9);
        listeSimple.add(2.3);

        ArrayList<Double> listeSimple1 = new ArrayList();
        listeSimple1.add(2.d);
        ArrayList<Double> listeSimple2 = new ArrayList();
        listeSimple2.add(3.d);

        ArrayList<ArrayList<Double>> listeSimple3 = new ArrayList();
        listeSimple3.add(listeSimple1);
        listeSimple3.add(listeSimple2);

        ArrayList<ArrayList<ArrayList<Double>>> listeSimple4 = new ArrayList();
        listeSimple4.add(listeSimple3);

        System.out.println(listeSimple4);



        CorpNeural cN = new CorpNeural(new FonctionBase(),listeSimple,3);

        System.out.println(cN.getEgalisateur());
        System.out.println(cN.getCouchePoid());
        System.out.println(cN.getCoucheDeBiais());
        System.out.println(cN.getCoucheDeBiais().get(0).get(0).get(0));
        System.out.println(cN.getCoucheNeuralActivation());
        System.out.println(cN.getCoucheNeuralDerive());


    }
}
