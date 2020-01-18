package E.L.I.L.Y.A.MathFile;

import java.util.ArrayList;

public class MathMoyen  {

    private ArrayList<Double>liste2;
    private Double valeur;
    private Double valeur1;


    public void toto(ArrayList<ArrayList<ArrayList<Double>>>poidavant,ArrayList<ArrayList<ArrayList<Double>>>poidchanger,ArrayList<ArrayList<ArrayList<Double>>>biais){

        this.liste2=new ArrayList<>();

        for (int i = 0; i <biais.get(0).size() ; i++) {

            for (int j = 0; j <poidavant.size() ; j++) {

                this.valeur = poidavant.get(i).get(j).get(0);

                this.valeur1 = poidchanger.get(i).get(j).get(0);

                double v = this.valeur - this.valeur1 ;

                this.liste2.add(v);

            }
            int size = this.liste2.size();

            Double additionbiaiscomplet = additionbiaiscomplet(this.liste2);

            double finalevaleur = additionbiaiscomplet / size;

            if (finalevaleur<-1){
                finalevaleur=(-1.d);
            }
            if (finalevaleur>1){
                finalevaleur=(1.d);
            }
            biais.get(0).get(i).set(0,finalevaleur);
            this.liste2.clear();
        }
    }

    private Double additionbiaiscomplet(ArrayList<Double>additionbiaiscomplet){

        this.valeur=0.d;

        for (int i = 0; i <additionbiaiscomplet.size() ; i++) {

            this.valeur=this.valeur + additionbiaiscomplet.get(i);

        }
        return this.valeur;
    }
}
