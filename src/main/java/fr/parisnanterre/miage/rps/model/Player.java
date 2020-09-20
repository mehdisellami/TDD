package fr.parisnanterre.miage.rps.model;

import java.util.List;
import java.util.Random;

public class Player {
    String nom;
    int score,x;
    List<RPSEnum> collection;
    Random rn = new Random();




    public Player(String nom, List<RPSEnum> collection) {
        this.nom = nom;
        this.collection = collection;
    }

    public Player(String nom) {
        this.nom = nom;




        for ( int nbrmouvement =0 ; nbrmouvement<=10 ; nbrmouvement++){
            int nbralea = rn.nextInt(3) + 1;

            if (nbralea==0 && collection.contains(RPSEnum.ROCK)){
                x=0;
            }
            else if (nbralea==1 && collection.contains(RPSEnum.PAPER)){
                x=1;
            }
            else if (nbralea==1 && collection.contains(RPSEnum.PAPER)){
                x=2;
            }



        }








    }










}
