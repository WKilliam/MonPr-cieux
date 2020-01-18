package E.L.I.L.Y.A.Base;

import E.L.I.L.Y.A.DeepCorp.CorpNeural;
import E.L.I.L.Y.A.DeepCorp.CoucheNeural;
import E.L.I.L.Y.A.Exception.LongueurException;
import E.L.I.L.Y.A.Fonction.FonctionBase;
import E.L.I.L.Y.A.Fonction.FonctionHyperbolique;
import E.L.I.L.Y.A.Fonction.FonctionRelu;
import E.L.I.L.Y.A.Fonction.FonctionSigmoid;
import E.L.I.L.Y.A.Layers.LayerPoid;
import E.L.I.L.Y.A.Layers.LayersBiais;
import E.L.I.L.Y.A.Layers.LayersNeurone;
import E.L.I.L.Y.A.MathFile.*;

import java.util.ArrayList;

public class Deep {


    public static void main(String[] args) throws Exception, LongueurException {

        ArrayList valeurX  = new ArrayList();
        valeurX.add(2.d);
        valeurX.add(4.d);
        valeurX.add(6.d);

        ArrayList<Double> resultat1 = new ArrayList<>();
        resultat1.add(7.d);

        ArrayList<Double> resultat22 = new ArrayList<>();
        resultat22.add(5.d);

        ArrayList<Double> resultat2 = new ArrayList<>();
        resultat2.add(5.d);


        ArrayList<ArrayList<Double>> resultat3 = new ArrayList<>();
        resultat3.add(resultat1);
        resultat3.add(resultat2);
        resultat3.add(resultat22);

        //ArrayList<Double> resultat6 = new ArrayList<>();
        //resultat2.add(5.d);
        //resultat3.add(resultat6);

        ArrayList<ArrayList<ArrayList<Double>>> resultat4 = new ArrayList();
        resultat4.add(resultat3);


        MathMultiplication mathmultip = new MathMultiplication();
        MathAddition mathaddit = new MathAddition();
        MathMoyen moyenmath = new MathMoyen();
        EgalisateurEntrer egal = new EgalisateurEntrer();
        EgalisateurBetweenNeural begal = new EgalisateurBetweenNeural();

        MathAdditionBetween between = new MathAdditionBetween();
        MathAdditionBetween between2 = new MathAdditionBetween();

        LayerPoid poid = new LayerPoid();
        LayerPoid poid2 = new LayerPoid();

        LayersBiais biais = new LayersBiais();
        LayersBiais biais2 = new LayersBiais();

        LayersNeurone neurone =  new LayersNeurone();
        LayersNeurone neurone2 =  new LayersNeurone();

        retropropagation retro = new retropropagation();
        CreateurDeListe creeliste = new CreateurDeListe();

        ArrayList<FonctionBase> fonctionBaseArrayList = new ArrayList<>();
        fonctionBaseArrayList.add(new FonctionSigmoid());
        fonctionBaseArrayList.add(new FonctionSigmoid());
        fonctionBaseArrayList.add(new FonctionSigmoid());

        ArrayList<Integer> nombreneuronne = new ArrayList<>();
        nombreneuronne.add(2);
        nombreneuronne.add(2);
        nombreneuronne.add(4);


        System.out.println(resultat4+"liste visé");

        ArrayList<ArrayList<ArrayList<Double>>> x_adapter_pour_neurone = egal.Egalisateur(valeurX, nombreneuronne.get(0));

        CorpNeural corpneural = new CorpNeural(fonctionBaseArrayList,nombreneuronne,x_adapter_pour_neurone,null);

        System.out.println(corpneural.getCorpNeural().get(0).getListeNeurone()+" neurone de sortie");

        System.out.println(corpneural.getCorpNeural().get(0).getListePoid()+"ici on a les poid a changer ");

        retro.retropropagation(corpneural.getCorpNeural().get(0).getListePoid(),x_adapter_pour_neurone,corpneural.getCorpNeural().get(0).getListeNeurone(),resultat4,0.10);

        System.out.println(corpneural.getCorpNeural().get(0).getListePoid()+"liste changer");







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
