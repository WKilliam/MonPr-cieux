package E.L.I.L.Y.A.DeepCorp;

import E.L.I.L.Y.A.Fonction.FonctionBase;
import E.L.I.L.Y.A.Fonction.FonctionSigmoid;
import E.L.I.L.Y.A.MathFile.EgalisateurBetweenNeural;
import E.L.I.L.Y.A.MathFile.EgalisateurEntrer;

import java.util.ArrayList;

public class CorpNeural {

    private ArrayList<CoucheNeural> corpNeural;

    public CorpNeural(ArrayList<FonctionBase>fonctionBases,ArrayList<Integer>nombreDeNeuronneParCouche, ArrayList<ArrayList<ArrayList<Double>>>listedentrer, ArrayList<ArrayList<ArrayList<Double>>>listevaleurdesirer) throws Exception {

        this.corpNeural=new ArrayList<>();

        EgalisateurBetweenNeural begal = new EgalisateurBetweenNeural();

        for (int i = 0; i <fonctionBases.size() ; i++) {

            if(this.corpNeural.size()==0){

                CoucheNeural neural1 = new CoucheNeural(fonctionBases.get(i),nombreDeNeuronneParCouche.get(i),listedentrer);

                this.corpNeural.add(neural1);
            }
            else{
                ArrayList<ArrayList<ArrayList<Double>>> arrayLists = begal.createurLiaisonPoidNeural(this.corpNeural.get(0).getListeNeurone(), nombreDeNeuronneParCouche.get(i));
                CoucheNeural neural2 = new CoucheNeural(fonctionBases.get(i),nombreDeNeuronneParCouche.get(i),arrayLists);
                this.corpNeural.add(neural2);
                arrayLists.clear();
            }
        }
    }

    public ArrayList<CoucheNeural> getCorpNeural() {
        return corpNeural;
    }
}
