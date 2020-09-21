package fr.parisnanterre.miage.rps.model;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Player {
    String nom;
    int score,x;
    List<RPSEnum> collection;
    Random rn = new Random();


    int nbrmouvement;




    public Player(String nom, List<RPSEnum> collection) {
        this.nom = nom;
        this.collection = collection;
    }

    public Player(String nom) {
        this.nom = nom;

        for ( nbrmouvement =0 ; nbrmouvement<=10 ; nbrmouvement++){
            int nbralea = rn.nextInt(3) + 1;

            if (nbralea==0 && collection.contains(RPSEnum.ROCK)){
                x=0;
            }
            else if (nbralea==1 && collection.contains(RPSEnum.PAPER)){
                x=1;
            }
            else if (nbralea==1 && collection.contains(RPSEnum.SCISSORS)){
                x=2;
            }

        }

    }


    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public int getNbrmouvement() {
        return nbrmouvement;
    }


    public RPSEnum getNextMove(){
        int idx = collection.indexOf(RPSEnum.ROCK);
        if (idx < 0 || idx+1 == collection.size()) {
            return null;
        }

        return collection.get(idx + 1);
    }

    public void setScore(int score) {
        this.score = score;
    }
}
