package E.L.I.L.Y.A.Base;
import E.L.I.L.Y.A.Exception.LongueurException;
import E.L.I.L.Y.A.Fonction.FonctionSigmoid;
import E.L.I.L.Y.A.Layers.ILayers;
import E.L.I.L.Y.A.Layers.LayerPoid;
import E.L.I.L.Y.A.Layers.LayersNeurone;
import E.L.I.L.Y.A.MathFile.*;
import java.util.ArrayList;

public class Deep {


    public static void main(String[] args) throws Exception, LongueurException {

        ArrayList<Double> listeSimple = new ArrayList();
        listeSimple.add(2.9);
        listeSimple.add(2.3);

        ArrayList<Double> J1 = new ArrayList<>();
        J1.add(1.6);
        ArrayList<Double> J2 = new ArrayList<>();
        J2.add(4.8);
        ArrayList<Double> J3 = new ArrayList<>();
        J3.add(67.2);

        


        EgalisateurEntrer egal1= new EgalisateurEntrer();

        ArrayList<ArrayList<ArrayList<Double>>> egalisateur = egal1.Egalisateur(listeSimple, 3);

        System.out.println(egalisateur);

        ILayers poid1 = new LayerPoid();

        ArrayList<ArrayList<ArrayList<Double>>> listesuperieurppoid = poid1.listesuperieurppoid(egalisateur, 3);

        System.out.println(listesuperieurppoid);

        MathMultiplication multiplication = new MathMultiplication();

        ArrayList<ArrayList<ArrayList<Double>>> arrayLists = multiplication.multiplication_Afinal(egalisateur, listesuperieurppoid);
        System.out.println(arrayLists);

        MathAddition addition = new MathAddition();
        ArrayList<ArrayList<ArrayList<Double>>> arrayLists1 = addition.Addition_final(arrayLists);
        System.out.println(arrayLists1);

        ILayers neuronne = new LayersNeurone();

        ArrayList<ArrayList<ArrayList<Double>>> arrayLists2 = neuronne.createurFinalNeural(arrayLists1, new FonctionSigmoid());
        System.out.println(arrayLists2);













        /*System.out.println("#1 (recupérable) : egalisateur de l'entrer "+ x_adapter_pour_neurone+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> poid_de_la_couche_1 = poid.listesuperieurppoid(x_adapter_pour_neurone, x_adapter_pour_neurone.size());



        ArrayList<ArrayList<ArrayList<Double>>> listefinaliser = creeliste.listefinaliser(poid_de_la_couche_1);




        System.out.println("#2 (modifiable) : poid cree premiére couche "+ poid_de_la_couche_1+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> poid_de_la_couche_1_multiplier = mathmultip.multiplication_Afinal(x_adapter_pour_neurone, poid_de_la_couche_1);

        //System.out.println("#3 : poid de la premiére couche multiplier "+poid_de_la_couche_1_multiplier+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> liste_multiplier_additionner_entre_elle = mathaddit.Addition_final(poid_de_la_couche_1_multiplier);

        //System.out.println("#4 : poid additionner "+liste_multiplier_additionner_entre_elle+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> liste_biais_couche_1 = biais.listesuperieurBiais(liste_multiplier_additionner_entre_elle, liste_multiplier_additionner_entre_elle.size());

        System.out.println("#5 (modifiable) : biais premiere couche "+liste_biais_couche_1+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> liste_biais_et_produit_additionner_couche_1 = between.additionBetweenDoublefinal(liste_multiplier_additionner_entre_elle, liste_biais_couche_1);

        //System.out.println("#6 : biais + neuronne "+liste_biais_et_produit_additionner_couche_1+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> liste_neuronne_premiere_couche = neurone.createurFinalNeural(liste_biais_et_produit_additionner_couche_1, new FonctionSigmoid());

        System.out.println("#7 (recupérable) : valeur neural "+liste_neuronne_premiere_couche+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> liste_egaliser_des_valeur_sortie = begal.createurLiaisonPoidNeural(liste_neuronne_premiere_couche,2);

        System.out.println("#8 : egalisateur centrale "+liste_egaliser_des_valeur_sortie+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> liste_poid_de_la_couche_secondaire = poid2.listesuperieurppoid(liste_egaliser_des_valeur_sortie, 2);






        ArrayList<ArrayList<ArrayList<Double>>> listefinaliser2 = creeliste.listefinaliser(liste_poid_de_la_couche_secondaire);






        System.out.println("#9 (modifiable) : nous avons les poids du milieu "+liste_poid_de_la_couche_secondaire+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> liste_multiplier_poid_neurone_couche_2 = mathmultip.multiplication_Afinal(liste_egaliser_des_valeur_sortie, liste_poid_de_la_couche_secondaire);

        //System.out.println("#10 : liste mutiplier entre poid du mieu "+liste_multiplier_poid_neurone_couche_2+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> liste_additionner_poid_neuronne_couche_2 = mathaddit.Addition_final(liste_multiplier_poid_neurone_couche_2);

        //System.out.println("#11 : nous avons l'adition pour 2 neurone "+liste_additionner_poid_neuronne_couche_2+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> biais_2_couche = biais2.listesuperieurBiais(liste_additionner_poid_neuronne_couche_2, liste_additionner_poid_neuronne_couche_2.size());

        System.out.println("#12 (modifiable) : liste centrale pour biais "+biais_2_couche+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> liste_addition_biais_neural_entrer = between2.additionBetweenDoublefinal(liste_additionner_poid_neuronne_couche_2, biais_2_couche);

        //System.out.println("#13 : liste adition centrale avec biais "+liste_addition_biais_neural_entrer+"\n");

        ArrayList<ArrayList<ArrayList<Double>>> liste_neural_couche_2 = neurone2.createurFinalNeural(liste_addition_biais_neural_entrer, new FonctionHyperbolique());

        System.out.println("#14 (recupérable) : liste x sortie neural final "+liste_neural_couche_2+"\n");

        retro.retropropagation(liste_poid_de_la_couche_secondaire,liste_egaliser_des_valeur_sortie,liste_neural_couche_2,resultat4,0.11);

        System.out.println(liste_poid_de_la_couche_secondaire+"retro"+"\n");

        moyenmath.toto(liste_poid_de_la_couche_secondaire, listefinaliser2, biais_2_couche);

        System.out.println(biais_2_couche);




        */
    }
}
